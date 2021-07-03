package mn.ictgroup.intern.main.repository;

import mn.ictgroup.intern.main.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CityRepository extends JpaRepository<City, Long> {

    List<City> findByCityId(Long cityId);

    Optional<City> findCityByCity(Long city);

    void deleteByCityId(Long cityId);
}
