package mn.ictgroup.intern.main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mn.ictgroup.intern.main.entity.Country;

/**
 *
 * Unubayar
 *
 */
@Repository
public interface CountryRepository extends JpaRepository<Country, Long> {

    List<Country> findByCountryId(Long countryId);
}
