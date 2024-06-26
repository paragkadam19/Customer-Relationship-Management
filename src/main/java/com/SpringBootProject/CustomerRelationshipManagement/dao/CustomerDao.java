package com.SpringBootProject.CustomerRelationshipManagement.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.SpringBootProject.CustomerRelationshipManagement.entity.Customer;

import jakarta.persistence.criteria.From;

@Repository
public class CustomerDao {
	// @Autowired
	SessionFactory sf;

	public CustomerDao(SessionFactory sf) {
		super();
		this.sf = sf;
	}

	public String insertCustomer(Customer customer) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		session.save(customer);
		tr.commit();
		session.close();
		return "Customer inserted successfully";
		}
	
	public List<Customer> getCustomersList(){
		Session session =sf.openSession();
		return session.createQuery("from Customer").list();
		}
	
	public Customer getCustomerById(int id) {
		Session session = sf.openSession();
		Customer customer = session.get(Customer.class, id);
		return customer;
	}
	public String updateCustomer(Customer customer) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		session.update(customer);
		tr.commit();
		session.close();
		return "Customer updated successfully";
	}
	public String deleteCustomerById(int id) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Customer customer = session.get(Customer.class, id);
	    session.delete(customer);
		tr.commit();
		session.close();
		return "customer deleted successfully";
	}
	
	public String insertMultipleCustomers(List<Customer> customers) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		for(Customer customer : customers) {
			session.save(customer);
		}
		tr.commit();
		session.close();
		return "customers are inserted successfully";
	}
	
	public List<Customer> getCustomersByFirstName(String firstName){
		Session session = sf.openSession();
		Query<Customer> customers = session.createQuery("from Customer c where c.firstName=:firstName",Customer.class);
		customers.setParameter("firstName", firstName);
		List<Customer> list = customers.list();
		return list;
	}
	
	public List<Customer> getCustomerByLessThanAge(int age){
		Session session = sf.openSession();
		Query <Customer> customers= session.createQuery("from Customer c where c.age<:age",Customer.class);
		customers.setParameter("age",age);
		List<Customer> list =customers.list();
		return list;
		
	}
	public List<Customer>getCusotmerByAge(int age) {
		Session session =sf.openSession();
		Query<Customer> customers= session.createQuery("from Customer c where c.age=:age",Customer.class);
		customers.setParameter("age", age);
		List<Customer> list = customers.list();
		return list;
		
	}
	public List<Customer> getCustomerByLastName(String lastName){
		Session session = sf.openSession();
		Query <Customer>customers =session.createQuery("From Customer c where c.lastName =: lastName",Customer.class);
		customers.setParameter("lastName",lastName);
		List<Customer> list = customers.list();
		return list;
	}

	public List<Customer> getCustomerByEmail(String email){
		Session session = sf.openSession();
		Query <Customer>customers =session.createQuery("From Customer c where c.email =: email",Customer.class);
		customers.setParameter("email",email);
		List<Customer> list = customers.list();
		return list;
	}
	
	public List<Customer> getCustomerByMobileNumber(String mobileNumber){
		Session session = sf.openSession();
		Query <Customer>customers =session.createQuery("From Customer c where c.mobileNumber =: mobileNumber",Customer.class);
		customers.setParameter("mobileNumber",mobileNumber);
		List<Customer> list = customers.list();
		return list;
	}
	
	public String updateFirstName(int id, String firstName) {
		Session session = sf.openSession();
		Transaction tr =session.beginTransaction();
		Customer customer =session.get(Customer.class, id);
		customer.setFirstName(firstName);
		tr.commit();
		session.close();
		return "updated successfully";
	}
	
	public String updateLastName(int id ,String lastName) {
		Session session = sf.openSession();
		Transaction tr =session.beginTransaction();
		Customer customer =session.get(Customer.class, id);
		customer.setLastName(lastName);
		tr.commit();
		session.close();
		return "last name updated successfully";
	}
	
	public String updateEmail(int id, String email) {
		Session session =sf.openSession();
		Transaction tr = session.beginTransaction();
		Customer customer =session.get(Customer.class, id);
		customer.setEmail(email);
		tr.commit();
		session.close();
		return "email id updated successfully";
		
	}
	
	public String updateAge(int id , int age) {
		Session session = sf.openSession();
		Transaction tr =session.beginTransaction();
		Customer customer = session.get(Customer.class, id);
		customer.setAge(age);
		tr.commit();
		session.close();
		return "age updated successfully";
		
	}
	
	public List<String> getAllFirstName(){
		Session session = sf.openSession();
		return session.createQuery("select c.firstName from Customer c").list();
		
		
	}
	
	public List<String> getAllLastName(){
		Session session = sf.openSession();
		return session.createQuery("select c.lastName from Customer c").list();
		
		
	}
}
