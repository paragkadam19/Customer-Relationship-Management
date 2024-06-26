package com.SpringBootProject.CustomerRelationshipManagement.service;

import java.util.List;

import com.SpringBootProject.CustomerRelationshipManagement.entity.Customer;

public interface CustomerService {

	String insertCustomer(Customer customer);
	
	List<Customer> getCustomersList();
	
	Customer getCustomerById(int id);
	
	String updateCustomer(Customer customer);
	
	String deleteCustomerById(int id);
	
	String insertMultipleCustomers(List<Customer> customers);
	
	List<Customer> insertCustomersByFirstName(String firstName);
	
	List<Customer> getCustomerByLessThanAge(int age);
	
	List<Customer> getCustomerByAge(int age);
	
	List<Customer> getCustomerByLastName(String name);
	
	List<Customer> getCustomerByEmail(String email);
	
	List<Customer> getCustomerBymobileNumber(String mobileNumber);
	
	String updatefirstName(int id , String firstName);
	
	String updateLastName(int id, String lastName);
	
	String updateEmail(int id , String email);
	
	String updateAge(int id, int age);
	
	List<String> getAllFirstName();
	
	List<String> getAllLastName();
	
	
	
	
	
	
	
}
