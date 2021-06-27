package mn.ictgroup.intern.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mn.ictgroup.intern.main.entity.Inventory;
import mn.ictgroup.intern.main.repository.InventoryRepository;

/**
 *
 * @author Jimmy
 *
 */
@Service
public class FilmActorService {

    @Autowired
    private FilmActorRepository filmActorRepo;

    public List<FilmActor> getFilmActorsByFilmId(Long filmId) {
        return this.filmActorRepo.findByFilmId(filmId);
    }
}
