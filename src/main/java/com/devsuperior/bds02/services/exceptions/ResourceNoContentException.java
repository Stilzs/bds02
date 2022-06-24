package com.devsuperior.bds02.services.exceptions;

public class ResourceNoContentException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public ResourceNoContentException(String msg) {
		super(msg);
	}
}
