package mn.ictgroup.intern.main.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import mn.ictgroup.intern.main.dto.Response;
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
    private CategoryRepository categoryRepository;

    public List<Category> getCategoriesByCategoryId(Long categoryId) {
        return this.categoryRepository.findByCategoryId(categoryId);
    }

    public Response addNewCategory(Category category) {
        Optional<Category> categoryOptional = categoryRepository.findByCategoryName(category.getCategoryName());
        if (categoryOptional.isPresent()) {
            throw new IllegalStateException("taken");
        }
        categoryRepository.save(category);
        return new Response("done","done");
    }

    public void removeCategory(Long categoryId) {
        categoryRepository.deleteById(categoryId);
    }

}