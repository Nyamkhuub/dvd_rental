package mn.ictgroup.intern.main.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import mn.ictgroup.intern.main.entity.Customer;
import mn.ictgroup.intern.main.service.CustomerService;

/**
 *
 * Unubayar
 *
 */

@Restcontroller
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping()
    public List<Customer> getCustomersByStoreId(@RequestParam Long storeId) {
        return this.customerService.getCustomersByStoreId(storeId);
    }
}
