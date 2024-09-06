package com.rw.orderbuilder.Model.responses;

import com.rw.orderbuilder.Model.postgres.OrderModel;

import java.util.Map;

public class ResponseFlightInfoModel {
    private String flightNumberOrigin;
    private String flightNumberDestination;
    private String airportOrigin;
    private String airportDestination;
    private String dateTakeOffOrigin;
    private String timeTakeOffOrigin;
    private String dateTakeOffDestination;
    private String timeTakeOffDestination;

    public ResponseFlightInfoModel(String flightNumberOrigin, String flightNumberDestination, String airportOrigin, String airportDestination, String dateTakeOffOrigin, String timeTakeOffOrigin, String dateTakeOffDestination, String timeTakeOffDestination) {
        this.flightNumberOrigin = flightNumberOrigin;
        this.flightNumberDestination = flightNumberDestination;
        this.airportOrigin = airportOrigin;
        this.airportDestination = airportDestination;
        this.dateTakeOffOrigin = dateTakeOffOrigin;
        this.timeTakeOffOrigin = timeTakeOffOrigin;
        this.dateTakeOffDestination = dateTakeOffDestination;
        this.timeTakeOffDestination = timeTakeOffDestination;
    }

    public ResponseFlightInfoModel() {
    }

    public ResponseFlightInfoModel(OrderModel orderModel) {
        this.flightNumberOrigin = orderModel.getFlightNumber();
        this.flightNumberDestination = orderModel.getFlightNumberArrival();
        this.airportOrigin = orderModel.getAirportOrigin();
        this.airportDestination = orderModel.getAirportDestinationName();
        this.dateTakeOffOrigin = String.valueOf(orderModel.getDateLandingCalculation());
        this.timeTakeOffOrigin = String.valueOf(orderModel.getDateLandingCalculation());
        this.dateTakeOffDestination = String.valueOf(orderModel.getEndTime());
        this.timeTakeOffDestination = String.valueOf(orderModel.getEndTime());
    }

    public ResponseFlightInfoModel(Map<String, Object> flightInfo) {
        this.flightNumberOrigin = (String) flightInfo.get("FlightNumberOrigin");
        this.flightNumberDestination = (String) flightInfo.get("FlightNumberDestination");
        this.airportOrigin = (String) flightInfo.get("AirportOrigin");
        this.airportDestination = (String) flightInfo.get("AirportDestination");
        this.dateTakeOffOrigin = (String) flightInfo.get("DateTakeoffOrigin");
        this.timeTakeOffOrigin = (String) flightInfo.get("TimeTakeoffOrigin");
        this.dateTakeOffDestination = (String) flightInfo.get("DateTakeoffDestination");
        this.timeTakeOffDestination =(String) flightInfo.get("TimeTakeoffDestination");
    }

    public String getFlightNumberOrigin() {
        return this.flightNumberOrigin;
    }

    public String getAirportOrigin() {
        return this.airportOrigin;
    }

    public String getAirportDestination() {
        return this.airportDestination;
    }

    public String getDateTakeOffOrigin() {
        return this.dateTakeOffOrigin;
    }

    public String getTimeTakeOffOrigin() {
        return this.timeTakeOffOrigin;
    }

    public String getDateTakeOffDestination() {
        return this.dateTakeOffDestination;
    }

    public String getTimeTakeOffDestination() {
        return this.timeTakeOffDestination;
    }

    public void setFlightNumberOrigin(String flightNumberOrigin) {
        this.flightNumberOrigin = flightNumberOrigin;
    }

    public void setAirportOrigin(String airportOrigin) {
        this.airportOrigin = airportOrigin;
    }

    public void setAirportDestination(String airportDestination) {
        this.airportDestination = airportDestination;
    }

    public void setDateTakeOffOrigin(String dateTakeOffOrigin) {
        this.dateTakeOffOrigin = dateTakeOffOrigin;
    }

    public void setTimeTakeOffOrigin(String timeTakeOffOrigin) {
        this.timeTakeOffOrigin = timeTakeOffOrigin;
    }

    public void setDateTakeOffDestination(String dateTakeOffDestination) {
        this.dateTakeOffDestination = dateTakeOffDestination;
    }

