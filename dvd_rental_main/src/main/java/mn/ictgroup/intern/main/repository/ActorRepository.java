package mn.ictgroup.intern.main.repository;

import java.util.List;
import java.util.Optional;

import mn.ictgroup.intern.main.dto.Response;
import mn.ictgroup.intern.main.entity.Actor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 *
 * @author B.Unubayar
 *
 */
@Repository
public interface ActorRepository extends JpaRepository<Actor, Long> {

    List<Actor> findByActorId(Long actorId);

    Optional<Actor> findActorByFirstName(String firstName);
//
//    void updateByActor(Actor actor);

    void deleteByActorId(Long actorId);


//    Optional<Actor> findActorByFirstName(String firstName);

}
