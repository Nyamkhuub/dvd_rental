package mn.ictgroup.intern.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import mn.ictgroup.intern.main.entity.FilmCategory;
import mn.ictgroup.intern.main.service.FilmCategoryService;

/**
 *
 * @author Jimmy
 *
 */

@RestController
@RequestMapping("/filmCategory")
public class FilmCategoryController {

    @Autowired
    private FilmCategoryService filmCategoryService;

    @GetMapping()
    public List<FilmCategory> getFilmCategoriesByFilmId(@RequestParam Long filmId) {
        return this.filmCategoryService.getFilmCategoriesByFilmId(filmId);
    }
    @GetMapping()
    public List<FilmCategory> getFilmCategoriesByCategoryId(@RequestParam Long categoryId) {
        return this.filmCategoryService.getFilmCategoriesByCategoryId(categoryId);
    }
}