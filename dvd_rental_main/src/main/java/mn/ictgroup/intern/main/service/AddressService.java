package mn.ictgroup.intern.main.service;

import mn.ictgroup.intern.main.entity.Address;
import mn.ictgroup.intern.main.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;

    public List<Address> getAddressByAddressId(Long addressId) {
        return this.addressRepository.findByAddressId(addressId);
    }

    public void addNewAddress(Address address) {
        Optional<Address> addressOptional = addressRepository.findAddressByAddress(address.getAddress());
        addressRepository.save(address);
    }

    public void deleteAddress(Long addressId) {
        addressRepository.deleteByAddressId(addressId);
    }
}
