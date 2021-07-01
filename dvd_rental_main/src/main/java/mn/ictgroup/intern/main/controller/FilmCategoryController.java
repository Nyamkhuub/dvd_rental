package mn.ictgroup.intern.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import mn.ictgroup.intern.main.entity.FilmCategory;
import mn.ictgroup.intern.main.service.FilmCategoryService;

/**
 *
 * @author Jimmy
 *
 */

@RestController
@RequestMapping("/filmcategory")
public class FilmCategoryController {

    @Autowired
    private FilmCategoryService filmCategoryService;

    @GetMapping()
    public List<FilmCategory> getFilmCategoriesByFilmId(@RequestParam Long filmId) {
        return this.filmCategoryService.getFilmCategoriesByFilmId(filmId);
    }
}