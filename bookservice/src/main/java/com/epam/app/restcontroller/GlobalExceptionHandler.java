package com.epam.app.restcontroller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.epam.app.customexception.NoBookFoundException;

@RestControllerAdvice
@RestController
public class GlobalExceptionHandler {

	@ExceptionHandler(NoBookFoundException.class)
	public ResponseEntity<ErrorResponseTemplate> noBookFoundExceptionHandler(NoBookFoundException e){
		ErrorResponseTemplate error = new ErrorResponseTemplate(e.getMessage(), "The id you provided doesn't correspond to any book");
		return new ResponseEntity<>(error,HttpStatus.NOT_FOUND);
	}
}
