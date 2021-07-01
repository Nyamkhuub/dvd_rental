package mn.ictgroup.intern.main.service;

import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import mn.ictgroup.intern.main.dto.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mn.ictgroup.intern.main.entity.Staff;
import mn.ictgroup.intern.main.repository.StaffRepository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Jimmy
 *
 */
@Service
public class StaffService {

    @Autowired
    private StaffRepository staffRepo;


    public List<Staff> getStaffsByStaffId(Long staffId) {
        return this.staffRepo.findByStaffId(staffId);
    }

   public void addNewStaff(Staff staff) {
        Optional<Staff> staffOptional = staffRepo.findStaffByEmail(staff.getEmail());
        if (staffOptional.isPresent()) {
            throw new IllegalStateException("email taken");
        }
        staffRepo.save(staff);
    }

    public void deleteStaff(Long staffId) {
        boolean exists = staffRepo.existsById(staffId);
        if (!exists) {
            throw new IllegalStateException("staff with id " + staffId + " does not exists");
        }
        staffRepo.deleteById(staffId);
    }
    @Transactional
    public void updateStaff(Long staffId,
                            String firstName,
                            String lastName,
                            Integer addressId,
                            String email,
                            Long storeId,
                            boolean active,
                            String userName,
                            String password,
                            Date lastUpdate,
                            String picture) {
        Staff staff = staffRepo.findById(staffId).orElseThrow(() -> new IllegalStateException
                ("staff with id " + staffId + " does not exists "));
        if (firstName != null && firstName.length() > 0 && !Objects.equals(staff.getFirstName(), firstName))
        {
            staff.setFirstName(firstName);
        }
        if (lastName != null && lastName.length() > 0 && !Objects.equals(staff.getLastName(), lastName))
        {
            staff.setLastName(lastName);
        }
        if (addressId != null && !Objects.equals(staff.getAddressId(), addressId)) {
            staff.setAddressId(addressId);
        }
        if (email != null && email.length() > 0 && !Objects.equals(staff.getEmail(), email)) {
            Optional<Staff> staffOptional = staffRepo.findStaffByEmail(email);
            if (staffOptional.isPresent()) {
                throw new IllegalStateException("email taken");
            }
            staff.setEmail(email);
        }
        if (storeId != null && !Objects.equals(staff.getStoreId(), storeId)) {
            staff.setStoreId(storeId);
        }
            staff.setActive(active);
        if (userName != null && userName.length() > 0 && !Objects.equals(staff.getUserName(), userName))
        {
            staff.setUserName(userName);
        }
        if (password != null && password.length() > 0 && !Objects.equals(staff.getPassword(), password))
        {
            staff.setPassword(password);
        }
            staff.setLastUpdate(lastUpdate);
        if (picture != null && picture.length() > 0 && !Objects.equals(staff.getPicture(), picture)) {
            staff.setPicture(picture);
        }
    }

    public Response addNewStaffTest(Staff staff) {
        Optional<Staff> staffOptional = staffRepo.findStaffByEmail(staff.getEmail());
        if (staffOptional.isPresent()) {
            throw new IllegalStateException("email taken");
        }
        staffRepo.save(staff);
        return null;
    }
}