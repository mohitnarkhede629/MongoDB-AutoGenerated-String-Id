package com.technoelevate.mongodb.service;

import static com.technoelevate.mongodb.constants.StringConstants.NAME_OR_EMAIL_WAS_NOT_ENTERED;
import static com.technoelevate.mongodb.constants.StringConstants.TYSS;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.technoelevate.mongodb.customexception.NameAndEmailNullException;
import com.technoelevate.mongodb.dto.EmployeeDto;
import com.technoelevate.mongodb.entity.Employee;
import com.technoelevate.mongodb.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository repo;

	@Autowired
	private SeqGeneratorService sequence;

	@Override
	public Employee saveEmployee(EmployeeDto dto) {
		try {
			if (dto.getName().isEmpty() && dto.getEmail().isEmpty()) {
				throw new NameAndEmailNullException(NAME_OR_EMAIL_WAS_NOT_ENTERED);
			} else {
				Employee employee = new Employee();
				BeanUtils.copyProperties(dto, employee);
				employee.setEmployeeId(TYSS + sequence.getSequenceNumber("TYSS"));
				System.err.println("id "+employee.getEmployeeId());
				return repo.save(employee);

			}

		} catch (NameAndEmailNullException e) {
			throw e;
		} catch (Exception e) {
			throw e;
		}

	}

}
