package com.anand.doppa20203.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import io.swagger.annotations.ApiModelProperty;

@Entity
public class Company {
	
		@Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long id;

	    @ApiModelProperty(notes = "Name of the Company")
	    private String name;

	    private String city;

	    public Company() {

	    }

	    public Company(Long id, String name, String city) {
	        this.id = id;
	        this.name = name;
	        this.city = city;
	    }

	    public Long getId() {
	        return id;
	    }

	    public void setId(Long id) {
	        this.id = id;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getCity() {
	        return city;
	    }

	    public void setCity(String city) {
	        this.city = city;
	    }

}
