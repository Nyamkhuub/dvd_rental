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
@Entity(name = "country")
public class Country implements Serializable {
    private static final long serialVersionUID = 2976049132036415608L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "country_id")
    private Long countryId;

    @Column(name = "country", nullable = false)
    private Long country;

    @Column(name = "last_update", nullable = false)
    private Date lastUpdate = new Date();
}
