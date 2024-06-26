package com.SpringBootProject.CustomerRelationshipManagement.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.SpringBootProject.CustomerRelationshipManagement.dao.CustomerDao;
import com.SpringBootProject.CustomerRelationshipManagement.entity.Customer;
import com.SpringBootProject.CustomerRelationshipManagement.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	CustomerDao customerDao;

	public CustomerServiceImpl(CustomerDao customerDao) {
		super();
		this.customerDao = customerDao;
	}



	@Override
	public String insertCustomer(Customer customer) {
		String msg=customerDao.insertCustomer(customer);
		return msg;
	}



	@Override
	public List<Customer> getCustomersList() {
		return customerDao.getCustomersList();
		
	}



	@Override
	public Customer getCustomerById(int id) {
		return customerDao.getCustomerById(id);
	}



	@Override
	public String updateCustomer(Customer customer) {
		return customerDao.updateCustomer(customer);
		
	}



	@Override
	public String deleteCustomerById(int id) {
		return customerDao.deleteCustomerById(id);
		
	}



	@Override
	public String insertMultipleCustomers(List<Customer> customers) {
		return customerDao.insertMultipleCustomers(customers);
	}



	@Override
	public List<Customer> insertCustomersByFirstName(String firstName) {
		return customerDao.getCustomersByFirstName(firstName);
		
	}



	@Override
	public List<Customer> getCustomerByLessThanAge(int age) {
		return customerDao.getCustomerByLessThanAge(age);
		
	}



	@Override
	public List<Customer> getCustomerByAge(int age) {
		return customerDao.getCusotmerByAge(age);
	}



	@Override
	public List<Customer> getCustomerByLastName(String name) {
		return customerDao.getCustomerByLastName(name);
	}



	@Override
	public List<Customer> getCustomerByEmail(String email) {
		
		return customerDao.getCustomerByEmail(email);
	}



	@Override
	public List<Customer> getCustomerBymobileNumber(String mobileNumber) {
		
		return customerDao.getCustomerByMobileNumber(mobileNumber);
	}



	@Override
	public String updatefirstName(int id, String firstName) {
		
		return customerDao.updateFirstName(id, firstName);
	}



	@Override
	public String updateLastName(int id, String lastName) {
		return customerDao.updateLastName(id, lastName);
	}



	@Override
	public String updateEmail(int id, String email) {
		
		return customerDao.updateEmail(id, email);
	}



	@Override
	public String updateAge(int id, int age) {
		return customerDao.updateAge(id, age);
	}



	@Override
	public List<String> getAllFirstName() {
		return customerDao.getAllFirstName();
	}



	@Override
	public List<String> getAllLastName() {
		return customerDao.getAllLastName();
	}




	}

