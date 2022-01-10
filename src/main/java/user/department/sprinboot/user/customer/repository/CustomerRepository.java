package user.department.sprinboot.user.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import user.department.sprinboot.user.customer.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {

	
}
