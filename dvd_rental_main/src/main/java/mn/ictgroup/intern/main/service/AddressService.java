package mn.ictgroup.intern.main.service;

import mn.ictgroup.intern.main.dto.Response;
import mn.ictgroup.intern.main.entity.Address;
import mn.ictgroup.intern.main.exception.ApiRequestException;
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

    public Address addNewAddress(Address address) {
        Optional<Address>addressOptional = addressRepository.findAddressByAddress(address.getAddress());
        if(addressOptional.isPresent()){
            throw new ApiRequestException("Address taken");
        }
        return addressRepository.save(address);
    }
    public Response editAddress(Address address) {
        Optional<Address>addressOptional = addressRepository.findAddressByAddress2(address.getAddress2());
        Address newAddress = addressOptional.get();
        if(addressOptional.isPresent()){
            newAddress.setAddressId(address.getAddressId());
            newAddress.setAddress(address.getAddress());
            newAddress.setAddress2(address.getAddress2());
            newAddress.setDistrict(address.getDistrict());
            newAddress.setCityId(address.getCityId());
            newAddress.setPostalCode(address.getPostalCode());
            newAddress.setPhone(address.getPhone());
            newAddress.setLastUpdate(address.getLastUpdate());
            throw new ApiRequestException("amjltgui");
        }
        addressRepository.save(newAddress);
        return new Response ("amjilttai", "success");
    }

    public void deleteAddress(Long addressId) {
        boolean exists = addressRepository.existsById(addressId);
        if (!exists){
            throw new ApiRequestException(addressId + "doesn't delete");
        }
        addressRepository.deleteByAddressId(addressId);
    }
    }

