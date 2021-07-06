package mn.ictgroup.intern.main.controller;

import mn.ictgroup.intern.main.dto.Response;
import mn.ictgroup.intern.main.entity.Store;
import mn.ictgroup.intern.main.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 *
 * @author Unubayar
 *
 */
@RestController
@RequestMapping("/store")
public class StoreController {

    @Autowired
    private StoreService storeService;

    @GetMapping()
    public List<Store> getStoriesByStoreId(@RequestParam Long storeId) {
        return this.storeService.getStoriesByStoreId(storeId);
    }
    @PostMapping()
    public Store saveNewStore(@RequestBody Store store) {
       return storeService.addNewStore(store);
    }
    @PutMapping()
    public Response updateStore(@RequestBody Store store){
        return storeService.editStore(store);
    }
    @DeleteMapping()
    public void wrongStore(@PathVariable("storeId") Long storeId){
        storeService.deleteStore(storeId);
    }
}
