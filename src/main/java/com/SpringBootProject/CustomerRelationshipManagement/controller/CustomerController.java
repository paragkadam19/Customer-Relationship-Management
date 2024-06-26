package com.SpringBootProject.CustomerRelationshipManagement.controller;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBootProject.CustomerRelationshipManagement.entity.Customer;
import com.SpringBootProject.CustomerRelationshipManagement.service.CustomerService;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

	CustomerService customerService;

	public CustomerController(CustomerService customerService) {
		super();
		this.customerService = customerService;
	}
	@PostMapping("/insert")
	public String insertCustomer(@RequestBody Customer customer) {
		String msg =customerService.insertCustomer(customer);
		return msg;
	}
	@GetMapping
	public List<Customer> getCustomerList(){
		 List<Customer> list= customerService.getCustomersList();
		 return list;
	}
	@GetMapping("/{id}")
	public Customer getCustomerById(@PathVariable int id) {
		return customerService.getCustomerById(id);
	}
	@PutMapping
	public String updateCustomer(@RequestBody Customer customer) {
		return customerService.updateCustomer(customer);
	}
	@DeleteMapping("/{id}")
	public String deleteCustomer(@PathVariable int id) {
		return customerService.deleteCustomerById(id);
	}
	@PostMapping
	public String insertMultipleCustomers(@RequestBody List<Customer> customers) {
		return customerService.insertMultipleCustomers(customers);
	}
	@GetMapping("/byname/{firstName}")
	public List<Customer> getCustomerByFirstName(@PathVariable String firstName){
		return customerService.insertCustomersByFirstName(firstName);
	}
	@GetMapping("/bylessthanage/{age}")
	public List<Customer> getCustomerByLessThanAge(@PathVariable int age){
		return customerService.getCustomerByLessThanAge(age);
	}
	@GetMapping("/byage/{age}")
	public List<Customer> getCustomerByAge(@PathVariable int age){
		return customerService.getCustomerByAge(age);
	}	
	@GetMapping("/bylastname/{lastName}")
	public List<Customer> getCustomerByLastName(@PathVariable String lastName){
		return customerService.getCustomerByLastName(lastName);
	}
	@GetMapping("/byemail/{email}")
	public List<Customer> getCustomerByEmail(@PathVariable String email){
		return customerService.getCustomerByEmail(email);
	}
	@GetMapping("/bymobileNumber/{mobileNumber}")
	public List<Customer> getCustomerBymobileNumber(@PathVariable String mobileNumber){
		return customerService.getCustomerBymobileNumber(mobileNumber);
	}
	@PutMapping("/fname/{id}")
	public String updateFirstName(@PathVariable int id,@RequestBody Map<String, String> request) {
		String firstName =request.get("firstName");
		return customerService.updatefirstName(id, firstName);
	}
	@PutMapping("/lname/{id}")
	public String updateLastName(@PathVariable int id,@RequestBody Map<String,String> request) {
		String lastName =request.get("lastName");
		return customerService.updateLastName(id, lastName);
	}
	
	@PutMapping("/email/{id}")
	public String updateEmail(@PathVariable int id ,@RequestBody Map <String ,String> request) {
		String email= request.get("email");
		return customerService.updateEmail(id, email);
	}
	@PutMapping("/age/{id}")
	public String updateAge(@PathVariable int id,@RequestBody Map<String,Integer>request) {
		int age = request.get("age");
		return customerService.updateAge(id, age);
	}
	@GetMapping("/allfirstname")
	public List<String> getAllFirstName(){
		return customerService.getAllFirstName();
	}
	
	@GetMapping("/alllastname")
	public List<String> getAllLastName(){
		return customerService.getAllLastName();
	}
}

