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
@Entity(name = "film")
public class Film implements Serializable {

    private static final long serialVersionUID = 2976049132036415608L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "film_id", nullable = false)
    private Long filmId;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "release_year")
    private Date releaseYear = new Date();

    @Column(name = "language_id", nullable = false)
    public Integer languageId;

    @Column(name = "rental_duration", nullable = false)
    public Integer rentalDuration;

    @Column(name = "rantal_rate", nullable = false)

    @Column(name = "length")
    public Integer length;

    @Column(name = "replacement_cost", nullable = false)
    @Column(name = "rating", nullable = false)
    @Column(name = "last_update", nullable = false)
    private Date lastUpdate = new Date();

    @Column(name = "special_features")
    private String specialFeatures;

    @Column(name = "fulltext", nullable = false)
    private String fulltext;

}
