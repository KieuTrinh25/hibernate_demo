package com.springmvc.hibernatedemo.repository;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
 

import java.util.List;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springmvc.hibernatedemo.entity.Company;

@Repository
public class CompanyRepositoryImpl implements CompanyRepository{

	@Autowired
	private SessionFactory sessionFactory; 
	
	@Override
	public List<Company> getCompany() {
		Session session = sessionFactory.getCurrentSession();
		CriteriaBuilder cb = session.getCriteriaBuilder();
		CriteriaQuery<Company> cq = cb.createQuery(Company.class);
		Root<Company> root = cq.from(Company.class);
		cq.select(root);
		Query query = session.createQuery(cq);
		return query.getResultList();
	}

	@Override
	public void saveCompany(Company theCompany) {
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(theCompany);
	}

	@Override
	public Company getCompany(int theId) {
		Session currentSession = sessionFactory.getCurrentSession();
		Company theCustomer = currentSession.get(Company.class, theId);
		return theCustomer;
	}

	@Override
	public void deleteCompany(int theId) {
		Session session = sessionFactory.getCurrentSession();
		Company book = session.byId(Company.class).load(theId);
		session.delete(book);
		
	}

}
