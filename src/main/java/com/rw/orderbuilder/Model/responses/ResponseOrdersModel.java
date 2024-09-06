package com.rw.orderbuilder.Model.responses;

import com.rw.orderbuilder.Model.postgres.OrderModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ResponseOrdersModel {
    private String cityName;
    private String startDate;
    private String endDate;
    private List<ResponseOrderModel> orders;

    public ResponseOrdersModel() {}

    public ResponseOrdersModel(String cityName, String startDate, String endDate, List<OrderModel> list){
        this.cityName = cityName;
        this.startDate = startDate;
        this.endDate = endDate;
        ArrayList<OrderModel> orderModels = new ArrayList<>(list);
        ArrayList<ResponseOrderModel> convertedOrdersList = new ArrayList<>();
        for (OrderModel orderModel : orderModels) {
            convertedOrdersList.add(new ResponseOrderModel(orderModel));
        }
        this.orders = convertedOrdersList;
    }

    public String getCityName() {
        return this.cityName;
    }

    public String getStartDate() {
        return this.startDate;
    }

    public String getEndDate() {
        return this.endDate;
    }

    public List<ResponseOrderModel> getOrders() {
        return this.orders;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public void setOrders(List<ResponseOrderModel> orders) {
        this.orders = orders;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ResponseOrdersModel)) return false;
        final ResponseOrdersModel other = (ResponseOrdersModel) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$cityName = this.getCityName();
        final Object other$cityName = other.getCityName();
        if (this$cityName == null ? other$cityName != null : !this$cityName.equals(other$cityName)) return false;
        final Object this$startDate = this.getStartDate();
        final Object other$startDate = other.getStartDate();
        if (this$startDate == null ? other$startDate != null : !this$startDate.equals(other$startDate)) return false;
        final Object this$endDate = this.getEndDate();
        final Object other$endDate = other.getEndDate();
        if (this$endDate == null ? other$endDate != null : !this$endDate.equals(other$endDate)) return false;
        final Object this$orders = this.getOrders();
        final Object other$orders = other.getOrders();
        if (this$orders == null ? other$orders != null : !this$orders.equals(other$orders)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ResponseOrdersModel;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $cityName = this.getCityName();
        result = result * PRIME + ($cityName == null ? 43 : $cityName.hashCode());
        final Object $startDate = this.getStartDate();
        result = result * PRIME + ($startDate == null ? 43 : $startDate.hashCode());
        final Object $endDate = this.getEndDate();
        result = result * PRIME + ($endDate == null ? 43 : $endDate.hashCode());
        final Object $orders = this.getOrders();
        result = result * PRIME + ($orders == null ? 43 : $orders.hashCode());
        return result;
    }

    public String toString() {
        return "RequestModel(cityName=" + this.getCityName() + ", startDate=" + this.getStartDate() + ", endDate=" + this.getEndDate() + ", orders=" + this.getOrders() + ")";
    }
}
