package mn.ictgroup.intern.main.controller;

import mn.ictgroup.intern.main.dto.Response;
import mn.ictgroup.intern.main.entity.Customer;
import mn.ictgroup.intern.main.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 *
 * @author B. Unubayar
 *
 */
@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping()
     public List<Customer> getCustomersByCustomerId(@RequestParam Long customerId){
        return this.customerService.getCustomersByCustomerId(customerId);
    }
    @PostMapping()
    public Customer saveNewCustomer(@RequestBody Customer customer) {
       return customerService.addNewCustomer(customer);
    }
    @PutMapping()
    public Response updateCustomer(@RequestBody Customer customer){
        return customerService.editCustomer(customer);
    }
    @DeleteMapping()
    public void wrongCustomer(@PathVariable("customerId") Long customerId){
        customerService.deleteCustomer(customerId);
    }
}
