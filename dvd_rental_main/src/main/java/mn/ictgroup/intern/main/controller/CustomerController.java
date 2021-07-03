package mn.ictgroup.intern.main.controller;

import mn.ictgroup.intern.main.entity.Customer;
import mn.ictgroup.intern.main.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 *
 * @author B. Unubayar
 *
 */
@RestController
@RequestMapping("/actor")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping(path = "customerId")
     public List<Customer> getCustomersByCustomerId(@RequestParam Long customerId){
        return this.customerService.getCustomersByCustomerId(customerId);
    }

}
