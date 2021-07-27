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

    List<Staff> findByStaffId(Long staffId);

    Optional<Staff> findStaffByFirstName(String firstName);
}