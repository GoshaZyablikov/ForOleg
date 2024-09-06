package com.rw.orderbuilder.Repository;

import com.rw.orderbuilder.Model.postgres.OrderModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.List;

@Repository
public interface OrderModelRepository extends JpaRepository<OrderModel, Integer> {
    List<OrderModel> findAllByCityNameAndDateLandingCalculationAfterAndDateLandingCalculationBefore(String cityName, Timestamp dateLanding,Timestamp endTime);
    OrderModel findByPlanFlightAirportIdAndIdPlanFlightAirport(Integer planFlightAirportId, Integer idPlanFlightAirport);
}
