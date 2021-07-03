package mn.ictgroup.intern.main.service;

import mn.ictgroup.intern.main.entity.Store;
import mn.ictgroup.intern.main.repository.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author unubayar
 *
 */
@Service
public class StoreService {

    @Autowired
    private StoreRepository storeRepository;

    public List<Store> getStoriesByStoreId(Long storeId) {
        return this.storeRepository.findByStoreId(storeId);
    }

    public void addNewStore(Store store) {
        Optional<Store>storeOptional = storeRepository.findByManagerStaffId(store.getManagerStaffId());
        storeRepository.save(store);
    }

    public void deleteStore(Long storeId) {
        storeRepository.deleteByStoreId(storeId);
    }
}
