package mn.ictgroup.intern.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import mn.ictgroup.intern.main.entity.Store;
import mn.ictgroup.intern.main.service.StoreService;

/**
 *
 * Unubayar
 *
 */

@RestController
@RequestMapping("/store")
public class StoreController {

    @Autowired
    private StoreService storeService;

    @GetMapping()
    public List<Store> getStoresByAddressId(@RequestParam Long addressId) {
        return this.storeService.getStoresByAddressId(addressId);
    }
}
