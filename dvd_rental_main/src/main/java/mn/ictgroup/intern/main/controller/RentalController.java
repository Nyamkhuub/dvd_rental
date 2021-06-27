package mn.ictgroup.intern.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import mn.ictgroup.intern.main.entity.Inventory;
import mn.ictgroup.intern.main.service.InventoryService;

/**
 *
 * @author Jimmy
 *
 */

@RestController
@RequestMapping("/rental")
public class InventoryController {

    @Autowired
    private RentalService rentalService;

    @GetMapping()
    public List<Rental> getRentalsByFilmId(@RequestParam Long filmId) {
        return this.rentalService.getRentalsByFilmId(filmId);
    }
}
