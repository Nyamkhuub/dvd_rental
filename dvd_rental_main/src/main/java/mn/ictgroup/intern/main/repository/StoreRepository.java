package mn.ictgroup.intern.main.repository;

import mn.ictgroup.intern.main.entity.Store;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StoreRepository extends JpaRepository<Store, Long> {
    List<Store> findByStoreId(Long storeId);

    Optional<Store> findByManagerStaffId(Long managerStaffId);

    void deleteByStoreId(Long storeId);
}
