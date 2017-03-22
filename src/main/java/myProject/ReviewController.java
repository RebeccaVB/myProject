package myProject;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ReviewController {

	@Resource
	private ReviewRepository reviews;
	
    @RequestMapping("/reviews")
    public String allReviews( Model model) {
        model.addAttribute("reviews", reviews.findAll());
       return "reviews";
    }
    @RequestMapping("/review-view")
    public String singleReview(@RequestParam (value = "id") Long id, Model model) {
        model.addAttribute("review-view", reviews.findOne(id));
       return "review-view";
    }
}