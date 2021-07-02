package mn.ictgroup.intern.main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mn.ictgroup.intern.main.entity.Address;

/**
 *
 * Unubayar
 *
 */
@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {

    List<Address> findByCityId(Long cityId);
}
