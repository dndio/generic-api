package com.beyn.factubox.api;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;

public class API<T> {
	
	private String apiUrl;
    private HttpMethod httpMethod;
    private HttpHeaders headers;
    private Class<T> responseType;
    
    public API() {

	}

    
	public API(String apiUrl, HttpMethod httpMethod, HttpHeaders headers, Class<T> responseType) {
		this.apiUrl = apiUrl;
		this.httpMethod = httpMethod;
		this.headers = headers;
		this.responseType = responseType;
	}


	public String getApiUrl() {
		return apiUrl;
	}


	public void setApiUrl(String apiUrl) {
		this.apiUrl = apiUrl;
	}


	public HttpMethod getHttpMethod() {
		return httpMethod;
	}


	public void setHttpMethod(HttpMethod httpMethod) {
		this.httpMethod = httpMethod;
	}


	public HttpHeaders getHeaders() {
		return headers;
	}


	public void setHeaders(HttpHeaders headers) {
		this.headers = headers;
	}


	public Class<T> getResponseType() {
		return responseType;
	}


	public void setResponseType(Class<T> responseType) {
		this.responseType = responseType;
	}
    
    
}
