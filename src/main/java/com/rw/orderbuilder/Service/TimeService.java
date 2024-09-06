package com.rw.orderbuilder.Service;

import com.rw.orderbuilder.Model.TimeDataDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TimeService {

    private final RestTemplate restTemplate;

    public TimeService() {
        this.restTemplate = new RestTemplate();
    }

    public TimeDataDTO[] getTimes() {
        String url = "http://nginx:1080/api/aviabit-service/times";
        return restTemplate.getForObject(url, TimeDataDTO[].class);
    }

}