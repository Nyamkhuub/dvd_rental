package mn.ictgroup.intern.main.controller;

import java.util.List;

import mn.ictgroup.intern.main.dto.Response;
import mn.ictgroup.intern.main.entity.Actor;
import mn.ictgroup.intern.main.service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author B.Unubayar
 *
 */

@RestController
@RequestMapping("/actor")
public class ActorController {

    @Autowired
    private ActorService actorService;

    @GetMapping()
    public List<Actor> getActorsByActorId(@RequestParam Long actorId) {
        return this.actorService.getActorsByActorId(actorId);
    }

    @PostMapping()
    public Actor saveNewActor(@RequestBody Actor actor){
        return actorService.addNewActor(actor);
    }

    @PutMapping()
    public Response addActor(@RequestBody Actor actor){
       return actorService.updateActor(actor);
    }


    @DeleteMapping()
    public void wrongActor(@PathVariable("actorId") Long actorId){
        actorService.deleteActor(actorId);
    }
}


