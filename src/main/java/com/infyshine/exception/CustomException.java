package com.infyshine.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomException {

	@ExceptionHandler(value = UserNotFoundException.class)
	public ResponseEntity<ErrorResponse> sendResponse(UserNotFoundException ex) {
		ErrorResponse errorResponse = new ErrorResponse();
		errorResponse.setMessage(ex.getMessage());
		errorResponse.setStatus(HttpStatus.BAD_REQUEST);

		return new ResponseEntity<ErrorResponse>(errorResponse, HttpStatus.BAD_REQUEST);

	}

}
