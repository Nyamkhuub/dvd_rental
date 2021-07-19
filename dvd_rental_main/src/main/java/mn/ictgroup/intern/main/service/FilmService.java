package mn.ictgroup.intern.main.service;

import java.util.List;
import java.util.Optional;

import mn.ictgroup.intern.main.dto.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mn.ictgroup.intern.main.entity.Film;
import mn.ictgroup.intern.main.repository.FilmRepository;

/**
 *
 * @author Jimmy
 *
 */
@Service
public class FilmService {

    @Autowired
    private FilmRepository filmRepository;

    public List<Film> getFilmsByFilmId(Long filmId) {
        return this.filmRepository.findByFilmId(filmId);
    }

    public Response saveNewFilm(Film film) {
        Optional<Film> filmOptional = filmRepository.findByFilmTitle(film.getFilmTitle());
        if (filmOptional.isPresent()) {
            throw new IllegalStateException("taken");
        }
        filmRepository.save(film);
        return  new Response("done","done");
    }
    public void removeFilm(Long filmId) {
        filmRepository.deleteById(filmId);
    }
}