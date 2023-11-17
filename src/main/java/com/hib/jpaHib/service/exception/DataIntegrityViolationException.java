package com.hib.jpaHib.service.exception;

@SuppressWarnings("serial")
public class DataIntegrityViolationException extends RuntimeException{

	public DataIntegrityViolationException(String message) {
		super(message);
	}

}
