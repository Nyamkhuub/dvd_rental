package mn.ictgroup.intern.main.repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mn.ictgroup.intern.main.entity.Category;

/**
 *
 * @author Jimmy
 *
 */
@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {


    List<Category> findByCategoryId(Long categoryId);

    Optional<Category> findByCategoryName(String categoryName);
}