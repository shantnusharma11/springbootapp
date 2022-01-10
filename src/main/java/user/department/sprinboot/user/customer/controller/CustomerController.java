package user.department.sprinboot.user.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import user.department.sprinboot.user.customer.entity.Customer;
import user.department.sprinboot.user.customer.service.CustomerService;

@RestController
@RequestMapping("/customers")
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	public CustomerController(CustomerService customerService) {
		super();
		this.customerService = customerService;
	}
	@PostMapping("/add")
	public Customer saveCustomer(@RequestBody Customer customer) {
		return customerService.saveCustomer(customer);
		
	}
	@GetMapping("/get")
	public List<Customer> getAllCustomers(){
		return customerService.getAllCustomers();
	}
	
	@GetMapping("/{id}")
	public Customer findCustomerById(@PathVariable("id") Long id)
	{
return customerService.findCustomerById(id);
}
}
