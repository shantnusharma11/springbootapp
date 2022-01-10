package user.department.sprinboot.user.customer.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import user.department.sprinboot.user.customer.entity.Customer;
import user.department.sprinboot.user.customer.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerRepository customerRepository;
	
	
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		super();
		this.customerRepository = customerRepository;
	}

	@Override
	public Customer saveCustomer(Customer customer) {
		
		return customerRepository.save(customer);
	}

	@Override
	public List<Customer> getAllCustomers() {
		return customerRepository.findAll() ;
	}

	@Override
	public Customer findCustomerById(Long id) {
		Optional<Customer> customer= customerRepository.findById(id);
		return customer.get();
	}

}
