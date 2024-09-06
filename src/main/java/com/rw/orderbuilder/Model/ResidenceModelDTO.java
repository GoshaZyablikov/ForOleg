package com.rw.orderbuilder.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.sql.Timestamp;

@Data
public class ResidenceModelDTO {
    @JsonProperty("personnelId")
    private int personnelId;

    @JsonProperty("lastName")
    private String lastName;

    @JsonProperty("firstName")
    private String firstName;

    @JsonProperty("cityId")
    private int cityId;

    @JsonProperty("cityName")
    private String cityName;

    @JsonProperty("residences_date_end")
    private Timestamp residences_date_end;
}