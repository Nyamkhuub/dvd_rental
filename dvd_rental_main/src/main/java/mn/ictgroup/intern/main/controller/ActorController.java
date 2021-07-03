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


    @GetMapping(path = "actorId")
    public List<Actor> getActorsByActorId(@RequestParam Long actorId) {
        return this.actorService.getActorsByActorId(actorId);
    }

    @PostMapping(path = "add")
    public void saveNewActor(@RequestBody Actor actor) {
        actorService.addNewActor(actor);
    }

//    @PutMapping(path = "update")
//    public void addActor(@RequestBody Actor actor){
//        actorService.updateActor(actor);
//    }
    @DeleteMapping(path = "{actorId}")
    public void wrongActor(@PathVariable("actorId") Long actorId){
        actorService.deleteActor(actorId);
    }

}
    /**
     * PostMapping use Response
    @PostMapping(path = "addActor")
    public Response saveNewActor(@RequestBody Actor actor){
       return actorService.addNewActor(actor);
    }
  */

