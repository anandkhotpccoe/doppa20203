package com.anand.doppa20203.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.anand.doppa20203.entity.Company;


@Repository
public interface CompanyRepository extends JpaRepository<Company, Long>{
	
	
	
	Iterable<Company> findByNameIgnoreCaseContaining(String name);

}
