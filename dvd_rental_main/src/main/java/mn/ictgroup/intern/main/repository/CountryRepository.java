package mn.ictgroup.intern.main.repository;

import mn.ictgroup.intern.main.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CountryRepository extends JpaRepository<Country, Long> {

    List<Country> findByCountryId(Long countryId);

    Optional<Country> findActorByCountry(Long country);

    void deleteByCountryId(Long countryId);
}
