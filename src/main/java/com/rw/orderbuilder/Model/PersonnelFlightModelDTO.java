package com.rw.orderbuilder.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import java.sql.Timestamp;

@Data
public class PersonnelFlightModelDTO {

    @JsonProperty("personnelId")
    private Integer personnelId;

    @JsonProperty("planFlightAirPortId")
    private Integer planFlightAirPortId;

    @JsonProperty("personnelFlightId")
    private Integer personnelFlightId;

    @JsonProperty("planeTypeId")
    private Short planeTypeId;

    @JsonProperty("armChairTypeId")
    private Integer armChairTypeId;

    @JsonProperty("crewType")
    private Integer crewType;

    @JsonProperty("dateTakeoffReal")
    private Timestamp dateTakeoffReal;

    @JsonProperty("cityOriginId")
    private Integer cityOriginId;

    @JsonProperty("cityDestinationId")
    private Integer cityDestinationId;

    @JsonProperty("cityName")
    private String cityName;

    @JsonProperty("firstName")
    private String firstName;

    @JsonProperty("lastName")
    private String lastName;

    @JsonProperty("sex")
    private String sex;

    @JsonProperty("phone")
    private String phone;

    @JsonProperty("post")
    private String post;

    @JsonProperty("airportDestinationId")
    private Short airportDestinationId;

    @JsonProperty("flightNumber")
    private String flightNumber;

    @JsonProperty("airportOriginId")
    private Short airportOriginId;

    @JsonProperty("airportOriginName")
    private String airportOriginName;

    @JsonProperty("airportDestinationName")
    private String airportDestinationName;

    @JsonProperty("dateTakeoffCalculation")
    private Timestamp dateTakeoffCalculation;

    @JsonProperty("dateLandingCalculation")
    private Timestamp dateLandingCalculation;

    @JsonProperty("id_PlanFlightAirport")
    private Integer idPlanFlightAirport;

    @JsonProperty("fromAirport")
    private String fromAirport;

    @JsonProperty("numberFlightArrival")
    private String numberFlightArrival;

    @JsonProperty("airportOriginL")
    private String airportOriginL;

    @JsonProperty("endTime")
    private Timestamp endTime;
}
