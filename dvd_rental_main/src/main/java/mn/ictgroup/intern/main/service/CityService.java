package mn.ictgroup.intern.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mn.ictgroup.intern.main.entity.City;
import mn.ictgroup.intern.main.repository.CityRepository;

/**
 *
 * Unubayar
 *
 */
@Service
public class CityService {

    @Autowired
    private CityRepository cityRepo;

    public List<City> getCitiesByCountryId(Long countryId) {
        return this.cityRepo.findByCountryId(countryId);
    }
}