    public void setTimeTakeOffDestination(String timeTakeOffDestination) {
        this.timeTakeOffDestination = timeTakeOffDestination;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ResponseFlightInfoModel)) return false;
        final ResponseFlightInfoModel other = (ResponseFlightInfoModel) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$flightNumberOrigin = this.getFlightNumberOrigin();
        final Object other$flightNumberOrigin = other.getFlightNumberOrigin();
        if (this$flightNumberOrigin == null ? other$flightNumberOrigin != null : !this$flightNumberOrigin.equals(other$flightNumberOrigin))
            return false;
        final Object this$airportOrigin = this.getAirportOrigin();
        final Object other$airportOrigin = other.getAirportOrigin();
        if (this$airportOrigin == null ? other$airportOrigin != null : !this$airportOrigin.equals(other$airportOrigin))
            return false;
        final Object this$airportDestination = this.getAirportDestination();
        final Object other$airportDestination = other.getAirportDestination();
        if (this$airportDestination == null ? other$airportDestination != null : !this$airportDestination.equals(other$airportDestination))
            return false;
        final Object this$dateTakeOffOrigin = this.getDateTakeOffOrigin();
        final Object other$dateTakeOffOrigin = other.getDateTakeOffOrigin();
        if (this$dateTakeOffOrigin == null ? other$dateTakeOffOrigin != null : !this$dateTakeOffOrigin.equals(other$dateTakeOffOrigin))
            return false;
        final Object this$timeTakeOffOrigin = this.getTimeTakeOffOrigin();
        final Object other$timeTakeOffOrigin = other.getTimeTakeOffOrigin();
        if (this$timeTakeOffOrigin == null ? other$timeTakeOffOrigin != null : !this$timeTakeOffOrigin.equals(other$timeTakeOffOrigin))
            return false;
        final Object this$dateTakeOffDestination = this.getDateTakeOffDestination();
        final Object other$dateTakeOffDestination = other.getDateTakeOffDestination();
        if (this$dateTakeOffDestination == null ? other$dateTakeOffDestination != null : !this$dateTakeOffDestination.equals(other$dateTakeOffDestination))
            return false;
        final Object this$timeTakeOffDestination = this.getTimeTakeOffDestination();
        final Object other$timeTakeOffDestination = other.getTimeTakeOffDestination();
        if (this$timeTakeOffDestination == null ? other$timeTakeOffDestination != null : !this$timeTakeOffDestination.equals(other$timeTakeOffDestination))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ResponseFlightInfoModel;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $flightNumberOrigin = this.getFlightNumberOrigin();
        result = result * PRIME + ($flightNumberOrigin == null ? 43 : $flightNumberOrigin.hashCode());
        final Object $airportOrigin = this.getAirportOrigin();
        result = result * PRIME + ($airportOrigin == null ? 43 : $airportOrigin.hashCode());
        final Object $airportDestination = this.getAirportDestination();
        result = result * PRIME + ($airportDestination == null ? 43 : $airportDestination.hashCode());
        final Object $dateTakeOffOrigin = this.getDateTakeOffOrigin();
        result = result * PRIME + ($dateTakeOffOrigin == null ? 43 : $dateTakeOffOrigin.hashCode());
        final Object $timeTakeOffOrigin = this.getTimeTakeOffOrigin();
        result = result * PRIME + ($timeTakeOffOrigin == null ? 43 : $timeTakeOffOrigin.hashCode());
        final Object $dateTakeOffDestination = this.getDateTakeOffDestination();
        result = result * PRIME + ($dateTakeOffDestination == null ? 43 : $dateTakeOffDestination.hashCode());
        final Object $timeTakeOffDestination = this.getTimeTakeOffDestination();
        result = result * PRIME + ($timeTakeOffDestination == null ? 43 : $timeTakeOffDestination.hashCode());
        return result;
    }

    public String toString() {
        return "FlightInfoModel(flightNumberOrigin=" + this.getFlightNumberOrigin() + ", airportOrigin=" + this.getAirportOrigin() + ", airportDestination=" + this.getAirportDestination() + ", dateTakeOffOrigin=" + this.getDateTakeOffOrigin() + ", timeTakeOffOrigin=" + this.getTimeTakeOffOrigin() + ", dateTakeOffDestination=" + this.getDateTakeOffDestination() + ", timeTakeOffDestination=" + this.getTimeTakeOffDestination() + ")";
    }

    public String getFlightNumberDestination() {
        return this.flightNumberDestination;
    }

    public void setFlightNumberDestination(String flightNumberDestination) {
        this.flightNumberDestination = flightNumberDestination;
    }
}
