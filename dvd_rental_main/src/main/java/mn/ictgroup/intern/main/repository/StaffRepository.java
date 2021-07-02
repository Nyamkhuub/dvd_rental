package mn.ictgroup.intern.main.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import mn.ictgroup.intern.main.entity.Staff;

import static org.hibernate.loader.Loader.SELECT;

/**
 *
 * @author JImmy
 *
 */
@Repository
public interface StaffRepository extends JpaRepository<Staff, Long> {

    /**
     * Жишээ байдлаар 1 функц бичив
     */
    List<Staff> findByAddressId(Long addressId);

    List<Staff> findByStaffId(Long staffId);

    //@Query("SELECT s FROM Staff s WHERE s.email = ?1")
    Optional<Staff> findStaffByEmail(String email);


}