package mn.ictgroup.intern.main.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Unubayar
 *
 */
@Getter
@Setter
@Entity(name = "store")
public class Store implements Serializable {
    private static final long serialVersionUID = 2976049132036415608L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "store_id")
    private Long storeId;
    @Column(name = "manager_staff_id", nullable = false)
    private Long managerStaffId;
    @Column(name = "address_id", nullable = false)
    private Long addressId;
    @Column(name = "last_update")
    private Date lastUpdate = new Date();
}
