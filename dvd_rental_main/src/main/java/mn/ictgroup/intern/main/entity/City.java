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
@Entity(name = "city")
public class City implements Serializable {
    private static final long serialVersionUID = 2976049132036415608L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "city_id")
    private Long cityId;
    @Column(name = "city", nullable = false)
    private Long city;
    @Column(name = "country_id", nullable = false)
    private Long countryId;
    @Column(name = "last_update")
    private Date lastUpdate = new Date();
}
