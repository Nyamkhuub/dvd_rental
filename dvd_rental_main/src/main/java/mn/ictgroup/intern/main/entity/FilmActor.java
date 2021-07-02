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
@Entity(name = "film_actor")
public class FilmActor implements Serializable {

    private static final long serialVersionUID = 2976049132036415608L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "actor_id", nullable = false)
    private Long actorId;

    @Column(name = "film_id", nullable = false)
    private Long filmId;

    @Column(name = "last_update")
    private Date lastUpdate = new Date();
}