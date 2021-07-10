package mn.ictgroup.intern.main.controller;

import java.util.List;

import mn.ictgroup.intern.main.service.RentalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import mn.ictgroup.intern.main.entity.Rental;

/**
 *
 * @author Jimmy
 *
 */

@RestController
@RequestMapping("/rental")
public class RentalController {

    @Autowired
    private RentalService rentalService;

    @GetMapping()
    public List<Rental> getRentalsByRentalId(@RequestParam Long rentalId) {
        return this.rentalService.getRentalsByRentalId(rentalId);
    }
    @PostMapping()
    public void saveNewActor(@RequestBody Rental rental) {
        rentalService.addNewRental(rental);
    }

    @DeleteMapping()
    public void deleteRental(@PathVariable("rentalId") Long rentalId) {
        rentalService.removeRental(rentalId);
    }

}