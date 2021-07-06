package mn.ictgroup.intern.main.service;

import mn.ictgroup.intern.main.dto.Response;
import mn.ictgroup.intern.main.entity.Actor;
import mn.ictgroup.intern.main.entity.Country;
import mn.ictgroup.intern.main.exception.ApiRequestException;
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

    public Response addNewCountry(Country country) {
        Optional<Country>countryOptional = countryRepository.findCountryByCountry(country.getCountry());
        if(countryOptional.isPresent()){
            throw new ApiRequestException("Country taken");
        }
        countryRepository.save(country);
        return null;
    }

    public Response editCountry(Country country) {
        Optional<Country>countryOptional = countryRepository.findCountryByCountryId(country.getCountryId());
        Country newCountry = countryOptional.get();
        if(countryOptional.isPresent()){
            newCountry.setCountry(country.getCountry());
            newCountry.setCountryId(country.getCountryId());
            newCountry.setLastUpdate(country.getLastUpdate());
            throw new ApiRequestException("amjltgui");
        }
        countryRepository.save(newCountry);
        return new Response ("amjilttai", "success");
    }
    public void deleteCountry(Long countryId) {
        boolean exists = countryRepository.existsById(countryId);
        if (!exists){
            throw new ApiRequestException(countryId + "doesn't delete");
        }
        countryRepository.deleteByCountryId(countryId);
    }
}
