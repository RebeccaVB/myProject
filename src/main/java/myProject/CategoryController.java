package myProject;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CategoryController {
	
	@Resource
	private CategoryRepository categories;
	
    @RequestMapping("/categories")
    public String allCategories( Model model) {
        Iterable<Category> allCategories = categories.findAll();
    	model.addAttribute("categoriesAt", allCategories);
        return "categories";
    }
    @RequestMapping("/category")
    public String allCategory(@RequestParam ("id") Long id, Model model) {
        model.addAttribute("categoryAt", categories.findOne(id));
        return "category";
    }
   
}
