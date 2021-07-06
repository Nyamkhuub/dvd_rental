package mn.ictgroup.intern.main.service;

import mn.ictgroup.intern.main.dto.Response;
import mn.ictgroup.intern.main.entity.Actor;
import mn.ictgroup.intern.main.entity.City;
import mn.ictgroup.intern.main.exception.ApiRequestException;
import mn.ictgroup.intern.main.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CityService {

    @Autowired
    private CityRepository cityRepository;


    public List<City> getCitiesByCityId(Long cityId) {
        return this.cityRepository.findByCityId(cityId);
    }

    public City addNewCity(City city) {
        Optional<City>cityOptional = cityRepository.findCityByCity(city.getCity());
        if(cityOptional.isPresent()){
            throw new ApiRequestException("FirstName taken");
        }
       return cityRepository.save(city);
    }

    public Response editCity(City city) {
        Optional<City>cityOptional = cityRepository.findCityByCityId(city.getCityId());
        City newCity = cityOptional.get();
        if(cityOptional.isPresent()){
            newCity.setCityId(city.getCityId());
            newCity.setCity(city.getCity());
            newCity.setCountryId(city.getCountryId());
            newCity.setLastUpdate(city.getLastUpdate());
            throw new ApiRequestException("amjltgui");
        }
        cityRepository.save(newCity);
        return new Response ("amjilttai", "success");
    }
    public void deleteCity(Long cityId) {
        boolean exists = cityRepository.existsById(cityId);
        if (!exists){
            throw new ApiRequestException(cityId + "doesn't delete");
        }
        cityRepository.deleteByCityId(cityId);
    }
}
