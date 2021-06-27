package mn.ictgroup.intern.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mn.ictgroup.intern.main.entity.Address;
import mn.ictgroup.intern.main.repository.AddressRepository;

/**
 *
 * Unubayar
 *
 */
@Service
public class AddressService {

    @Autowired
    private AddressRepository addressRepo;

    public List<Address> getAddressByCityId(Long cityId) {
        return this.addressRepo.findByCityId(cityId);
    }
}
