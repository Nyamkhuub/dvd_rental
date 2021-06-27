package mn.ictgroup.intern.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mn.ictgroup.intern.main.entity.Customer;
import mn.ictgroup.intern.main.repository.CustomerRepository;

/**
 *
 * Unubayar
 *
 */
@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepo;

    public List<Customer> getCustomersByStoreId(Long storeId) {
        return this.customerRepo.findByStoreId(storeId);
    }
}
