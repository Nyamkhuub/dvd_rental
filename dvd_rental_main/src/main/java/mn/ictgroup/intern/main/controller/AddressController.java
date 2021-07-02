package mn.ictgroup.intern.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import mn.ictgroup.intern.main.entity.Address;
import mn.ictgroup.intern.main.service.AddressService;

/**
 *
 * Unubayar
 *
 */

@RestController
@RequestMapping("/address")
public class AddressController {

    @Autowired
    private AddressService addressService;

    @GetMapping()
    public List<Address> getAddressByCityId(@RequestParam Long addressId) {
        return this.addressService.getAddressByCityId(addressId);
    }
}
