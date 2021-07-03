package mn.ictgroup.intern.main.controller;

import mn.ictgroup.intern.main.entity.Address;
import mn.ictgroup.intern.main.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressController {
    @Autowired
    private AddressService addressService;

    @GetMapping(path = "addressId")
    public List<Address> getAddressByAddressId(@RequestParam Long addressId) {
        return this.addressService.getAddressByAddressId(addressId);
    }
    @PostMapping(path = "nem")
    public void saveNewAddress(@RequestBody Address address) {
        addressService.addNewAddress(address);
    }

    @DeleteMapping(path = "{addressId}")
    public void wrongAddress(@PathVariable("addressId") Long addressId){
        addressService.deleteAddress(addressId);
    }

}
