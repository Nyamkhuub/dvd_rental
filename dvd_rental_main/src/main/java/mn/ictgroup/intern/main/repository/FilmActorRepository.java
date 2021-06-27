package mn.ictgroup.intern.main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mn.ictgroup.intern.main.entity.Inventory;

/**
 *
 * @author Jimmy
 *
 */
@Repository
public interface FilmActorRepository extends JpaRepository<FilmActor, Long> {

    /**
     * Жишээ байдлаар 1 функц бичив
     */
    List<FilmActor> findByFilmId(Long filmId);
}
