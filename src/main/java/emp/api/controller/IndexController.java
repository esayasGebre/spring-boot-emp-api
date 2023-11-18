package emp.api.controller;

import emp.api.model.Employee;
import emp.api.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@Controller
public class IndexController {

	/**
	 * Retrieve List of Employees
	 */
	@GetMapping(path = "/index", produces = MediaType.APPLICATION_JSON_VALUE)
	public String getAllEmployees() {
		return "emp service running...";
	}

}
