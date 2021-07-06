package mn.ictgroup.intern.main.repository;

import mn.ictgroup.intern.main.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author B.Unubayar
 *
 */

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

        List<Customer> findByCustomerId(Long customerId);

        Optional<Customer> findCustomerByFirstName(Long firstName);

        Optional<Customer> findCustomerByLastName(Long lastName);

        void deleteByCustomerId(Long customerId);

}

