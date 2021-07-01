package mn.ictgroup.intern.main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mn.ictgroup.intern.main.entity.Language;

/**
 *
 * @author Jimmy
 *
 */
@Repository
public interface LanguageRepository extends JpaRepository<Language, Long> {

    /**
     * Жишээ байдлаар 1 функц бичив
     */
    List<Language> findByLanguageId(Long languageId);
}