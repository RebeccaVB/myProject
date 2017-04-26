package myProject;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReviewController {

	@Resource
	private ReviewRepository reviews;
	
    @RequestMapping("/reviews")
    public Iterable<Review> showReviews(){
    	return reviews.findAll();
    }
    @RequestMapping("/review-view")
    public Review showReview(@PathVariable Long id){
    	return reviews.findOne(id);
    }
}