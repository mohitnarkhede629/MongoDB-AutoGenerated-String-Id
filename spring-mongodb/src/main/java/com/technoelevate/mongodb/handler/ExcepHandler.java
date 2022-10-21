package com.technoelevate.mongodb.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import static com.technoelevate.mongodb.constants.StringConstants.SOMETHING_WENT_WRONG;
import com.technoelevate.mongodb.customexception.NameAndEmailNullException;
import com.technoelevate.mongodb.response.Response;

@RestControllerAdvice
public class ExcepHandler {

	

	@ExceptionHandler(NameAndEmailNullException.class)
	public ResponseEntity<Response> nameAndEmailNullException(NameAndEmailNullException e) {

		return new ResponseEntity<>(new Response(true, e.getMessage(), null), HttpStatus.BAD_REQUEST);

	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<Response> exception(Exception e) {
		
		return new ResponseEntity<>(new Response(true, SOMETHING_WENT_WRONG, null), HttpStatus.BAD_REQUEST);
		
	}

}
