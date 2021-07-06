package mn.ictgroup.intern.main.repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

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


    List<Rental> getRentalsByRentalId(Long rentalId);

    Optional<Rental> findByRentalDate(Date rentalDate);
}