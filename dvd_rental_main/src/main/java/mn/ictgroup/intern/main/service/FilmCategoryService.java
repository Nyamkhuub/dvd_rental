package mn.ictgroup.intern.main.service;

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
    private FilmCategoryRepository filmCategoryRepo;

    public List<FilmCategory> getFilmCategoriesByFilmId(Long filmId) { return this.filmCategoryRepo.findByFilmId(filmId); }

    public List<FilmCategory> getFilmCategoriesByCategoryId(Long categoryId) {
        return this.filmCategoryRepo.findByCategoryId(categoryId);
    }
}