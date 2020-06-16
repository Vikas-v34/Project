package com.cg.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.cg.exception.RouteIdNotFoundException;

@RestControllerAdvice
public class ExceptionController {
	

	@ExceptionHandler
	public ResponseEntity<String> handleRouteIdNotFoundException(RouteIdNotFoundException ex) {
		return new ResponseEntity<>(ex.getMessage(),HttpStatus.NOT_FOUND);
	}
	

}
