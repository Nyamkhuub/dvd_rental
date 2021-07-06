package mn.ictgroup.intern.main.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Unubayar
 *
 */

@Getter
@Setter
@Entity(name = "payment")
public class Payment implements Serializable {
    private static final long serialVersionUID = 2976049132036415608L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "payment_id")
    private Long paymentId;
    @Column(name = "customer_id", nullable = false)
    private Long customerId;
    @Column(name = "staff_id", nullable = false)
    private Long staffId;
    @Column(name = "rental_id", nullable = false)
    private Long rentalId;
    @Column(name = "amount", nullable = false)
    private BigDecimal amount;

    @Column(name = "payment_date")
    private Date paymentDate = new Date();
}
