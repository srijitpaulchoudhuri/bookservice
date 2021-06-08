package com.epam.app.restcontroller;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ErrorResponseTemplate {
	
	private String message;
	private String details;

}
