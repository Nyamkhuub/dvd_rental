package mn.ictgroup.intern.main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mn.ictgroup.intern.main.entity.FilmActor;

/**
 *
 * @author Jimmy
 *
 */
@Repository
public interface FilmActorRepository extends JpaRepository<FilmActor, Long> {


    List<FilmActor> findByFilmId(Long filmId);

    List<FilmActor> findByActorId(Long actorId);
}