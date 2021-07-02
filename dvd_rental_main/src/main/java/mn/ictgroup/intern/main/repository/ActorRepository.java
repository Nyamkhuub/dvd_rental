package mn.ictgroup.intern.main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mn.ictgroup.intern.main.entity.Actor;

/**
 *
 * Unubayar
 *
 */
@Repository
public interface ActorRepository extends JpaRepository<Actor, Long> {

    List<Actor> findByActorId(Long actorId);
}
