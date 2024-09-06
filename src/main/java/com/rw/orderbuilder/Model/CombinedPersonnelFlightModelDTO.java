package com.rw.orderbuilder.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.rw.orderbuilder.Model.postgres.OrderModel;
import com.rw.orderbuilder.Model.postgres.PersonnelModel;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class CombinedPersonnelFlightModelDTO {

    @JsonProperty("planFlightAirPortId")
    private Integer planFlightAirPortId;

    @JsonProperty("idPlanFlightAirport")
    private Integer idPlanFlightAirport;

    @JsonProperty("planeTypeId")
    private Short planeTypeId;

    @JsonProperty("cityOriginId")
    private Integer cityOriginId;

    @JsonProperty("cityDestinationId")
    private Integer cityDestinationId;

    @JsonProperty("crewType")
    private Integer crewType;

    @JsonProperty("dateTakeoffReal")
    private Timestamp dateTakeoffReal;

    @JsonProperty("cityName")
    private String cityName;

    @JsonProperty("flightNumber")
    private String flightNumber;

    @JsonProperty("airportOriginId")
    private Short airportOriginId;

    @JsonProperty("airportOriginName") // откуда вылетает в гостиницу
    private String airportOriginName;

    @JsonProperty("airportDestinationName") //где гостиница
    private String airportDestinationName;

    @JsonProperty("dateTakeoffCalculation")
    private Timestamp dateTakeoffCalculation;

    @JsonProperty("dateLandingCalculation")
    private Timestamp dateLandingCalculation;

    @JsonProperty("endTime")
    private Timestamp endTime;

    @JsonProperty("numberFlightArrival")
    private String numberFlightArrival;

    @JsonProperty("NameAirportTo") //куда выелтает после гостиницы
    private Short idFromAirport;

    @JsonProperty("airportOrigin") //откуда вылетает
    private String airportOrigin;

    @JsonProperty("Status")
    private Integer Status;

    @JsonProperty("updateTime")
    private Timestamp updateTime;

    @JsonProperty("createTime")
    private Timestamp createTime;

    @JsonProperty("personnelData")
    private List<PersonnelDataDTO> personnelDatumDTOS;

    public CombinedPersonnelFlightModelDTO(OrderModel o) {
        this.idPlanFlightAirport = o.getIdPlanFlightAirport();
        this.planeTypeId = o.getPlaneTypeId();
        this.cityOriginId = o.getCityOriginId();
        this.cityDestinationId = o.getCityDestinationId();
        this.crewType = o.getCrewType();
        this.dateTakeoffReal = o.getDateTakeoffReal();
        this.cityName = o.getCityName();
        this.flightNumber = o.getFlightNumber();
        this.airportOriginId = o.getAirportOriginId();
        this.airportOriginName = o.getAirportOriginName();
        this.airportDestinationName = o.getAirportDestinationName();
        this.dateTakeoffCalculation = o.getDateTakeoffCalculation();
        this.dateLandingCalculation = o.getDateLandingCalculation();
        this.endTime = o.getEndTime();
        this.numberFlightArrival = o.getFlightNumberArrival();
        this.idFromAirport = o.getAirportOriginId();
        this.airportOrigin = o.getAirportOrigin();
        this.Status = o.getStatusId();
        this.updateTime = o.getUpdateTime();
        this.createTime = o.getCreateTime();
        ArrayList<PersonnelDataDTO> pList = new ArrayList<>();
        for(PersonnelModel p : o.getPersonnelModels()) {
            pList.add(new PersonnelDataDTO(p));
        }
        this.personnelDatumDTOS = pList;
    }

    public Integer getPlanFlightAirPortId() {
        return this.planFlightAirPortId;
    }

    public Integer getIdPlanFlightAirport() {
        return this.idPlanFlightAirport;
    }

    public Short getPlaneTypeId() {
        return this.planeTypeId;
    }

    public Integer getCityOriginId() {
        return this.cityOriginId;
    }

    public Integer getCityDestinationId() {
        return this.cityDestinationId;
    }

    public Integer getCrewType() {
        return this.crewType;
    }

    public Timestamp getDateTakeoffReal() {
        return this.dateTakeoffReal;
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

    public String getNumberFlightArrival() {
        return this.numberFlightArrival;
    }

    public Short getIdFromAirport() {
        return this.idFromAirport;
    }

    public String getAirportOrigin() {
        return this.airportOrigin;
    }

    public Integer getStatus() {
        return this.Status;
    }

    public Timestamp getUpdateTime() {
        return this.updateTime;
    }

    public Timestamp getCreateTime() {
        return this.createTime;
    }

    public List<PersonnelDataDTO> getPersonnelDatumDTOS() {
        return this.personnelDatumDTOS;
    }

    @JsonProperty("planFlightAirPortId")
    public void setPlanFlightAirPortId(Integer planFlightAirPortId) {
        this.planFlightAirPortId = planFlightAirPortId;
    }

    @JsonProperty("idPlanFlightAirport")
    public void setIdPlanFlightAirport(Integer idPlanFlightAirport) {
        this.idPlanFlightAirport = idPlanFlightAirport;
    }

    @JsonProperty("planeTypeId")
    public void setPlaneTypeId(Short planeTypeId) {
        this.planeTypeId = planeTypeId;
    }

    @JsonProperty("cityOriginId")
    public void setCityOriginId(Integer cityOriginId) {
        this.cityOriginId = cityOriginId;
    }

    @JsonProperty("cityDestinationId")
    public void setCityDestinationId(Integer cityDestinationId) {
        this.cityDestinationId = cityDestinationId;
    }

    @JsonProperty("crewType")
    public void setCrewType(Integer crewType) {
        this.crewType = crewType;
    }

    @JsonProperty("dateTakeoffReal")
    public void setDateTakeoffReal(Timestamp dateTakeoffReal) {
        this.dateTakeoffReal = dateTakeoffReal;
    }

    @JsonProperty("cityName")
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    @JsonProperty("flightNumber")
    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    @JsonProperty("airportOriginId")
    public void setAirportOriginId(Short airportOriginId) {
        this.airportOriginId = airportOriginId;
    }

    @JsonProperty("airportOriginName")
    public void setAirportOriginName(String airportOriginName) {
        this.airportOriginName = airportOriginName;
    }

    @JsonProperty("airportDestinationName")
    public void setAirportDestinationName(String airportDestinationName) {
        this.airportDestinationName = airportDestinationName;
    }

    @JsonProperty("dateTakeoffCalculation")
    public void setDateTakeoffCalculation(Timestamp dateTakeoffCalculation) {
        this.dateTakeoffCalculation = dateTakeoffCalculation;
    }

    @JsonProperty("dateLandingCalculation")
    public void setDateLandingCalculation(Timestamp dateLandingCalculation) {
        this.dateLandingCalculation = dateLandingCalculation;
    }

    @JsonProperty("endTime")
    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
    }

    @JsonProperty("numberFlightArrival")
    public void setNumberFlightArrival(String numberFlightArrival) {
        this.numberFlightArrival = numberFlightArrival;
    }

    @JsonProperty("NameAirportTo")
    public void setIdFromAirport(Short idFromAirport) {
        this.idFromAirport = idFromAirport;
    }

    @JsonProperty("airportOrigin")
    public void setAirportOrigin(String airportOrigin) {
        this.airportOrigin = airportOrigin;
    }

    @JsonProperty("Status")
    public void setStatus(Integer Status) {
        this.Status = Status;
    }

    @JsonProperty("updateTime")
    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    @JsonProperty("createTime")
    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @JsonProperty("personnelData")
    public void setPersonnelDatumDTOS(List<PersonnelDataDTO> personnelDatumDTOS) {
        this.personnelDatumDTOS = personnelDatumDTOS;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof CombinedPersonnelFlightModelDTO)) return false;
        final CombinedPersonnelFlightModelDTO other = (CombinedPersonnelFlightModelDTO) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$planFlightAirPortId = this.getPlanFlightAirPortId();
        final Object other$planFlightAirPortId = other.getPlanFlightAirPortId();
        if (this$planFlightAirPortId == null ? other$planFlightAirPortId != null : !this$planFlightAirPortId.equals(other$planFlightAirPortId))
            return false;
        final Object this$idPlanFlightAirport = this.getIdPlanFlightAirport();
        final Object other$idPlanFlightAirport = other.getIdPlanFlightAirport();
        if (this$idPlanFlightAirport == null ? other$idPlanFlightAirport != null : !this$idPlanFlightAirport.equals(other$idPlanFlightAirport))
            return false;
        final Object this$planeTypeId = this.getPlaneTypeId();
        final Object other$planeTypeId = other.getPlaneTypeId();
        if (this$planeTypeId == null ? other$planeTypeId != null : !this$planeTypeId.equals(other$planeTypeId))
            return false;
        final Object this$cityOriginId = this.getCityOriginId();
        final Object other$cityOriginId = other.getCityOriginId();
        if (this$cityOriginId == null ? other$cityOriginId != null : !this$cityOriginId.equals(other$cityOriginId))
            return false;
        final Object this$cityDestinationId = this.getCityDestinationId();
        final Object other$cityDestinationId = other.getCityDestinationId();
        if (this$cityDestinationId == null ? other$cityDestinationId != null : !this$cityDestinationId.equals(other$cityDestinationId))
            return false;
        final Object this$crewType = this.getCrewType();
        final Object other$crewType = other.getCrewType();
        if (this$crewType == null ? other$crewType != null : !this$crewType.equals(other$crewType)) return false;
        final Object this$dateTakeoffReal = this.getDateTakeoffReal();
        final Object other$dateTakeoffReal = other.getDateTakeoffReal();
        if (this$dateTakeoffReal == null ? other$dateTakeoffReal != null : !this$dateTakeoffReal.equals(other$dateTakeoffReal))
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
        final Object this$numberFlightArrival = this.getNumberFlightArrival();
        final Object other$numberFlightArrival = other.getNumberFlightArrival();
        if (this$numberFlightArrival == null ? other$numberFlightArrival != null : !this$numberFlightArrival.equals(other$numberFlightArrival))
            return false;
        final Object this$idFromAirport = this.getIdFromAirport();
        final Object other$idFromAirport = other.getIdFromAirport();
        if (this$idFromAirport == null ? other$idFromAirport != null : !this$idFromAirport.equals(other$idFromAirport))
            return false;
        final Object this$airportOrigin = this.getAirportOrigin();
        final Object other$airportOrigin = other.getAirportOrigin();
        if (this$airportOrigin == null ? other$airportOrigin != null : !this$airportOrigin.equals(other$airportOrigin))
            return false;
        final Object this$Status = this.getStatus();
        final Object other$Status = other.getStatus();
        if (this$Status == null ? other$Status != null : !this$Status.equals(other$Status)) return false;
        final Object this$updateTime = this.getUpdateTime();
        final Object other$updateTime = other.getUpdateTime();
        if (this$updateTime == null ? other$updateTime != null : !this$updateTime.equals(other$updateTime))
            return false;
        final Object this$createTime = this.getCreateTime();
        final Object other$createTime = other.getCreateTime();
        if (this$createTime == null ? other$createTime != null : !this$createTime.equals(other$createTime))
            return false;
        final Object this$personnelDatumDTOS = this.getPersonnelDatumDTOS();
        final Object other$personnelDatumDTOS = other.getPersonnelDatumDTOS();
        if (this$personnelDatumDTOS == null ? other$personnelDatumDTOS != null : !this$personnelDatumDTOS.equals(other$personnelDatumDTOS))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof CombinedPersonnelFlightModelDTO;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $planFlightAirPortId = this.getPlanFlightAirPortId();
        result = result * PRIME + ($planFlightAirPortId == null ? 43 : $planFlightAirPortId.hashCode());
        final Object $idPlanFlightAirport = this.getIdPlanFlightAirport();
        result = result * PRIME + ($idPlanFlightAirport == null ? 43 : $idPlanFlightAirport.hashCode());
        final Object $planeTypeId = this.getPlaneTypeId();
        result = result * PRIME + ($planeTypeId == null ? 43 : $planeTypeId.hashCode());
        final Object $cityOriginId = this.getCityOriginId();
        result = result * PRIME + ($cityOriginId == null ? 43 : $cityOriginId.hashCode());
        final Object $cityDestinationId = this.getCityDestinationId();
        result = result * PRIME + ($cityDestinationId == null ? 43 : $cityDestinationId.hashCode());
        final Object $crewType = this.getCrewType();
        result = result * PRIME + ($crewType == null ? 43 : $crewType.hashCode());
        final Object $dateTakeoffReal = this.getDateTakeoffReal();
        result = result * PRIME + ($dateTakeoffReal == null ? 43 : $dateTakeoffReal.hashCode());
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
        final Object $numberFlightArrival = this.getNumberFlightArrival();
        result = result * PRIME + ($numberFlightArrival == null ? 43 : $numberFlightArrival.hashCode());
        final Object $idFromAirport = this.getIdFromAirport();
        result = result * PRIME + ($idFromAirport == null ? 43 : $idFromAirport.hashCode());
        final Object $airportOrigin = this.getAirportOrigin();
        result = result * PRIME + ($airportOrigin == null ? 43 : $airportOrigin.hashCode());
        final Object $Status = this.getStatus();
        result = result * PRIME + ($Status == null ? 43 : $Status.hashCode());
        final Object $updateTime = this.getUpdateTime();
        result = result * PRIME + ($updateTime == null ? 43 : $updateTime.hashCode());
        final Object $createTime = this.getCreateTime();
        result = result * PRIME + ($createTime == null ? 43 : $createTime.hashCode());
        final Object $personnelDatumDTOS = this.getPersonnelDatumDTOS();
        result = result * PRIME + ($personnelDatumDTOS == null ? 43 : $personnelDatumDTOS.hashCode());
        return result;
    }

    public String toString() {
        return "CombinedPersonnelFlightModelDTO(planFlightAirPortId=" + this.getPlanFlightAirPortId() + ", idPlanFlightAirport=" + this.getIdPlanFlightAirport() + ", planeTypeId=" + this.getPlaneTypeId() + ", cityOriginId=" + this.getCityOriginId() + ", cityDestinationId=" + this.getCityDestinationId() + ", crewType=" + this.getCrewType() + ", dateTakeoffReal=" + this.getDateTakeoffReal() + ", cityName=" + this.getCityName() + ", flightNumber=" + this.getFlightNumber() + ", airportOriginId=" + this.getAirportOriginId() + ", airportOriginName=" + this.getAirportOriginName() + ", airportDestinationName=" + this.getAirportDestinationName() + ", dateTakeoffCalculation=" + this.getDateTakeoffCalculation() + ", dateLandingCalculation=" + this.getDateLandingCalculation() + ", endTime=" + this.getEndTime() + ", numberFlightArrival=" + this.getNumberFlightArrival() + ", idFromAirport=" + this.getIdFromAirport() + ", airportOrigin=" + this.getAirportOrigin() + ", Status=" + this.getStatus() + ", updateTime=" + this.getUpdateTime() + ", createTime=" + this.getCreateTime() + ", personnelDatumDTOS=" + this.getPersonnelDatumDTOS() + ")";
    }
}