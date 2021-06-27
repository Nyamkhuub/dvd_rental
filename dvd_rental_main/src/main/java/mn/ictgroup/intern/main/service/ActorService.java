package mn.ictgroup.intern.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mn.ictgroup.intern.main.entity.Actor;
import mn.ictgroup.intern.main.repository.ActorRepository;

/**
 *
 * Unubayar
 *
 */
@Service
public class ActorService {

    @Autowired
    private ActorRepository actorRepo;

    public List<Actor> getActorsByActorId(Long actorId) {
        return this.actorRepo.findByActorId(actorId);
    }
}
