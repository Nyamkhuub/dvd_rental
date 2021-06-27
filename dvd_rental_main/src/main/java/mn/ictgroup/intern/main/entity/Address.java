package mn.ictgroup.intern.main.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * Unubayar
 *
 */

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
    private String address;

    @Column(name = "address2", nullable = false)
    private String address2;

    @Column(name = "ditrict", nullable = false)
    private String district;

    @Column(name = "city_id", nullable = false)
    private Integer cityId;

    @Column(name = "postal_code", nullable = false)
    private String postalCode;

    @Column(name = "phone", nullable = false)
    private String phone;

    @Column(name = "last_update")
    private Date lastUpdate = new Date();
}
