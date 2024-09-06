package com.rw.orderbuilder.Service;

import com.rw.orderbuilder.Model.CombinedPersonnelFlightModelDTO;
import com.rw.orderbuilder.Model.postgres.OrderModel;
import com.rw.orderbuilder.Repository.OrderModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;
import java.util.stream.Collectors;

@Service()
public class OrderModelService {
    private final OrderModelRepository orderModelRepository;
    private PersonnelFlightService personnelFlightService;

    @Autowired
    public OrderModelService(OrderModelRepository orderModelRepository) {
        this.orderModelRepository = orderModelRepository;
    }

    public List<CombinedPersonnelFlightModelDTO> findAllByCityNameAndDateLandingCalculationAndEndTime(String cityName, Timestamp dateLanding, Timestamp endTime){
        List<OrderModel> orderModelList = orderModelRepository.findAllByCityNameAndDateLandingCalculationAfterAndDateLandingCalculationBefore(cityName, dateLanding, endTime);
        return orderModelList.stream()
                .map(CombinedPersonnelFlightModelDTO::new)
                .collect(Collectors.toList());
    }

    public OrderModel findOrderByFlightParams(Integer pfaId, Integer idPfa){
        return orderModelRepository.findByPlanFlightAirportIdAndIdPlanFlightAirport(pfaId, idPfa);
    }
    public List<OrderModel> findAllOrderModelByCityNameAndDateLandingCalculationAndEndTime(String cityName, Timestamp dateLanding, Timestamp endTime) {
        return orderModelRepository.findAllByCityNameAndDateLandingCalculationAfterAndDateLandingCalculationBefore(cityName, dateLanding, endTime);
    }
}
