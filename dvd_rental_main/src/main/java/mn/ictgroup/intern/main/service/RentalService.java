package mn.ictgroup.intern.main.service;

import mn.ictgroup.intern.main.entity.Rental;
import mn.ictgroup.intern.main.entity.Staff;
import mn.ictgroup.intern.main.repository.RentalRepository;
import mn.ictgroup.intern.main.repository.StaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 *
 * @author Jimmy
 *
 */
@Service
public class RentalService {
    @Autowired
    private RentalRepository rentalRepo;

    public List<Rental> getRentalsByStaffId(Long staffId) {
        return this.rentalRepo.getRentalsByStaffId(staffId);
    }
}