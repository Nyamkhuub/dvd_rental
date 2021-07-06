package mn.ictgroup.intern.main.service;

import mn.ictgroup.intern.main.dto.Response;
import mn.ictgroup.intern.main.entity.Customer;
import mn.ictgroup.intern.main.exception.ApiRequestException;
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

    public Customer addNewCustomer(Customer customer) {
        Optional<Customer>customerOptional = customerRepository.findCustomerByFirstName(customer.getFirstName());
        if(customerOptional.isPresent()){
            throw new ApiRequestException("FirstName taken");
        }
       return customerRepository.save(customer);
    }
    public Response editCustomer(Customer customer) {
        Optional<Customer>customerOptional = customerRepository.findCustomerByLastName(customer.getLastName());
        Customer newCustomer = customerOptional.get();
        if(customerOptional.isPresent()){
            newCustomer.setCustomerId(customer.getCustomerId());
            newCustomer.setStoreId(customer.getStoreId());
            newCustomer.setFirstName(customer.getFirstName());
            newCustomer.setLastName(customer.getLastName());
            newCustomer.setEmail(customer.getEmail());
            newCustomer.setAddressId(customer.getAddressId());
            newCustomer.setActiveBool(customer.getActiveBool());
            newCustomer.setCreateDate(customer.getCreateDate());
            newCustomer.setLastUpdate(customer.getLastUpdate());
            newCustomer.setCreate(customer.getCreate());
            throw new ApiRequestException("amjltgui");
        }
        customerRepository.save(newCustomer);
        return new Response ("amjilttai", "success");
    }

    public void deleteCustomer(Long customerId) {
        boolean exists = customerRepository.existsById(customerId);
        if (!exists){
            throw new ApiRequestException(customerId + "doesn't delete");
        }
        customerRepository.deleteByCustomerId(customerId);
    }

}
