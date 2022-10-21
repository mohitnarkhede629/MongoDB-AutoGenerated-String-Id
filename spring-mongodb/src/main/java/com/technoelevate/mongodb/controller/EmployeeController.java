package com.technoelevate.mongodb.controller;

import static com.technoelevate.mongodb.constants.StringConstants.DATA_SAVED_SUCCESSFULLY;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.technoelevate.mongodb.dto.EmployeeDto;
import com.technoelevate.mongodb.response.Response;
import com.technoelevate.mongodb.service.EmployeeService;

@RestController
public class EmployeeController {
	
	
	@Autowired
	private EmployeeService service;
	
	@PostMapping("save")
	public ResponseEntity<Response> saveEmployee(@RequestBody EmployeeDto dto) {
		return new ResponseEntity<>(
				new Response(false, DATA_SAVED_SUCCESSFULLY, service.saveEmployee(dto)), HttpStatus.OK);

	}

}
