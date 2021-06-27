package mn.ictgroup.intern.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import mn.ictgroup.intern.main.entity.Inventory;
import mn.ictgroup.intern.main.service.InventoryService;

/**
 *
 * @author Jimmy
 *
 */

@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping()
    public List<Category> getCategoiesByName(@RequestParam String name) {
        return this.categoryService.getCategoriesByName(name);
    }
    @GetMapping()
    public List<Category> getCategoiesByCategoryId(@RequestParam Long categoryId) {
        return this.categoryService.getCategoriesByCategoyId(categoryId);
    }
    @GetMapping()
    public List<Category> getCategoiesByLastUpdate(@RequestParam Date lastUpdate) {
        return this.categoryService.getCategoriesByLastUpdate(lastUpdate);
    }

}
