package emp.api.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import emp.api.exception.NotFoundException;
import emp.api.model.Employee;
import emp.api.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	Logger log = LogManager.getLogger(EmployeeService.class);
	
	@Autowired
	private EmployeeRepository empRepository;
	
	public List<Employee> findAllEmployees() {
		return empRepository.findAll();
	}
	
	public Employee findById(long id) {
		return empRepository.findById(id);
	}

	public void saveEmployee(Employee employee) {
		empRepository.save(employee);
	}

	public void updateEmployee(Employee employee) {
		if (empRepository.existsById(employee.getId())) {
			
			empRepository.save(employee);
		} else {
			log.error("Emp not found...");
			throw new NotFoundException("Employee not found: empID " + employee.getId());
		}
	}

	public boolean isEmployeeExist(Long empId) {
		return empRepository.existsById(empId);
	}
}
