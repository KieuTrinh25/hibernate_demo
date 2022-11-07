package com.springmvc.hibernatedemo.service;

import java.util.List;

import com.springmvc.hibernatedemo.entity.Company;
 
public interface CompanyService {
	public List<Company> getCompany();

	public void saveCompany(Company theCompany);

	public Company getCompany(int theId);

	public void deleteCompany(int theId);
}
