package mn.ictgroup.intern.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mn.ictgroup.intern.main.entity.Country;
import mn.ictgroup.intern.main.repository.CountryRepository;

/**
 *
 * Unubayar
 *
 */
@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepo;

    public List<Country> getCoutriesByCountrId(Long CountryId) {
        return this.CountryRepo.findByCountryId(countryId);
    }
}
