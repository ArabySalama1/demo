package com.flairstech.com.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import com.flairstech.com.dto.DemoErrorResponse;
import com.flairstech.com.exception.DatabaseDownException;
import com.flairstech.com.exception.ResourceNotFoundException;

/**
 * The Class ControllerAdvisor.
 */
@ControllerAdvice
public class ControllerAdvisor {

	/**
	 * Handle resource not found exception.
	 *
	 * @param ex      the ex
	 * @param request the request
	 * @return the response entity
	 */
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<Object> handleResourceNotFoundException(ResourceNotFoundException ex, WebRequest request) {

		DemoErrorResponse error = new DemoErrorResponse(HttpStatus.INTERNAL_SERVER_ERROR.value(), ex.getMessage());

		return new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);
	}

	/**
	 * Handle database down exception.
	 *
	 * @param ex      the ex
	 * @param request the request
	 * @return the response entity
	 */
	@ExceptionHandler(DatabaseDownException.class)
	public ResponseEntity<Object> handleDatabaseDownException(DatabaseDownException ex, WebRequest request) {

		DemoErrorResponse error = new DemoErrorResponse(HttpStatus.INTERNAL_SERVER_ERROR.value(), ex.getMessage());

		return new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
