package mn.ictgroup.intern.main.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import mn.ictgroup.intern.main.entity.FilmActor;
import mn.ictgroup.intern.main.service.FilmActorService;

/**
 *
 * @author Jimmy
 *
 */

@RestController
@RequestMapping("/filmActor")
public class FilmActorController {

    @Autowired
    private FilmActorService filmActorService;

    @GetMapping()
    public List<FilmActor> getFilmActorsByLastUpdate(@RequestParam() Date lastUpdate) {
        return this.filmActorService.getFilmActorsByLastUpdate(lastUpdate);
    }
}