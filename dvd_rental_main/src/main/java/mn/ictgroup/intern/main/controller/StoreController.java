package mn.ictgroup.intern.main.controller;

import mn.ictgroup.intern.main.entity.Actor;
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
@RequestMapping(name = "/store")
public class StoreController {

    @Autowired
    private StoreService storeService;

    @GetMapping(path = "storeId")
    public List<Store> getStoriesByStoreId(@RequestParam Long storeId) {
        return this.storeService.getStoriesByStoreId(storeId);
    }
    @PostMapping(path = "add")
    public void saveNewStore(@RequestBody Store store) {
        storeService.addNewStore(store);
    }
    @DeleteMapping(path = "{storeId}")
    public void wrongStore(@PathVariable("storeId") Long storeId){
        storeService.deleteStore(storeId);
    }
}
