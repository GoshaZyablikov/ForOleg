package com.rw.orderbuilder.Service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rw.orderbuilder.Model.CombinedPersonnelFlightModelDTO;
import com.rw.orderbuilder.Model.PersonnelDataDTO;
import com.rw.orderbuilder.Model.PersonnelFlightModelDTO;
import com.rw.orderbuilder.Model.TimeDataDTO;
import com.rw.orderbuilder.Model.postgres.OrderModel;
import com.rw.orderbuilder.Model.postgres.PersonnelModel;
import com.rw.orderbuilder.Repository.OrderModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestTemplate;

import java.beans.Transient;
import java.sql.Timestamp;
import java.time.*;
import java.util.*;
import java.util.stream.Collectors;

@Service
@EnableScheduling
public class PersonnelFlightService {

    @Autowired
    private OrderModelRepository orderRepository;

    @Autowired
    private OrderModelService orderModelService;

    private static final String API_URL = "http://nginx:1080/api/aviabit-service/lead";
    private final RestTemplate restTemplate;
    private final ObjectMapper objectMapper;
    private final TimeDataDTO timeDataDTO;

    public PersonnelFlightService() {
        this.restTemplate = new RestTemplate();
        this.objectMapper = new ObjectMapper();
        this.timeDataDTO = new TimeDataDTO();
    }

    public PersonnelFlightModelDTO[] getPersonnelFlights() {
        return restTemplate.getForObject(API_URL, PersonnelFlightModelDTO[].class);
    }

    @Scheduled(cron = "30 */5 * * * *")
    //@Transactional
    public void runProcessingOrder() {
        ProcessingOrder();
    }

    public void ProcessingOrder() {
        List<PersonnelFlightModelDTO> personnelFlights = fetchPersonnelFlights();
        Map<String, OrderModel> existingOrdersMap = orderRepository.findAll().stream()
                .collect(Collectors.toMap(order -> order.getPlanFlightAirportId() + "-" + order.getIdPlanFlightAirport(), order -> order));
        Set<String> processedOrdersKeys = new HashSet<>();
        for (PersonnelFlightModelDTO flight : personnelFlights) {
            OrderModel newOrder = getCombinedPersonnelFlight(flight, personnelFlights);
            if (newOrder == null) {
                continue;
            }

            String key = newOrder.getPlanFlightAirportId() + "-" + newOrder.getIdPlanFlightAirport();
            processedOrdersKeys.add(key);

            OrderModel existingOrder = existingOrdersMap.get(key);

            if (existingOrder != null) {
                if (searchChanges(newOrder, existingOrder)) {
                    existingOrder.setStatusId(3);
                    existingOrder.setUpdateTime(getCurrentSystemTime());
                    orderRepository.save(existingOrder);
                }
            } else {
                newOrder.setStatusId(1);
                newOrder.setCreateTime(getCurrentSystemTime());
                orderRepository.save(newOrder);
            }
        }

        for (OrderModel existingOrder : existingOrdersMap.values()) {
            String key = existingOrder.getPlanFlightAirportId() + "-" + existingOrder.getIdPlanFlightAirport();
            if (!processedOrdersKeys.contains(key)) {
                existingOrder.setStatusId(4);
                existingOrder.setUpdateTime(getCurrentSystemTime());
                orderRepository.save(existingOrder);
            }
        }
    }

    public boolean searchChanges(OrderModel flight, OrderModel order) {
        boolean changesDetected = false;

        if (!order.getEndTime().equals(flight.getEndTime())) {
            order.setOldEndTime(order.getEndTime());
            order.setEndTime(flight.getEndTime());
            changesDetected = true;
        }

        if (!order.getDateLandingCalculation().equals(flight.getDateLandingCalculation())) {
            order.setOldDateLandingCalculation(order.getDateLandingCalculation());
            order.setDateLandingCalculation(flight.getDateLandingCalculation());
            changesDetected = true;
        }

        if (!order.getAirportOriginId().equals(flight.getAirportOriginId())) {
            order.setOldAirportOriginId(order.getAirportOriginId());
            order.setOldAirportOriginName(order.getAirportOriginName());
            order.setAirportOriginId(flight.getAirportOriginId());
            order.setAirportOriginName(flight.getAirportOriginName());
            changesDetected = true;
        }
        return changesDetected;
    }

