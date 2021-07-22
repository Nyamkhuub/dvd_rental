package mn.ictgroup.intern.main.service;

import java.util.List;
import java.util.Optional;

import mn.ictgroup.intern.main.dto.Response;
import mn.ictgroup.intern.main.entity.Actor;
import mn.ictgroup.intern.main.exception.ApiRequestException;
import mn.ictgroup.intern.main.repository.ActorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author B.Unubayar
 *
 */
@Service
public class ActorService {

    @Autowired
    private ActorRepository actorRepository;

    public List<Actor> getActorsByActorId(Long actorId) {
        return this.actorRepository.findByActorId(actorId);
    }

    public Actor addNewActor(Actor actor) {
        Optional<Actor>actorOptional = actorRepository.findActorByFirstName(actor.getFirstName());
        if(actorOptional.isPresent()){
            throw new ApiRequestException("FirstName taken");
        }
          return actorRepository.save(actor);
    }

    public Response updateActor(Actor actor) {
        Optional<Actor>actorOptional = actorRepository.findActorByLastName(actor.getLastName());
        if(actorOptional.isPresent()){
            throw new ApiRequestException("not done");
        }
        Actor newActor = actorOptional.get();
        newActor.setActorId(actor.getActorId());
        newActor.setFirstName(actor.getFirstName());
        newActor.setLastName(actor.getLastName());
        newActor.setLastUpdate(actor.getLastUpdate());
            actorRepository.save(newActor);
         return new Response ("done", "success");
        }

    public void deleteActor(Long actorId) {
       boolean exists = actorRepository.existsById(actorId);
       if (!exists){
           throw new ApiRequestException(actorId + "doesn't delete");
    }
       actorRepository.deleteByActorId(actorId);
    }
}