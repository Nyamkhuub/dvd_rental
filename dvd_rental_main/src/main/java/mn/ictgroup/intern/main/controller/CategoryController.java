package mn.ictgroup.intern.main.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import mn.ictgroup.intern.main.entity.Category;
import mn.ictgroup.intern.main.service.CategoryService;

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
    public List<Category> getCategoriesByCategoryId(@RequestParam Long categoryId) {
        return this.categoryService.getCategoriesByCategoryId(categoryId);
    }

    @PostMapping()
    public void addNewCategory(@RequestBody Category category) {
        categoryService.addNewCategory(category);
    }

    @DeleteMapping()
    public void deleteActor(@PathVariable("categoryId") Long categoryId) {
        categoryService.removeCategory(categoryId);
    }

}
