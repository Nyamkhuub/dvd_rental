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
@Entity(name = "rental")
public class Rental implements Serializable {

    private static final long serialVersionUID = 2976049132036415608L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rental_id", nullable = false)
    private Long rentalId;

    @Column(name = "rental_date", nullable = false)
    private Date rentalDate = new Date();

    @Column(name = "inventory_id", nullable = false)
    private Long inventoryId;

    @Column(name = "customer_id", nullable = false)
    private Long customerId;

    @Column(name = "return_date", nullable = false)
    private Date returnDate = new Date();

    @Column(name = "staff_id", nullable = false)
    private Long staffId;

    @Column(name = "last_update", nullable = false)
    private Date lastUpdate = new Date();
}