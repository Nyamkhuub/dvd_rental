package mn.ictgroup.intern.main.service;

import java.util.List;
import java.util.Optional;

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
    private FilmRepository filmRepo;

    public List<Film> getFilmsByLanguageId(Long languageId) {
        return this.filmRepo.findByLanguageId(languageId);
    }
    public List<Film> getFilmsByFilmId(Long filmId) {
        return this.filmRepo.findByFilmId(filmId);
    }

    public void saveNewFilm(Film film) {
        Optional<Film> filmOptional = filmRepo.findByFilmLength(film.getLength());
        if (filmOptional.isPresent()) {
            throw new IllegalStateException("taken");
        }
        filmRepo.save(film);
    }
    public void removeFilm(Long filmId) {
        filmRepo.deleteById(filmId);
    }
}