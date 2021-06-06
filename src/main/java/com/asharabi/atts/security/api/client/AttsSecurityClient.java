package com.asharabi.atts.security.api.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.web.client.RestTemplate;

public class AttsSecurityClient {

	private String url;

	@Autowired
	RestTemplate restTemplate;

	public AttsSecurityClient() {
	}

	public void setUrl(final String url) {
		this.url = url;
	}

	public <T> T getForObject(String url, Class<T> responseType) {
		return restTemplate.getForObject(this.url + url, responseType);
	}

	public <T> T postForObject(String url, @Nullable Object request, Class<T> responseType) {
		return restTemplate.postForObject(this.url + url, request, responseType);
	}

	public void put(String url, Object request) {
		restTemplate.put(this.url + url, request);
	}

	public <T> T patchForObject(String url, Object request, Class<T> responseType) {
		return restTemplate.patchForObject(this.url + url, request, responseType);
	}

	public void delete(String url, Object request) {
		restTemplate.delete(this.url + url, request);
	}

}