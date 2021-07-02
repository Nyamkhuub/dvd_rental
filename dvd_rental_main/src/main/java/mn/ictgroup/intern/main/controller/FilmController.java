package mn.ictgroup.intern.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import mn.ictgroup.intern.main.entity.Film;
import mn.ictgroup.intern.main.service.FilmService;

/**
 *
 * @author Jimmy
 *
 */

@RestController
@RequestMapping("/film")
public class FilmController {

    @Autowired
    private FilmService filmService;

    @GetMapping("filmId")
    public List<Film> getFilmsByFilmId(@RequestParam("filmId") Long filmId) {
        return this.filmService.getFilmsByFilmId(filmId);
    }
    @GetMapping("languageId")
    public List<Film> getFilmsByLanguageId(@RequestParam Long languageId) {
        return this.filmService.getFilmsByLanguageId(languageId);
    }
}