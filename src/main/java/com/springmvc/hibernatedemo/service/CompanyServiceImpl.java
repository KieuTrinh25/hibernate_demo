package com.springmvc.hibernatedemo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmvc.hibernatedemo.entity.Company;
import com.springmvc.hibernatedemo.repository.CompanyRepository;
 

@Service
public class CompanyServiceImpl implements CompanyService{

	@Autowired
	private CompanyRepository companyDAO;
	
	@Override
	@Transactional
	public List<Company> getCompany() {
		// TODO Auto-generated method stub
		return companyDAO.getCompany();
	}

	@Override
	@Transactional
	public void saveCompany(Company theCompany) {
		// TODO Auto-generated method stub
		companyDAO.saveCompany(theCompany);
		
	}

	@Override
	@Transactional
	public Company getCompany(int theId) {
		// TODO Auto-generated method stub
		return companyDAO.getCompany(theId);
	}

	@Override
	@Transactional
	public void deleteCompany(int theId) {
		// TODO Auto-generated method stub
		companyDAO.deleteCompany(theId);
	}

}
