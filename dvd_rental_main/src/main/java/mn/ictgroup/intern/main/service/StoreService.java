package mn.ictgroup.intern.main.service;

import mn.ictgroup.intern.main.dto.Response;
import mn.ictgroup.intern.main.entity.Actor;
import mn.ictgroup.intern.main.entity.Store;
import mn.ictgroup.intern.main.exception.ApiRequestException;
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

    public Store addNewStore(Store store) {
        Optional<Store>storeOptional = storeRepository.findStoreByStoreId(store.getStoreId());
        if(storeOptional.isPresent()){
            throw new ApiRequestException("StoreId taken");
        }
       return storeRepository.save(store);
    }

    public Response editStore(Store store) {
        Optional<Store>storeOptional = storeRepository.findStoreByManagerStaffId(store.getManagerStaffId());
        Store newStore = storeOptional.get();
        if(storeOptional.isPresent()){
            newStore.setStoreId(store.getStoreId());
            newStore.setManagerStaffId(store.getManagerStaffId());
            newStore.setAddressId(store.getAddressId());
            newStore.setLastUpdate(store.getLastUpdate());
            throw new ApiRequestException("amjltgui");
        }
        storeRepository.save(newStore);
        return new Response ("amjilttai", "success");
    }

    public void deleteStore(Long storeId) {
        boolean exists = storeRepository.existsById(storeId);
        if (!exists){
            throw new ApiRequestException(storeId + "doesn't delete");
        }
        storeRepository.deleteByStoreId(storeId);
    }

}
