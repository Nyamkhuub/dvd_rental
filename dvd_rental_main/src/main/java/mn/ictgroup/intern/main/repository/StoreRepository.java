package mn.ictgroup.intern.main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mn.ictgroup.intern.main.entity.Store;

/**
 *
 * Unubayar
 *
 */
@Repository
public interface StoreRepository extends JpaRepository<Store, Long> {

    List<Store> findByAddressId(Long addressId);
}
