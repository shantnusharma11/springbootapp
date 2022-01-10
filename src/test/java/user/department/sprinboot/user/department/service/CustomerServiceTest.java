package user.department.sprinboot.user.department.service;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import user.department.sprinboot.user.customer.entity.Customer;
import user.department.sprinboot.user.customer.repository.CustomerRepository;
import user.department.sprinboot.user.customer.service.CustomerService;


@SpringBootTest
public class CustomerServiceTest {

	@Autowired
	  private CustomerRepository customerRepository;
	  
	  private CustomerService customerService;

	  Customer customer= new Customer(123,"shantnu",22,"male","vegetarian");

		
		@Test
		void getAllCustomers() {
			customerService.getAllCustomers();	
			Customer actualResult= (Customer) customerRepository.findAll();
			verify(customerRepository).save(customer);
		}
		@Test
		void saveCustomer() {
			Customer actualResult=customerRepository.save(customer);
			assertThat(actualResult).asList();
		}
		@Test
		void findCustomerById() {
			customerService.findCustomerById(null);	
			verify(customerRepository).findById(null);
	
		}

	    @AfterEach
	    void tearDown() {
	        System.out.println("tearing down");
	        customerRepository.deleteAll();
	    }
	    
		@BeforeEach
		void setUp() {
			System.out.println("setting up");
		}
}

