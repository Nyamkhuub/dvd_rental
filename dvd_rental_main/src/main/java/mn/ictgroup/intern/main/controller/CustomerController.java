package mn.ictgroup.intern.main.controller;

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

    @GetMapping(path = "customerId")
     public List<Customer> getCustomersByCustomerId(@RequestParam Long customerId){
        return this.customerService.getCustomersByCustomerId(customerId);
    }

    @PostMapping(path = "add")
    public void saveNewCustomer(@RequestBody Customer customer) {
        customerService.addNewCustomer(customer);
    }
    @DeleteMapping(path = "{customerId}")
    public void wrongCustomer(@PathVariable("customerId") Long customerId){
        customerService.deleteCustomer(customerId);
    }



}
