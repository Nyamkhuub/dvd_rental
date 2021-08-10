package mn.ictgroup.intern.main.controller;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import mn.ictgroup.intern.main.entity.Staff;
import mn.ictgroup.intern.main.service.StaffService;

/**
 *
 * @author Jimmy
 *
 */

@RestController
@RequestMapping("/staff")
public class StaffController {

    @Autowired
    private StaffService staffService;

    @GetMapping()
    public List<Staff> getStaffsByStaffId(@RequestParam Long staffId) {
        return this.staffService.getStaffsByStaffId(staffId);
    }

    @PostMapping()
    public void saveNewStaff(@RequestBody Staff staff) {
        staffService.addNewStaffTest(staff);
     }

    @DeleteMapping()
    public void deleteStaff(@PathVariable("staffId") Long staffId) {
        staffService.deleteStaff(staffId);
    }
/**
    @PutMapping()
    public void updateStaff(Staff staff) {
        staffService.updateStaff(staff.getStaffId(), staff.getFirstName(), staff.getLastName(), staff.getAddressId(), staff.getEmail(), staff.getStoreId(), staff.getActive(), staff.getUserName(), staff.getPassword(), staff.getLastUpdate(),staff.getPicture());
    }
    */
}