package mn.ictgroup.intern.main.controller;

import java.util.Date;
import java.util.List;

import mn.ictgroup.intern.main.dto.Response;
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

    @GetMapping(path = "staffId")
    public List<Staff> getStaffsByStaffId(@RequestParam Long staffId) {
        return this.staffService.getStaffsByStaffId(staffId);
    }

    @PostMapping(path = "addStaff")
     public void registerNewStaff(@RequestBody Staff staff){
         staffService.addNewStaff(staff);
     }
     @PostMapping(path = "add")
     public Response saveNewStaff(@RequestBody Staff staff) {
         return staffService.addNewStaffTest(staff);
     }

    @DeleteMapping(path = "{staffId}")
    public void deleteStaff(@PathVariable("staffId") Long staffId) {
        staffService.deleteStaff(staffId);
    }
    @PutMapping(path = "{staffId}")
    public void updateStaff(
            @PathVariable("staffId") Long staffId,
            @RequestParam(required = false) String firstName,
            @RequestParam(required = false) String lastName,
            @RequestParam(required = false) Integer addressId,
            @RequestParam(required = false) String email,
            @RequestParam(required = false) Long storeId,
            @RequestParam(required = false) boolean active,
            @RequestParam(required = false) String userName,
            @RequestParam(required = false) String password,
            @RequestParam(required = false) Date lastUpdate,
            @RequestParam(required = false) String picture) {
        staffService.updateStaff(staffId, firstName, lastName, addressId, email, storeId, active, userName, password, lastUpdate,picture);
    }
}