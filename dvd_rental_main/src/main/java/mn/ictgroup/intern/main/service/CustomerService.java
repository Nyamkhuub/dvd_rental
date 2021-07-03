package mn.ictgroup.intern.main.service;

import mn.ictgroup.intern.main.entity.Customer;
import mn.ictgroup.intern.main.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> getCustomersByCustomerId(Long customerId) {
        return this.customerRepository.findByCustomerId(customerId);
    }
}
