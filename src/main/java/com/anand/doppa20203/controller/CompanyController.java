package com.anand.doppa20203.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.anand.doppa20203.entity.Company;
import com.anand.doppa20203.service.CompanyService;

@RestController
public class CompanyController {
	
	
	@Autowired
	private CompanyService companyService;
	
	@PostMapping("company")
	public ResponseEntity<Company> add(@RequestBody Company company)
	{
		Company result = companyService.addCompany(company);
		
		return new ResponseEntity<>(company, HttpStatus.CREATED);
	}
	
	@GetMapping("/companies/search/name/{name}")
    public ResponseEntity<?> getByName(@PathVariable(name = "name") String name)
    {
    	Iterable<Company> result = companyService.getByName(name);
    	if(result == null)
    	{
    		return new ResponseEntity<>("No Company Found", HttpStatus.OK);
    	}
    	return new ResponseEntity<>(result, HttpStatus.OK);
    }

}
