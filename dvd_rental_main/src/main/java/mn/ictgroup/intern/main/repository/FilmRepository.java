package mn.ictgroup.intern.main.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mn.ictgroup.intern.main.entity.Film;

/**
 *
 * @author Jimmy
 *
 */
@Repository
public interface FilmRepository extends JpaRepository<Film, Long> {

    List<Film> findByLanguageId(Long LanguageId);

    List<Film> findByFilmId(Long filmId);

    Optional<Film> findByFilmLength(Long length);

}