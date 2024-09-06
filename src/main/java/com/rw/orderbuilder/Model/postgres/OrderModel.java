package com.rw.orderbuilder.Model.postgres;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Orders")
public class OrderModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_order")
    private Integer idOrder;

    @Column(name = "id_plan_flight_airport")
    private Integer idPlanFlightAirport;

    @Column(name = "plan_flight_airport_id")
    private Integer planFlightAirportId;

    @Column(name = "plane_type_id")
    private Short planeTypeId;

    @Column(name = "crew_type")
    private Integer crewType;

    @Column(name = "date_takeoff_real")
    private Timestamp dateTakeoffReal;

    @Column(name = "city_origin_id")
    private Integer cityOriginId;

    @Column(name = "city_destination_id")
    private Integer cityDestinationId;

    @Column(name = "city_name", length = 25)
    private String cityName;

    @Column(name = "flight_number", length = 10)
    private String flightNumber;

    @Column(name = "airport_origin_id")
    private Short airportOriginId;

    @Column(name = "airport_origin_name", length = 100)
    private String airportOriginName;

    @Column(name = "airport_destination_name", length = 100)
    private String airportDestinationName;

    @Column(name = "date_takeoff_calculation")
    private Timestamp dateTakeoffCalculation;

    @Column(name = "date_landing_calculation")
    private Timestamp dateLandingCalculation;

    @Column(name = "end_time")
    private Timestamp endTime;

    @Column(name = "flight_number_arrival", length = 10)
    private String flightNumberArrival;

    @Column(name = "from_airport", length = 100)
    private String fromAirport;

    @Column(name = "airport_origin", length = 100)
    private String airportOrigin;

    @Column(name = "status_id")
    private Integer statusId;

    @Column(name = "create_time")
    private Timestamp createTime;

    @Column(name = "update_time")
    private Timestamp updateTime;

    @Column(name = "old_date_landing_calculation")
    private Timestamp oldDateLandingCalculation;

    @Column(name = "old_end_time")
    private Timestamp oldEndTime;

    @Column(name = "old_airport_origin_id")
    private Short oldAirportOriginId;

    @Column(name = "old_airport_origin_name")
    private String oldAirportOriginName;

    @OneToMany(mappedBy = "orderModel", fetch = FetchType.EAGER,  cascade = CascadeType.ALL, orphanRemoval = true)
    private List<PersonnelModel> personnelModels = new ArrayList<>();

    public OrderModel() {
    }

    public Integer getIdOrder() {
        return this.idOrder;
    }

    public Integer getIdPlanFlightAirport() {
        return this.idPlanFlightAirport;
    }

    public Integer getPlanFlightAirportId() {
        return this.planFlightAirportId;
    }

    public Short getPlaneTypeId() {
        return this.planeTypeId;
    }

    public Integer getCrewType() {
        return this.crewType;
    }

    public Timestamp getDateTakeoffReal() {
        return this.dateTakeoffReal;
    }

    public Integer getCityOriginId() {
        return this.cityOriginId;
    }

    public Integer getCityDestinationId() {
        return this.cityDestinationId;
    }

    public String getCityName() {
        return this.cityName;
    }

    public String getFlightNumber() {
        return this.flightNumber;
    }

    public Short getAirportOriginId() {
        return this.airportOriginId;
    }

    public String getAirportOriginName() {
        return this.airportOriginName;
    }

    public String getAirportDestinationName() {
        return this.airportDestinationName;
    }

    public Timestamp getDateTakeoffCalculation() {
        return this.dateTakeoffCalculation;
    }

    public Timestamp getDateLandingCalculation() {
        return this.dateLandingCalculation;
    }

    public Timestamp getEndTime() {
        return this.endTime;
    }

    public String getFlightNumberArrival() {
        return this.flightNumberArrival;
    }

    public String getFromAirport() {
        return this.fromAirport;
    }

    public String getAirportOrigin() {
        return this.airportOrigin;
    }

    public Integer getStatusId() {
        return this.statusId;
    }

    public Timestamp getCreateTime() {
        return this.createTime;
    }

    public Timestamp getUpdateTime() {
        return this.updateTime;
    }

    public Timestamp getOldDateLandingCalculation() {
        return this.oldDateLandingCalculation;
    }

    public Timestamp getOldEndTime() {
        return this.oldEndTime;
    }

    public Short getOldAirportOriginId() {
        return this.oldAirportOriginId;
    }

    public String getOldAirportOriginName() {
        return this.oldAirportOriginName;
    }

    public List<PersonnelModel> getPersonnelModels() {
        return this.personnelModels;
    }

    public void setIdOrder(Integer idOrder) {
        this.idOrder = idOrder;
    }

    public void setIdPlanFlightAirport(Integer idPlanFlightAirport) {
        this.idPlanFlightAirport = idPlanFlightAirport;
    }

    public void setPlanFlightAirportId(Integer planFlightAirportId) {
        this.planFlightAirportId = planFlightAirportId;
    }

    public void setPlaneTypeId(Short planeTypeId) {
        this.planeTypeId = planeTypeId;
    }

    public void setCrewType(Integer crewType) {
        this.crewType = crewType;
    }

    public void setDateTakeoffReal(Timestamp dateTakeoffReal) {
        this.dateTakeoffReal = dateTakeoffReal;
    }

    public void setCityOriginId(Integer cityOriginId) {
        this.cityOriginId = cityOriginId;
    }

    public void setCityDestinationId(Integer cityDestinationId) {
        this.cityDestinationId = cityDestinationId;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setAirportOriginId(Short airportOriginId) {
        this.airportOriginId = airportOriginId;
    }

    public void setAirportOriginName(String airportOriginName) {
        this.airportOriginName = airportOriginName;
    }

    public void setAirportDestinationName(String airportDestinationName) {
        this.airportDestinationName = airportDestinationName;
    }

    public void setDateTakeoffCalculation(Timestamp dateTakeoffCalculation) {
        this.dateTakeoffCalculation = dateTakeoffCalculation;
    }

    public void setDateLandingCalculation(Timestamp dateLandingCalculation) {
        this.dateLandingCalculation = dateLandingCalculation;
    }

    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
    }

    public void setFlightNumberArrival(String flightNumberArrival) {
        this.flightNumberArrival = flightNumberArrival;
    }

    public void setFromAirport(String fromAirport) {
        this.fromAirport = fromAirport;
    }

    public void setAirportOrigin(String airportOrigin) {
        this.airportOrigin = airportOrigin;
    }

    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    public void setOldDateLandingCalculation(Timestamp oldDateLandingCalculation) {
        this.oldDateLandingCalculation = oldDateLandingCalculation;
    }

    public void setOldEndTime(Timestamp oldEndTime) {
        this.oldEndTime = oldEndTime;
    }

    public void setOldAirportOriginId(Short oldAirportOriginId) {
        this.oldAirportOriginId = oldAirportOriginId;
    }

    public void setOldAirportOriginName(String oldAirportOriginName) {
        this.oldAirportOriginName = oldAirportOriginName;
    }

    public void setPersonnelModels(List<PersonnelModel> personnelModels) {
        this.personnelModels = personnelModels;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof OrderModel)) return false;
        final OrderModel other = (OrderModel) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$idOrder = this.getIdOrder();
        final Object other$idOrder = other.getIdOrder();
        if (this$idOrder == null ? other$idOrder != null : !this$idOrder.equals(other$idOrder)) return false;
        final Object this$idPlanFlightAirport = this.getIdPlanFlightAirport();
        final Object other$idPlanFlightAirport = other.getIdPlanFlightAirport();
        if (this$idPlanFlightAirport == null ? other$idPlanFlightAirport != null : !this$idPlanFlightAirport.equals(other$idPlanFlightAirport))
            return false;
        final Object this$planFlightAirportId = this.getPlanFlightAirportId();
        final Object other$planFlightAirportId = other.getPlanFlightAirportId();
        if (this$planFlightAirportId == null ? other$planFlightAirportId != null : !this$planFlightAirportId.equals(other$planFlightAirportId))
            return false;
        final Object this$planeTypeId = this.getPlaneTypeId();
        final Object other$planeTypeId = other.getPlaneTypeId();
        if (this$planeTypeId == null ? other$planeTypeId != null : !this$planeTypeId.equals(other$planeTypeId))
            return false;
        final Object this$crewType = this.getCrewType();
        final Object other$crewType = other.getCrewType();
        if (this$crewType == null ? other$crewType != null : !this$crewType.equals(other$crewType)) return false;
        final Object this$dateTakeoffReal = this.getDateTakeoffReal();
        final Object other$dateTakeoffReal = other.getDateTakeoffReal();
        if (this$dateTakeoffReal == null ? other$dateTakeoffReal != null : !this$dateTakeoffReal.equals(other$dateTakeoffReal))
            return false;
        final Object this$cityOriginId = this.getCityOriginId();
        final Object other$cityOriginId = other.getCityOriginId();
        if (this$cityOriginId == null ? other$cityOriginId != null : !this$cityOriginId.equals(other$cityOriginId))
            return false;
        final Object this$cityDestinationId = this.getCityDestinationId();
        final Object other$cityDestinationId = other.getCityDestinationId();
        if (this$cityDestinationId == null ? other$cityDestinationId != null : !this$cityDestinationId.equals(other$cityDestinationId))
            return false;
        final Object this$cityName = this.getCityName();
        final Object other$cityName = other.getCityName();
        if (this$cityName == null ? other$cityName != null : !this$cityName.equals(other$cityName)) return false;
        final Object this$flightNumber = this.getFlightNumber();
        final Object other$flightNumber = other.getFlightNumber();
        if (this$flightNumber == null ? other$flightNumber != null : !this$flightNumber.equals(other$flightNumber))
            return false;
        final Object this$airportOriginId = this.getAirportOriginId();
        final Object other$airportOriginId = other.getAirportOriginId();
        if (this$airportOriginId == null ? other$airportOriginId != null : !this$airportOriginId.equals(other$airportOriginId))
            return false;
        final Object this$airportOriginName = this.getAirportOriginName();
        final Object other$airportOriginName = other.getAirportOriginName();
        if (this$airportOriginName == null ? other$airportOriginName != null : !this$airportOriginName.equals(other$airportOriginName))
            return false;
        final Object this$airportDestinationName = this.getAirportDestinationName();
        final Object other$airportDestinationName = other.getAirportDestinationName();
        if (this$airportDestinationName == null ? other$airportDestinationName != null : !this$airportDestinationName.equals(other$airportDestinationName))
            return false;
        final Object this$dateTakeoffCalculation = this.getDateTakeoffCalculation();
        final Object other$dateTakeoffCalculation = other.getDateTakeoffCalculation();
        if (this$dateTakeoffCalculation == null ? other$dateTakeoffCalculation != null : !this$dateTakeoffCalculation.equals(other$dateTakeoffCalculation))
            return false;
        final Object this$dateLandingCalculation = this.getDateLandingCalculation();
        final Object other$dateLandingCalculation = other.getDateLandingCalculation();
        if (this$dateLandingCalculation == null ? other$dateLandingCalculation != null : !this$dateLandingCalculation.equals(other$dateLandingCalculation))
            return false;
        final Object this$endTime = this.getEndTime();
        final Object other$endTime = other.getEndTime();
        if (this$endTime == null ? other$endTime != null : !this$endTime.equals(other$endTime)) return false;
        final Object this$flightNumberArrival = this.getFlightNumberArrival();
        final Object other$flightNumberArrival = other.getFlightNumberArrival();
        if (this$flightNumberArrival == null ? other$flightNumberArrival != null : !this$flightNumberArrival.equals(other$flightNumberArrival))
            return false;
        final Object this$fromAirport = this.getFromAirport();
        final Object other$fromAirport = other.getFromAirport();
        if (this$fromAirport == null ? other$fromAirport != null : !this$fromAirport.equals(other$fromAirport))
            return false;
        final Object this$airportOrigin = this.getAirportOrigin();
        final Object other$airportOrigin = other.getAirportOrigin();
        if (this$airportOrigin == null ? other$airportOrigin != null : !this$airportOrigin.equals(other$airportOrigin))
            return false;
        final Object this$statusId = this.getStatusId();
        final Object other$statusId = other.getStatusId();
        if (this$statusId == null ? other$statusId != null : !this$statusId.equals(other$statusId)) return false;
        final Object this$createTime = this.getCreateTime();
        final Object other$createTime = other.getCreateTime();
        if (this$createTime == null ? other$createTime != null : !this$createTime.equals(other$createTime))
            return false;
        final Object this$updateTime = this.getUpdateTime();
        final Object other$updateTime = other.getUpdateTime();
        if (this$updateTime == null ? other$updateTime != null : !this$updateTime.equals(other$updateTime))
            return false;
        final Object this$oldDateLandingCalculation = this.getOldDateLandingCalculation();
        final Object other$oldDateLandingCalculation = other.getOldDateLandingCalculation();
        if (this$oldDateLandingCalculation == null ? other$oldDateLandingCalculation != null : !this$oldDateLandingCalculation.equals(other$oldDateLandingCalculation))
            return false;
        final Object this$oldEndTime = this.getOldEndTime();
        final Object other$oldEndTime = other.getOldEndTime();
        if (this$oldEndTime == null ? other$oldEndTime != null : !this$oldEndTime.equals(other$oldEndTime))
            return false;
        final Object this$oldAirportOriginId = this.getOldAirportOriginId();
        final Object other$oldAirportOriginId = other.getOldAirportOriginId();
        if (this$oldAirportOriginId == null ? other$oldAirportOriginId != null : !this$oldAirportOriginId.equals(other$oldAirportOriginId))
            return false;
        final Object this$oldAirportOriginName = this.getOldAirportOriginName();
        final Object other$oldAirportOriginName = other.getOldAirportOriginName();
        if (this$oldAirportOriginName == null ? other$oldAirportOriginName != null : !this$oldAirportOriginName.equals(other$oldAirportOriginName))
            return false;
        final Object this$personnelModels = this.getPersonnelModels();
        final Object other$personnelModels = other.getPersonnelModels();
        if (this$personnelModels == null ? other$personnelModels != null : !this$personnelModels.equals(other$personnelModels))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof OrderModel;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $idOrder = this.getIdOrder();
        result = result * PRIME + ($idOrder == null ? 43 : $idOrder.hashCode());
        final Object $idPlanFlightAirport = this.getIdPlanFlightAirport();
        result = result * PRIME + ($idPlanFlightAirport == null ? 43 : $idPlanFlightAirport.hashCode());
        final Object $planFlightAirportId = this.getPlanFlightAirportId();
        result = result * PRIME + ($planFlightAirportId == null ? 43 : $planFlightAirportId.hashCode());
        final Object $planeTypeId = this.getPlaneTypeId();
        result = result * PRIME + ($planeTypeId == null ? 43 : $planeTypeId.hashCode());
        final Object $crewType = this.getCrewType();
        result = result * PRIME + ($crewType == null ? 43 : $crewType.hashCode());
        final Object $dateTakeoffReal = this.getDateTakeoffReal();
        result = result * PRIME + ($dateTakeoffReal == null ? 43 : $dateTakeoffReal.hashCode());
        final Object $cityOriginId = this.getCityOriginId();
        result = result * PRIME + ($cityOriginId == null ? 43 : $cityOriginId.hashCode());
        final Object $cityDestinationId = this.getCityDestinationId();
        result = result * PRIME + ($cityDestinationId == null ? 43 : $cityDestinationId.hashCode());
        final Object $cityName = this.getCityName();
        result = result * PRIME + ($cityName == null ? 43 : $cityName.hashCode());
        final Object $flightNumber = this.getFlightNumber();
        result = result * PRIME + ($flightNumber == null ? 43 : $flightNumber.hashCode());
        final Object $airportOriginId = this.getAirportOriginId();
        result = result * PRIME + ($airportOriginId == null ? 43 : $airportOriginId.hashCode());
        final Object $airportOriginName = this.getAirportOriginName();
        result = result * PRIME + ($airportOriginName == null ? 43 : $airportOriginName.hashCode());
        final Object $airportDestinationName = this.getAirportDestinationName();
        result = result * PRIME + ($airportDestinationName == null ? 43 : $airportDestinationName.hashCode());
        final Object $dateTakeoffCalculation = this.getDateTakeoffCalculation();
        result = result * PRIME + ($dateTakeoffCalculation == null ? 43 : $dateTakeoffCalculation.hashCode());
        final Object $dateLandingCalculation = this.getDateLandingCalculation();
        result = result * PRIME + ($dateLandingCalculation == null ? 43 : $dateLandingCalculation.hashCode());
        final Object $endTime = this.getEndTime();
        result = result * PRIME + ($endTime == null ? 43 : $endTime.hashCode());
        final Object $flightNumberArrival = this.getFlightNumberArrival();
        result = result * PRIME + ($flightNumberArrival == null ? 43 : $flightNumberArrival.hashCode());
        final Object $fromAirport = this.getFromAirport();
        result = result * PRIME + ($fromAirport == null ? 43 : $fromAirport.hashCode());
        final Object $airportOrigin = this.getAirportOrigin();
        result = result * PRIME + ($airportOrigin == null ? 43 : $airportOrigin.hashCode());
        final Object $statusId = this.getStatusId();
        result = result * PRIME + ($statusId == null ? 43 : $statusId.hashCode());
        final Object $createTime = this.getCreateTime();
        result = result * PRIME + ($createTime == null ? 43 : $createTime.hashCode());
        final Object $updateTime = this.getUpdateTime();
        result = result * PRIME + ($updateTime == null ? 43 : $updateTime.hashCode());
        final Object $oldDateLandingCalculation = this.getOldDateLandingCalculation();
        result = result * PRIME + ($oldDateLandingCalculation == null ? 43 : $oldDateLandingCalculation.hashCode());
        final Object $oldEndTime = this.getOldEndTime();
        result = result * PRIME + ($oldEndTime == null ? 43 : $oldEndTime.hashCode());
        final Object $oldAirportOriginId = this.getOldAirportOriginId();
        result = result * PRIME + ($oldAirportOriginId == null ? 43 : $oldAirportOriginId.hashCode());
        final Object $oldAirportOriginName = this.getOldAirportOriginName();
        result = result * PRIME + ($oldAirportOriginName == null ? 43 : $oldAirportOriginName.hashCode());
        final Object $personnelModels = this.getPersonnelModels();
        result = result * PRIME + ($personnelModels == null ? 43 : $personnelModels.hashCode());
        return result;
    }

    public String toString() {
        return "OrderModel(idOrder=" + this.getIdOrder() + ", idPlanFlightAirport=" + this.getIdPlanFlightAirport() + ", planFlightAirportId=" + this.getPlanFlightAirportId() + ", planeTypeId=" + this.getPlaneTypeId() + ", crewType=" + this.getCrewType() + ", dateTakeoffReal=" + this.getDateTakeoffReal() + ", cityOriginId=" + this.getCityOriginId() + ", cityDestinationId=" + this.getCityDestinationId() + ", cityName=" + this.getCityName() + ", flightNumber=" + this.getFlightNumber() + ", airportOriginId=" + this.getAirportOriginId() + ", airportOriginName=" + this.getAirportOriginName() + ", airportDestinationName=" + this.getAirportDestinationName() + ", dateTakeoffCalculation=" + this.getDateTakeoffCalculation() + ", dateLandingCalculation=" + this.getDateLandingCalculation() + ", endTime=" + this.getEndTime() + ", flightNumberArrival=" + this.getFlightNumberArrival() + ", fromAirport=" + this.getFromAirport() + ", airportOrigin=" + this.getAirportOrigin() + ", statusId=" + this.getStatusId() + ", createTime=" + this.getCreateTime() + ", updateTime=" + this.getUpdateTime() + ", oldDateLandingCalculation=" + this.getOldDateLandingCalculation() + ", oldEndTime=" + this.getOldEndTime() + ", oldAirportOriginId=" + this.getOldAirportOriginId() + ", oldAirportOriginName=" + this.getOldAirportOriginName() + ", personnelModels=" + this.getPersonnelModels() + ")";
    }
}