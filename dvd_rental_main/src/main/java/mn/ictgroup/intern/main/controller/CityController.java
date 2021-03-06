package mn.ictgroup.intern.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import mn.ictgroup.intern.main.entity.City;
import mn.ictgroup.intern.main.service.CityService;

/**
 *
 * Unubayar
 *
 */

@RestController
@RequestMapping("/city")
public class CityController {

    @Autowired
    private CityService cityService;

    @GetMapping()
    public List<City> getCitiesByCountryId(@RequestParam Long countryId) {
        return this.cityService.getCitiesByCountryId(countryId);
    }
}
