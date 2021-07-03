package mn.ictgroup.intern.main.repository;

import mn.ictgroup.intern.main.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

        List<Customer> findByCustomerId(Long customerId);
        }

