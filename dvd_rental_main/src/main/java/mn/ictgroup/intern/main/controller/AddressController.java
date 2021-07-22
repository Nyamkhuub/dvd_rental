package mn.ictgroup.intern.main.controller;

import mn.ictgroup.intern.main.dto.Response;
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

    @GetMapping()
    public List<Address> getAddressByAddressId(@RequestParam Long addressId) {
        return this.addressService.getAddressByAddressId(addressId);
    }

    @PostMapping()
    public Address saveNewAddress(@RequestBody Address address) {
        return addressService.addNewAddress(address);
    }

    @PutMapping()
    public Response updateAddress(@RequestBody Address address){
        return addressService.editAddress(address);
    }

    @DeleteMapping()
    public void wrongAddress(@PathVariable("addressId") Long addressId){
        addressService.deleteAddress(addressId);
    }
}