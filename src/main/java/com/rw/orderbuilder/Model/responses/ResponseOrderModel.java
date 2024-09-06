package com.rw.orderbuilder.Model.responses;

import com.rw.orderbuilder.Model.postgres.OrderModel;
import com.rw.orderbuilder.Model.postgres.PersonnelModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ResponseOrderModel {
    private String id;
    private String orderStatus;
    private ResponseFlightInfoModel actualFlightsInfo;
    private ResponseFlightInfoModel outdatedFlightsInfo;
    private List<ResponsePersonalModel> personal;

    public ResponseOrderModel(String id, String orderStatus, ResponseFlightInfoModel actualFlightsInfo, ResponseFlightInfoModel outdatedFlightsInfo, List<ResponsePersonalModel> personal) {
        this.id = id;
        this.orderStatus = orderStatus;
        this.actualFlightsInfo = actualFlightsInfo;
        this.outdatedFlightsInfo = outdatedFlightsInfo;
        this.personal = personal;
    }

    public ResponseOrderModel(OrderModel orderModel) {
        this.id = orderModel.getIdOrder().toString();
        this.orderStatus = orderModel.getStatusId().toString();
        this.actualFlightsInfo = new ResponseFlightInfoModel(orderModel);
        ResponseFlightInfoModel outdated = new ResponseFlightInfoModel();
        outdated.setDateTakeOffDestination(String.valueOf(orderModel.getOldEndTime()));
        outdated.setTimeTakeOffDestination(String.valueOf(orderModel.getOldEndTime()));
        outdated.setAirportOrigin(orderModel.getOldAirportOriginName());
        outdated.setDateTakeOffOrigin(String.valueOf(orderModel.getOldDateLandingCalculation()));
        this.outdatedFlightsInfo = outdated;
        ArrayList<ResponsePersonalModel> personalList = new ArrayList<>();
        List<PersonnelModel> personnelModels = new ArrayList<>(orderModel.getPersonnelModels());
        for (PersonnelModel personnelModel : personnelModels) {
            personalList.add(new ResponsePersonalModel(personnelModel));
        }
        this.personal = personalList;
    }


    public ResponseOrderModel() {
    }
    public String getId() {
        return this.id;
    }

    public String getOrderStatus() {
        return this.orderStatus;
    }

    public ResponseFlightInfoModel getActualFlightsInfo() {
        return this.actualFlightsInfo;
    }

    public ResponseFlightInfoModel getOutdatedFlightsInfo() {
        return this.outdatedFlightsInfo;
    }

    public List<ResponsePersonalModel> getPersonal() {
        return this.personal;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public void setActualFlightsInfo(ResponseFlightInfoModel actualFlightsInfo) {
        this.actualFlightsInfo = actualFlightsInfo;
    }

    public void setOutdatedFlightsInfo(ResponseFlightInfoModel outdatedFlightsInfo) {
        this.outdatedFlightsInfo = outdatedFlightsInfo;
    }

    public void setPersonal(List<ResponsePersonalModel> personal) {
        this.personal = personal;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ResponseOrderModel)) return false;
        final ResponseOrderModel other = (ResponseOrderModel) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$orderStatus = this.getOrderStatus();
        final Object other$orderStatus = other.getOrderStatus();
        if (this$orderStatus == null ? other$orderStatus != null : !this$orderStatus.equals(other$orderStatus))
            return false;
        final Object this$actualFlightsInfo = this.getActualFlightsInfo();
        final Object other$actualFlightsInfo = other.getActualFlightsInfo();
        if (this$actualFlightsInfo == null ? other$actualFlightsInfo != null : !this$actualFlightsInfo.equals(other$actualFlightsInfo))
            return false;
        final Object this$outdatedFlightsInfo = this.getOutdatedFlightsInfo();
        final Object other$outdatedFlightsInfo = other.getOutdatedFlightsInfo();
        if (this$outdatedFlightsInfo == null ? other$outdatedFlightsInfo != null : !this$outdatedFlightsInfo.equals(other$outdatedFlightsInfo))
            return false;
        final Object this$personal = this.getPersonal();
        final Object other$personal = other.getPersonal();
        if (this$personal == null ? other$personal != null : !this$personal.equals(other$personal)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ResponseOrderModel;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $orderStatus = this.getOrderStatus();
        result = result * PRIME + ($orderStatus == null ? 43 : $orderStatus.hashCode());
        final Object $actualFlightsInfo = this.getActualFlightsInfo();
        result = result * PRIME + ($actualFlightsInfo == null ? 43 : $actualFlightsInfo.hashCode());
        final Object $outdatedFlightsInfo = this.getOutdatedFlightsInfo();
        result = result * PRIME + ($outdatedFlightsInfo == null ? 43 : $outdatedFlightsInfo.hashCode());
        final Object $personal = this.getPersonal();
        result = result * PRIME + ($personal == null ? 43 : $personal.hashCode());
        return result;
    }

    public String toString() {
        return "OrderModel(id=" + this.getId() + ", orderStatus=" + this.getOrderStatus() + ", actualFlightsInfo=" + this.getActualFlightsInfo() + ", outdatedFlightsInfo=" + this.getOutdatedFlightsInfo() + ", personal=" + this.getPersonal() + ")";
    }
}
