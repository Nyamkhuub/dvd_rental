package mn.ictgroup.intern.main.controller;

import mn.ictgroup.intern.main.dto.Response;
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

    @GetMapping()
    public List<City> getCitiesByCityId(@RequestParam Long cityId) {
        return this.cityService.getCitiesByCityId(cityId);
    }
    @PostMapping()
    public City saveNewCity(@RequestBody City city) {
        return cityService.addNewCity(city);
    }

    @PutMapping()
    public Response updateCity(@RequestBody City city){
        return cityService.editCity(city);
    }

    @DeleteMapping()
    public void wrongCity(@PathVariable("cityId") Long cityId){
        cityService.deleteCity(cityId);
    }

}
