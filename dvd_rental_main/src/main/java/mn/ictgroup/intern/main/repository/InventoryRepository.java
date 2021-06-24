package mn.ictgroup.intern.main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mn.ictgroup.intern.main.entity.Inventory;

/**
 * 
 * @author B.Nyamkhuu
 *
 */
@Repository
public interface InventoryRepository extends JpaRepository<Inventory, Long> {
	
	/**
	 * Жишээ байдлаар 1 функц бичив
	 */
	List<Inventory> findByFilmId(Long filmId);
}
