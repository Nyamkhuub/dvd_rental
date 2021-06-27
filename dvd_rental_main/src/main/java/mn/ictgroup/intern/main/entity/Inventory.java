package mn.ictgroup.intern.main.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.Setter;

/**
 * 
 * @author B.Nyamkhuu
 * 
 * @description - Lombok dependency ашигласнаар заавал getter setter функц бичиж
 *              цаг үрэх шаардлагагүй болж байгаа
 * 
 *              - Class
 */

@Getter
@Setter
@Entity(name = "inventory")
public class Inventory implements Serializable {

	private static final long serialVersionUID = 2976049132036415608L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "inventory_id")
	private Long inventoryId;

	@Column(name = "film_id", nullable = false)
	private Long filmId;

	@Column(name = "store_id", nullable = false)
	private Long storeId;

	/**
	 * default утга сэт хийж өгөхдөө шууд утга оноогоод орхиж болно.
	 */
	@Column(name = "last_update")
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastUpdate = new Date();
}
