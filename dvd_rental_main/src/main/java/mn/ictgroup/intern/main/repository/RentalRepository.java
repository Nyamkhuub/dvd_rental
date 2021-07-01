package mn.ictgroup.intern.main.repository;

import java.util.List;

import mn.ictgroup.intern.main.entity.Rental;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



/**
 *
 * @author Jimmy
 *
 */
@Repository
public interface RentalRepository extends JpaRepository<Rental, Long> {


    List<Rental> getRentalsByStaffId(Long staffId);
}