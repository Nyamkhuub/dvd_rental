package mn.ictgroup.intern.main.controller;

import mn.ictgroup.intern.main.entity.Actor;
import mn.ictgroup.intern.main.entity.Country;
import mn.ictgroup.intern.main.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 *
 * @author Unubayar
 *
 */
@RestController
@RequestMapping(name = "/country")
public class CountryController {

    @Autowired
    private CountryService countryService;

    @GetMapping(path = "countryId")
    public List<Country> getCountriesByCountryId(@RequestParam Long countryId){
        return this.countryService.getCountriesByCountryId(countryId);
    }
    @PostMapping(path = "add")
    public void saveNewCountry(@RequestBody Country country) {
        countryService.addNewCountry(country);
    }
    @DeleteMapping(path = "{countryId}")
    public void wrongCountry(@PathVariable Long countryId){
        countryService.deleteCountry(countryId);
    }
}
