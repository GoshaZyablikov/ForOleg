package com.rw.orderbuilder.Service;

import com.rw.orderbuilder.Model.ResidenceModelDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ResidenceService {

    private final RestTemplate restTemplate;

    public ResidenceService() {
        this.restTemplate = new RestTemplate();
    }

    public ResidenceModelDTO[] getResidences() {
        String url = "http://nginx:1080/api/aviabit-service/residences";
        return restTemplate.getForObject(url, ResidenceModelDTO[].class);
    }
}
