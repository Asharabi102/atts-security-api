package com.asharabi.atts.security.api.dto;

import java.io.Serializable;

public class AuthenticationResponse implements Serializable {

	private static final long serialVersionUID = 3815188074358460426L;

	private String jwt;

	public AuthenticationResponse() {
	}

	public AuthenticationResponse(String jwt) {
		this.jwt = jwt;
	}

	public String getJwt() {
		return jwt;
	}
}
