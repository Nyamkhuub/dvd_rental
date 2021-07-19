package mn.ictgroup.intern.main.service;

import mn.ictgroup.intern.main.dto.Response;
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
    private RentalRepository rentalRepository;

    public List<Rental> getRentalsByRentalId(Long rentalId) {
        return this.rentalRepository.getRentalsByRentalId(rentalId);
    }

    public Response addNewRental(Rental rental) {
        Optional<Rental> rentalOptional = rentalRepository.findByRentalDate(rental.getRentalDate());
        if (rentalOptional.isPresent()) {
            throw new IllegalStateException("taken");
        }
        rentalRepository.save(rental);
        return new Response("done","done");
    }
    public void removeRental(Long rentalId) {
        rentalRepository.deleteById(rentalId);
    }
}