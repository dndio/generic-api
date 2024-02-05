package com.beyn.factubox.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;

@Service
public class ExampleService {
	
	private final ApiService apiService;

    @Autowired
    public ExampleService(ApiService apiService) {
        this.apiService = apiService;
    }

    public String getFactures(String facturierApiUrl) {
    	API<String> apiParcours = new API<>();
        apiParcours.setApiUrl(facturierApiUrl);
        apiParcours.setHttpMethod(HttpMethod.GET);
        apiParcours.setResponseType(String.class);

        return apiService.executeApiCall(apiParcours);
    }
	
}