    public OrderModel getCombinedPersonnelFlight(PersonnelFlightModelDTO flight, List<PersonnelFlightModelDTO> allPersonnelFlights) {
        Map<String, OrderModel> mergedFlightMap = new HashMap<>();
        Set<String> uniquePersonnelKeys = new HashSet<>();

        String key = flight.getPlanFlightAirPortId() + "-" + flight.getIdPlanFlightAirport();
        OrderModel orderModel = mergedFlightMap.computeIfAbsent(key, k -> {
            OrderModel om = new OrderModel();
            om.setIdPlanFlightAirport(flight.getIdPlanFlightAirport());
            om.setPlanFlightAirportId(flight.getPlanFlightAirPortId());
            om.setPlaneTypeId(flight.getPlaneTypeId());
            om.setCityOriginId(flight.getCityOriginId());
            om.setCityDestinationId(flight.getCityDestinationId());
            om.setCrewType(flight.getCrewType());
            om.setDateTakeoffReal(flight.getDateTakeoffReal());
            om.setCityName(flight.getCityName());
            om.setFlightNumber(flight.getFlightNumber());
            om.setAirportOriginId(flight.getAirportOriginId());
            om.setAirportOriginName(flight.getAirportOriginName());
            om.setAirportDestinationName(flight.getAirportDestinationName());
            om.setDateTakeoffCalculation(flight.getDateTakeoffCalculation());
            om.setDateLandingCalculation(flight.getDateLandingCalculation());
            om.setEndTime(flight.getEndTime());
            om.setFlightNumberArrival(flight.getNumberFlightArrival());
            om.setFromAirport(flight.getFromAirport());
            om.setAirportOrigin(flight.getAirportOriginL());
            om.setCreateTime(getCurrentSystemTime());
            om.setPersonnelModels(new ArrayList<>());
            om.setStatusId(1);
            return om;
        });

        List<PersonnelFlightModelDTO> relatedPersonnel = allPersonnelFlights.stream()
                .filter(f -> key.equals(f.getPlanFlightAirPortId() + "-" + f.getIdPlanFlightAirport()))
                .collect(Collectors.toList());

        for (PersonnelFlightModelDTO personnel : relatedPersonnel) {
            String personnelKey = personnel.getPersonnelId() + "-" + personnel.getPlanFlightAirPortId();
            if (!uniquePersonnelKeys.contains(personnelKey)) {
                PersonnelModel personnelModel = new PersonnelModel();
                personnelModel.setPersonnelId(personnel.getPersonnelId());
                personnelModel.setFirstName(personnel.getFirstName());
                personnelModel.setLastName(personnel.getLastName());
                personnelModel.setSex(personnel.getSex());
                personnelModel.setPhone(personnel.getPhone());
                personnelModel.setPost(personnel.getPost());

                String roomType = determineRoomType(personnel, allPersonnelFlights);
                personnelModel.setTypeRoom(roomType);

                personnelModel.setOrderModel(orderModel);
                orderModel.getPersonnelModels().add(personnelModel);

                uniquePersonnelKeys.add(personnelKey);
            }
        }

        try {
            double timeDifference = calculateTimeDifference(
                    orderModel.getDateTakeoffReal(),
                    orderModel.getEndTime(),
                    orderModel.getCrewType(),
                    orderModel.getPlaneTypeId()
            );
            if (timeDifference < 4) {
                return null;
            }
        } catch (IllegalArgumentException e) {

            return null;
        }

        return orderModel;
    }

