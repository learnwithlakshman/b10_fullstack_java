package com.careerit.cbookapp.excpetion;

public class BadCredentialsException extends Exception {

	private static final long serialVersionUID = 1L;

	public BadCredentialsException(String message) {
		super(message);
	}
}
