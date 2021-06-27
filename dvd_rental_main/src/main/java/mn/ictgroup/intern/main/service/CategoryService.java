package mn.ictgroup.intern.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mn.ictgroup.intern.main.entity.Inventory;
import mn.ictgroup.intern.main.repository.InventoryRepository;

/**
 *
 * @author Jimmy
 *
 */
@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepo;

    public List<Category> getCategoriesByName(String name) {
        return this.categoryRepo.findByName(name);
    }
    public List<Category> getCategoriesByCategoryId(Long categoryId) {
        return this.categoryRepo.findByCategoryId(categoryId);
    }
    public List<Category> getCategoriesByLastUpdate(Date lastUpdate) {
        return this.categoryRepo.findByLastUpdate(lastUpdate);
    }
}
