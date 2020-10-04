package com.tcs.employeeManagement;

import java.net.URI;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class EmployeeManagementService {

	private final RestTemplate restTemplate;

	public EmployeeManagementService(RestTemplate rest) {
	  this.restTemplate = rest;
	  }

	@HystrixCommand(fallbackMethod = "reliable")
	public String employeeList() {
		URI uri = URI.create("http://localhost:8090/recommended");

		return this.restTemplate.getForObject(uri, String.class);
	}

	public String reliable() {
		return "The reliable function when employeeList fails";
	}
}
