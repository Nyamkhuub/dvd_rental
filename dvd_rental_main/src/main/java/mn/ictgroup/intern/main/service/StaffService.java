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
    private StaffRepository staffRepository;


    public List<Staff> getStaffsByStaffId(Long staffId) {
        return this.staffRepository.findByStaffId(staffId);
    }

    public void addNewStaff(Staff staff) {
        Optional<Staff> staffOptional = staffRepository.findStaffByEmail(staff.getEmail());
        if (staffOptional.isPresent()) {
            throw new IllegalStateException("taken");
        }
        staffRepository.save(staff);
    }
    public Response addNewStaffTest(Staff staff) {
        Optional<Staff> staffOptional = staffRepository.findStaffByFirstName(staff.getFirstName());
        if (staffOptional.isPresent()) {
            throw new IllegalStateException("taken");
        }
        staffRepository.save(staff);
        return new Response("done","done");
    }
    public void deleteStaff(Long staffId) {
        boolean exists = staffRepository.existsById(staffId);
        if (!exists) {
            throw new IllegalStateException("staff with id " + staffId + " does not exists");
        }
        staffRepository.deleteById(staffId);
    }
    /**
    @Transactional
    public Response updateStaff(Staff staff) {
        Optional<Staff> staffOptional = staffRepository.findStaffByFirstName(staff.getFirstName());

        if (staffOptional.isPresent()) {
            throw new IllegalStateException("taken");
        }
            staff.setFirstName(staff.getFirstName());
            staff.setLastName(staff.getLastName());
            staff.setAddressId(staff.getAddressId());
            staff.setEmail(staff.getEmail());
            staff.setStoreId(staff.getStoreId());
            staff.setActive(staff.getActive());
            staff.setUserName(staff.getUserName());
            staff.setPassword(staff.getPassword());
            staff.setLastUpdate(staff.getLastUpdate());
            staff.setPicture(staff.getPicture());
            staffRepository.save(staff);
            return new Response("done","done");
    }

    public void updateStaff(Long staffId, String firstName, String lastName, Long addressId, String email, Long storeId, Boolean active, String userName, String password, Date lastUpdate, String picture) {
    }
    */
}