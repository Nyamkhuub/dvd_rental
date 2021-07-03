package mn.ictgroup.intern.main.service;

import mn.ictgroup.intern.main.entity.Customer;
import mn.ictgroup.intern.main.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> getCustomersByCustomerId(Long customerId) {
        return this.customerRepository.findByCustomerId(customerId);
    }

    public void addNewCustomer(Customer customer) {
        Optional<Customer> customerOptional = customerRepository.findCustomerByFirstName(customer.getFirstName());
        customerRepository.save(customer);
    }

    public void deleteCustomer(Long customerId) {
        customerRepository.deleteByCustomerId(customerId);
    }
}
