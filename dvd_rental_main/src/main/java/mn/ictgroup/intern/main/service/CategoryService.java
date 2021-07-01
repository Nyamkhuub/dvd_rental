package mn.ictgroup.intern.main.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mn.ictgroup.intern.main.entity.Category;
import mn.ictgroup.intern.main.repository.CategoryRepository;

/**
 *
 * @author Jimmy
 *
 */
@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepo;

    public List<Category> getCategoriesByCategoryId(Long categoryId) {
        return this.categoryRepo.findByCategoryId(categoryId);
    }
}