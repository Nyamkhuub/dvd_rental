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
public class FilmService {

    @Autowired
    private FilmRepository filmRepo;

    public List<Film> getFilmsByLanguageId(Long languageId) {
        return this.filmRepo.findByLanguageId(languageId);
    }
}
