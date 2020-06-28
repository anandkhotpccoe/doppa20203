package com.anand.doppa20203.service;

import com.anand.doppa20203.entity.Company;

public interface CompanyService {
	
	public Company addCompany(Company company);
	
	 public Iterable<Company> getByName(String name);

}
