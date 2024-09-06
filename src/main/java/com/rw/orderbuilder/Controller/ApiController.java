package com.rw.orderbuilder.Controller;

import com.rw.orderbuilder.Model.*;
import com.rw.orderbuilder.Model.postgres.OrderModel;
import com.rw.orderbuilder.Model.responses.ResponseOrdersModel;
import com.rw.orderbuilder.Service.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ApiController {
    static Logger logger = LoggerFactory.getLogger(ApiController.class);
    private final ResidenceService residenceService;
    private final TimeService timeService;
    private final PersonnelFlightService personnelFlightService;
    private final OrderModelService orderModelService;

    @Autowired
    public ApiController(ResidenceService residenceService, TimeService timeService, PersonnelFlightService personnelFlightService, OrderModelService orderModelService) {
        this.residenceService = residenceService;
        this.timeService = timeService;
        this.personnelFlightService = personnelFlightService;
        this.orderModelService = orderModelService;
    }

    @GetMapping("/residences")
    public ResidenceModelDTO[] getResidences() {
        return residenceService.getResidences();
    }

    @GetMapping("/times")
    public TimeDataDTO[] getTimes() {
        return timeService.getTimes();
    }

    @GetMapping("/personnel-flights")
    public PersonnelFlightModelDTO[] getPersonnelFlights() {
        return personnelFlightService.getPersonnelFlights();
    }

    @GetMapping("/test")
    public void test (){
        personnelFlightService.runProcessingOrder();
    }

    @GetMapping("/getFlights")
    public ResponseOrdersModel getFlights(
            @RequestParam("cityName") String cityName,
            @RequestParam("startDate") Timestamp startDate,
            @RequestParam("endDate") Timestamp endDate) {
        List<OrderModel> orders = orderModelService.findAllOrderModelByCityNameAndDateLandingCalculationAndEndTime(cityName, startDate, endDate);
        return new ResponseOrdersModel(cityName, startDate.toString(), endDate.toString(), orders);
    }
}