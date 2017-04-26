package myProject;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoryController {

	@Resource
	private CategoryRepository repository;

	@RequestMapping("/categories")
	public Iterable<Category> showCategories() {
		return repository.findAll();
	}
	

	@RequestMapping("/category")
	public Category showCategory(@PathVariable Long id) {
		return repository.findOne(id);
	}

}