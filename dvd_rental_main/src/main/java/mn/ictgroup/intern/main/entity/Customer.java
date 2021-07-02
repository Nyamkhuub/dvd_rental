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
 * unubayar
 *
 */
@Getter
@Setter
@Entity(name = "customer")
public class Customer implements Serializable {

	private static final long serialVersionUID = 2976049132036415608L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "customer_id")
	private Long customerId;

	@Column(name = "store_id", nullable = false)
	private Integer storeId;

	@Column(name = "first_name", nullable = false)
	private String firstName;

	@Column(name = "last_name", nullable = false)
	private String lastName;

	@Column(name = "email", nullable = false)
	private String email;

	@Column(name = "address_id", nullable = false)
	private Integer addressId;

	@Column(name = "active_bool", nullable = false)
	private boolean activeBool;

	@Column(name = "create_date")
	private Date createDate = new Date();

	@Column(name = "last_update")
	private Date lastUpdate = new Date();

	@Column(name = "active", nullable = false)
	private Integer active;

}
