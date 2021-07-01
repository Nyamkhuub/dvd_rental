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
@Entity(name = "category")
public class Category implements Serializable {

    private static final long serialVersionUID = 2976049132036415608L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id", nullable = false)
    private Long categoryId;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "last_update", nullable = false)
    private Date lastUpdate = new Date();
}