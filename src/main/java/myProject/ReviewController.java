package myProject;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ReviewController {

	@Resource
	private ReviewRepository reviewMap;
	
    @RequestMapping("/reviews")
    public String allReviews( Model model) {
        model.addAttribute("reviews", reviewMap.findAll());
        return "reviews";
    }
    @RequestMapping("/review{id}")
    public String singleReview(@RequestParam ("id") Long id, Model model) {
        model.addAttribute("review", reviewMap.findOne(id));
        return "review";
    }
}