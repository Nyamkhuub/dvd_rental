package mn.ictgroup.intern.main.service;

import java.util.List;
import java.util.Optional;

import mn.ictgroup.intern.main.entity.Actor;
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

    public void addNewActor(Actor actor) {
        Optional<Actor>actorOptional = actorRepository.findActorByFirstName(actor.getFirstName());
      actorRepository.save(actor);
    }
//    public void updateActor(Actor actor) {
//        actorRepository.updateByActor(actor);
//    }

    public void deleteActor(Long actorId) {
        actorRepository.deleteByActorId(actorId);
    }


//    public Response addNewActor(Actor actor) {
//        Optional<Actor>actorOptional = actorRepository.findActorByFirstName(actor.getFirstName());
//        actorRepository.save(actor);
//        return null;
//    }
}