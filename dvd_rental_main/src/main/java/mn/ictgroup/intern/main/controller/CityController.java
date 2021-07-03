package mn.ictgroup.intern.main.controller;

import mn.ictgroup.intern.main.entity.City;
import mn.ictgroup.intern.main.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 *
 * @author Unubayar
 *
 */
@RestController
@RequestMapping("/city")
public class CityController {

    @Autowired
    private CityService cityService;

    @GetMapping(path = "cityId")
    public List<City> getCitiesByCityId(@RequestParam Long cityId) {
        return this.cityService.getCitiesByCityId(cityId);
    }
    @PostMapping(path = "add")
    public void saveNewCity(@RequestBody City city) {
        cityService.addNewCity(city);
    }
    @DeleteMapping(path = "{cityId}")
    public void wrongCity(@PathVariable("cityId") Long cityId){
        cityService.deleteCity(cityId);
    }

}
