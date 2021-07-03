package mn.ictgroup.intern.main.service;

import mn.ictgroup.intern.main.entity.Country;
import mn.ictgroup.intern.main.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author Unubayar
 *
 */
@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    public List<Country> getCountriesByCountryId(Long countryId) {
        return this.countryRepository.findByCountryId(countryId);
    }

    public void addNewCountry(Country country) {
        Optional<Country> countryOptional = countryRepository.findCountryByCountry(country.getCountry());
        countryRepository.save(country);
    }

    public void deleteCountry(Long countryId) {
        countryRepository.deleteByCountryId(countryId);
    }
}
