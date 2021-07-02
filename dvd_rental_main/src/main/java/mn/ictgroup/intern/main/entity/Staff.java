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
 * @author Jimmy
 *
 * @description - Lombok dependency ашигласнаар заавал getter setter функц бичиж цаг
 * үрэх шаардлагагүй болж байгаа
 */

@Getter
@Setter
@Entity(name = "staff")
public class Staff implements Serializable {

    private static final long serialVersionUID = 2976049132036415608L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "staff_id", nullable = false)
    private Long staffId;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "address_id", nullable = false)
    private Integer addressId;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "store_id", nullable = false)
    private Long storeId;

    @Column(name = "active", nullable = false)
    private boolean active;

    @Column(name = "username", nullable = false)
    private String userName;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "last_update")
    private Date lastUpdate = new Date();

    @Column(name = "picture", nullable = false)
    private String picture;
}