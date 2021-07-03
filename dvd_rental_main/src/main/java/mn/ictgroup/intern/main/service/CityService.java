package mn.ictgroup.intern.main.service;

import mn.ictgroup.intern.main.entity.City;
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

    public void addNewCity(City city) {
        Optional<City> cityOptional = cityRepository.findCityByCity(city.getCity());
        cityRepository.save(city);
    }

    public void deleteCity(Long cityId) {
        cityRepository.deleteByCityId(cityId);
    }
}
