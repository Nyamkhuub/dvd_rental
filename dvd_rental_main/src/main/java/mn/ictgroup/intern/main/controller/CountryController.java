package mn.ictgroup.intern.main.controller;

import mn.ictgroup.intern.main.dto.Response;
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
@RequestMapping("/country")
public class CountryController {

    @Autowired
    private CountryService countryService;

    @GetMapping()
    public List<Country> getCountriesByCountryId(@RequestParam Long countryId){
        return this.countryService.getCountriesByCountryId(countryId);
    }
    @PostMapping()
    public void saveNewCountry(@RequestBody Country country) {
        countryService.addNewCountry(country);
    }
    @PutMapping()
    public Response updateCountry(@RequestBody Country country){
        return countryService.editCountry(country);
    }
    @DeleteMapping()
    public void wrongCountry(@PathVariable Long countryId){
        countryService.deleteCountry(countryId);
    }
}
