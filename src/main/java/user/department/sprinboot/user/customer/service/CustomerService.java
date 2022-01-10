package user.department.sprinboot.user.customer.service;

import java.util.List;

import user.department.sprinboot.user.customer.entity.Customer;

public interface CustomerService {

	public Customer saveCustomer(Customer customer);
	
	public List<Customer> getAllCustomers();
	
	public Customer findCustomerById(Long id);
}
