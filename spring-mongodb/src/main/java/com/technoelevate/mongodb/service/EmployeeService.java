package com.technoelevate.mongodb.service;

import com.technoelevate.mongodb.dto.EmployeeDto;
import com.technoelevate.mongodb.entity.Employee;

public interface EmployeeService {

	Employee saveEmployee(EmployeeDto dto);

}
