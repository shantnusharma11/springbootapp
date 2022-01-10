package user.department.sprinboot.user.department.Repo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import user.department.sprinboot.user.customer.entity.Customer;
import user.department.sprinboot.user.customer.repository.CustomerRepository;


public class CustomerRepoTest {

	@Autowired
	private CustomerRepository customerRepository;

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
