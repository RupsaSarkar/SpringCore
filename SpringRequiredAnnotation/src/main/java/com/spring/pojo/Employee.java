package com.spring.pojo;

import org.springframework.beans.factory.annotation.Required;

public class Employee {

	private String name;	
	private String designation;
	private String company;

	@Required
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}

	@Required
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getDesignation() {
		return designation;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	public String getCompany() {
		return company;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", designation=" + designation + ", company=" + company + "]";
	}
}