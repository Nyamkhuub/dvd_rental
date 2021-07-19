package mn.ictgroup.intern.main.service;

import java.util.Date;
import java.util.List;

import mn.ictgroup.intern.main.entity.FilmCategory;
import mn.ictgroup.intern.main.repository.FilmCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



/**
 *
 * @author Jimmy
 *
 */
@Service
public class FilmCategoryService {

    @Autowired
    private FilmCategoryRepository filmCategoryRepository;

    public List<FilmCategory> getFilmCategoriesByLastUpdate(Date lastUpdate) {
        return this.filmCategoryRepository.findByLastUpdate(lastUpdate);
    }
}