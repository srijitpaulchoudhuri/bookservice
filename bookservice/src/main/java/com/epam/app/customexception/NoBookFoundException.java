package com.epam.app.customexception;

public class NoBookFoundException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage() {
		return "No book with this id is present";
	}
	
	
	
}
