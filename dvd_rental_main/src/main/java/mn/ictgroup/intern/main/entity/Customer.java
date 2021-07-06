package mn.ictgroup.intern.main.entity;

import lombok.Getter;
import lombok.Setter;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

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
@Entity (name = "customer")
public class Customer implements Serializable {
    private static final long serialVersionUID = 2976049132036415608L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private Long customerId;

    @Column(name = "store_id", nullable = false)
    private Long storeId;

    @Column(name ="first_name", nullable = false)
    private Long firstName;

    @Column(name = "last_name", nullable = false)
    private Long lastName;

    @Column(name = "email", nullable = false)
    private Long email;

    @Column(name = "address_id", nullable = false)
    private Long addressId;

    @Column(name = "active_bool", nullable = false)
    private Boolean activeBool;

    @Column(name = "create_date")
    private Date createDate = new Date();

    @Column(name = "last_update")
    private Date lastUpdate = new Date();

    @Column(name = "active", nullable = false)
    private Long create;

}
