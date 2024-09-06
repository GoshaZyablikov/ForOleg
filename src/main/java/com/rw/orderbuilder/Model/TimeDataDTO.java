package com.rw.orderbuilder.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class TimeDataDTO {
    @JsonProperty("timeBeforeFlight")
    private int timeBeforeFlight;

    @JsonProperty("timeAfterFlight")
    private int timeAfterFlight;

    @JsonProperty("crewType")
    private int crewType;

    @JsonProperty("plnType")
    private Integer plnType;
}