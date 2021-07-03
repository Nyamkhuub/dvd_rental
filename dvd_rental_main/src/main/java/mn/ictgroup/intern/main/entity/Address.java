package mn.ictgroup.intern.main.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@Entity(name = "address")
public class Address implements Serializable {
    private static final long serialVersionUID = 2976049132036415608L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_id")
    private Long addressId;

    @Column(name = "address", nullable = false)
    private Long address;

    @Column(name = "address2", nullable = false)
    private Long address2;

    @Column(name = "district", nullable = false)
    private Long district;

    @Column(name = "city_id", nullable = false)
    private Long cityId;

    @Column(name = "postal_code", nullable = false)
    private Long postalCode;

    @Column(name = "phone", nullable = false)
    private Long phone;

    @Column(name = "last_update")
    private Date lastUpdate = new Date();
}
