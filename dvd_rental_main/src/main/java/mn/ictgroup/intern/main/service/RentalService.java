package mn.ictgroup.intern.main.service;

import mn.ictgroup.intern.main.entity.Category;
import mn.ictgroup.intern.main.entity.Rental;
import mn.ictgroup.intern.main.repository.RentalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author Jimmy
 *
 */
@Service
public class RentalService {
    @Autowired
    private RentalRepository rentalRepo;

    public List<Rental> getRentalsByRentalId(Long rentalId) {
        return this.rentalRepo.getRentalsByRentalId(rentalId);
    }

    public void addNewRental(Rental rental) {
        Optional<Rental> rentalOptional = rentalRepo.findByRentalDate(rental.getRentalDate());
        if (rentalOptional.isPresent()) {
            throw new IllegalStateException("taken");
        }
        rentalRepo.save(rental);
    }
    public void removeRental(Long rentalId) {
        rentalRepo.deleteById(rentalId);
    }
}