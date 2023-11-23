package emp.api.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

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
