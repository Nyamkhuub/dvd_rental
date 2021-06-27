package mn.ictgroup.intern.main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mn.ictgroup.intern.main.entity.Inventory;

/**
 *
 * @author Jimmy
 *
 */
@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

    List<Category> findByName(String name);
    List<Category> findByCategoryId(Long categoryId);
    List<Category> fingByLastUpdate(Date lastUpdate);
}
