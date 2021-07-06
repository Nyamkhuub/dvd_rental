package mn.ictgroup.intern.main.repository;

import java.util.List;
import java.util.Optional;

import mn.ictgroup.intern.main.entity.Actor;
import org.hibernate.annotations.Parent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
/**
 *
 * @author B.Unubayar
 *
 */
@Repository
public interface ActorRepository extends JpaRepository<Actor, Long> {
    /**
    @Query(value = "FROM Actor WHERE firstName = ?1", nativeQuery = true)
    List<Actor> findByFirstName(Long firstName);

    @Query(value = "SELECT a FROM Actor a WHERE firstName = ?1 AND lastName = ?2", nativeQuery = true)
    List<Actor> findByFirstNameAndLastName(Long firstName, Long lastName);

    @Query(value = "SELECT * from actor a inner join film_actor f on f.actorId=a.actorId where TIMESTAMPDIFF(SECOND, a.ts, CURRENT_TIMESTAMP) < :firstName", nativeQuery = true)
    Parent findOneByFirstName(@Parent("firstName") long firstName);
*/

    List<Actor> findByActorId(Long actorId);

    Optional<Actor> findActorByFirstName(String firstName);

    Optional<Actor> findActorByLastName(String lastName);

    void deleteByActorId(Long actorId);


//    Optional<Actor> findActorByFirstName(String firstName);
}
