package mn.ictgroup.intern.main.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mn.ictgroup.intern.main.entity.FilmCategory;

/**
 *
 * @author Jimmy
 *
 */
@Repository
public interface FilmCategoryRepository extends JpaRepository<FilmCategory, Long> {

    List<FilmCategory> findByLastUpdate(Date lastUpdate);
}