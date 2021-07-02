package mn.ictgroup.intern.main.controller;

import java.util.List;

import mn.ictgroup.intern.main.service.RentalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
    public List<Rental> getRentalsByStaffId(@RequestParam Long staffId) {
        return this.rentalService.getRentalsByStaffId(staffId);
    }
}