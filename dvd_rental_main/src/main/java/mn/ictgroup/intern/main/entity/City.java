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
@Entity(name = "city")
public class City implements Serializable {

    private static final long serialVersionUID = 2976049132036415608L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "city_id")
    private Long cityId;

    @Column(name = "city", nullable = false)
    private String city;

    @Column(name = "country_id", nullable = false)
    private integer countryId;

    @Column(name = "last_update")
    private Date lastUpdate = new Date();
}
