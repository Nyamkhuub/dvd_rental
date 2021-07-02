package mn.ictgroup.intern.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import mn.ictgroup.intern.main.entity.Country;
import mn.ictgroup.intern.main.service.CountryService;

/**
 *
 * Unubayar
 *
 */

@RestController
@RequestMapping("/Country")
public class CountryController {

    @Autowired
    private CountryService countryService;

    @GetMapping()
    public List<Country> getCountriesByCountryId(@RequestParam Long countryId) {
        return this.countryService.getCoutriesByCountrId(countryId);
    }
}
