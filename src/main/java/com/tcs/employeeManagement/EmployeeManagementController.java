package com.tcs.employeeManagement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class EmployeeManagementController {

	@RequestMapping(value = "/getEmployeeDetails", method = RequestMethod.GET)
	public String employeeDetails() {
		return "getEmployeeDetails";
	}
	
	@RequestMapping(value = "/postEmployeeDetails", method = RequestMethod.GET)
	public String addToEmployeeManagement() {
		return "postEmployeeDetails";
	}
	
}
