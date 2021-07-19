package mn.ictgroup.intern.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping()
    public List<Film> getFilmsByFilmId(@RequestParam("filmId") Long filmId) {
        return this.filmService.getFilmsByFilmId(filmId);
    }
    @PostMapping()
    public void addNewFilm(@RequestBody Film film) {
        filmService.saveNewFilm(film);
    }

    @DeleteMapping()
    public void deleteFilm(@PathVariable("filmId") Long filmId) {
        filmService.removeFilm(filmId);
    }

}