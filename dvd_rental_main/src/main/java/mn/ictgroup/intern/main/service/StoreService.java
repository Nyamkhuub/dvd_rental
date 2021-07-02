package mn.ictgroup.intern.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mn.ictgroup.intern.main.entity.Store;
import mn.ictgroup.intern.main.repository.StoreRepository;

/**
 *
 * Unubayar
 *
 */
@Service
public class StoreService {

    @Autowired
    private StoreRepository storeRepo;

    public List<Store> getStoresByAddressId(Long addressId) {
        return this.storeRepo.findByAddressId(addressId);
    }
}
