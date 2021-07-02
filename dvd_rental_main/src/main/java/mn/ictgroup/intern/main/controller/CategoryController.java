package mn.ictgroup.intern.main.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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


}
