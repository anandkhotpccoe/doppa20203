package com.anand.doppa20203.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anand.doppa20203.entity.Company;
import com.anand.doppa20203.repository.CompanyRepository;
import com.anand.doppa20203.service.CompanyService;


@Service
public class CompanyServiceImpl  implements CompanyService{
	
	
	@Autowired
	private CompanyRepository companyRepo;

	@Override
	public Company addCompany(Company company) {
		
		return companyRepo.save(company);
	}

	@Override
	public Iterable<Company> getByName(String name) {
		Iterable<Company> result = companyRepo.findByNameIgnoreCaseContaining(name);
		return result;
	}

}
