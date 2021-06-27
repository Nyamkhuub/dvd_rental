package mn.ictgroup.intern.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import mn.ictgroup.intern.main.entity.Actor;
import mn.ictgroup.intern.main.service.ActorService;

/**
 *
 * Unubayar
 *
 */

@RestController
@RequestMapping("/actor")
public class ActorController {

    @Autowired
    private ActorService actorService;

    @GetMapping()
    public List<Store> getActorsByActorId(@RequestParam Long actorId) {
        return this.actorService.getActorsByActorId(actorId);
    }
}
