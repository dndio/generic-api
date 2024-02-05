package com.beyn.factubox.api;

import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class ApiService {
	
	private final RestTemplate restTemplate;

    public ApiService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public <T> T executeApiCall(API<T> apiParcours) {
        ResponseEntity<T> responseEntity = restTemplate.exchange(
                apiParcours.getApiUrl(),
                apiParcours.getHttpMethod(),
                new HttpEntity<>(apiParcours.getHeaders()),
                apiParcours.getResponseType()
        );

        return responseEntity.getBody();
    }
	
}