    public static Timestamp getCurrentSystemTime() {
        LocalDateTime localDateTime = LocalDateTime.now();
        ZonedDateTime zonedDateTime = localDateTime.atZone(ZoneId.systemDefault());
        return Timestamp.from(zonedDateTime.toInstant());
    }

    private List<PersonnelFlightModelDTO> fetchPersonnelFlights() {
        try {
            String response = restTemplate.getForObject(API_URL, String.class);
            return objectMapper.readValue(response, new TypeReference<>() {});
        } catch (HttpServerErrorException e) {
            System.err.println("Server error occurred: " + e.getMessage());
            throw new RuntimeException("Server error: " + e.getStatusCode(), e);
        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
            throw new RuntimeException("Failed to fetch or parse personnel flights", e);
        }
    }

    private String determineRoomType(PersonnelFlightModelDTO currentFlight, List<PersonnelFlightModelDTO> allFlights) {
        List<PersonnelFlightModelDTO> sameGenderFlights = allFlights.stream()
                .filter(flight -> "Бортпроводник".equals(flight.getPost()) || "Старший бортпроводник".equals(flight.getPost()))
                .filter(flight -> flight.getPlanFlightAirPortId() != null && flight.getPlanFlightAirPortId().equals(currentFlight.getPlanFlightAirPortId()))
                .filter(flight -> flight.getIdPlanFlightAirport() != null && currentFlight.getIdPlanFlightAirport() != null && flight.getIdPlanFlightAirport().equals(currentFlight.getIdPlanFlightAirport()))
                .filter(flight -> flight.getSex() != null && flight.getSex().equals(currentFlight.getSex()))
                .collect(Collectors.toList());

        sameGenderFlights.sort(Comparator.comparing(PersonnelFlightModelDTO::getPersonnelId));

        int currentIndex = sameGenderFlights.indexOf(currentFlight);

        if (currentIndex % 2 == 0 && currentIndex + 1 < sameGenderFlights.size()) {
            return "ДВУХ";
        } else if (currentIndex % 2 == 1) {
            return "ДВУХ";
        }
        return "ОДН";
    }

    public int getTimeBefore(Integer crewType, Short plnType) {
        List<Integer> specificPlnTypes = Arrays.asList(73, 135, 136, 142);
        if (crewType == 3) {
            return timeDataDTO.getTimeBeforeFlight();
        } else if (crewType == 0 || crewType == 1) {
            if (plnType == null || specificPlnTypes.contains(plnType)) {
                return timeDataDTO.getTimeBeforeFlight();
            }
        }
        return 0;
    }

    public int getTimeAfter(Integer crewType, Short plnType) {
        List<Integer> specificPlnTypes = Arrays.asList(73, 135, 136, 142);
        if (crewType == 3) {
            return 0;
        } else if (crewType == 0 || crewType == 1) {
            if (plnType == null || specificPlnTypes.contains(plnType)) {
                return timeDataDTO.getTimeAfterFlight();
            }
        }
        return 0;
    }

    public double calculateTimeDifference(Timestamp dateTakeoffReal, Timestamp endTime, Integer crewType, Short planeTypeId) {
        if (dateTakeoffReal == null) {
            throw new IllegalArgumentException("dateTakeoffReal cannot be null");
        }
        if (endTime == null) {
            throw new IllegalArgumentException("endTime cannot be null");
        }
        if (crewType == null) {
            crewType = 2;
        }
        if (planeTypeId == null) {
            planeTypeId = 135;
        }

        OffsetDateTime dateTime1 = dateTakeoffReal.toInstant().atOffset(ZoneOffset.UTC)
                .plusSeconds(getTimeBefore(crewType, planeTypeId));
        OffsetDateTime dateTime2 = endTime.toInstant().atOffset(ZoneOffset.UTC)
                .minusSeconds(getTimeAfter(crewType, planeTypeId));

        Duration duration = Duration.between(dateTime1, dateTime2);
        return Math.abs(duration.toSeconds() / 3600.0); // Разница в часах
    }

}