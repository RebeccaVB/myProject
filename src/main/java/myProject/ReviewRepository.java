package myProject;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class ReviewRepository {
	Map<Long, Review> reviewMap = new HashMap<Long, Review>();

	public ReviewRepository() {
		reviewMap.put(000L,
				new Review(000L, "Passengers", "/images/Passengers.jpg", "Movies for rent", "content", "02-17-2017"));
		reviewMap.put(001L,
				new Review(001L, "Doctor Strange", "/images/Doctor_Strange_poster.jpg", "Movies for rent", "content", "02-08-2017"));
		reviewMap.put(002L,
				new Review(002L, "Manchester By the Sea", "/images/Manchester.jpg", "Movies for rent", "content", "03-02-2017"));
	}

	public Review findOne(long id) {
		return reviewMap.get(id);
	}

	public Collection<Review> findAll() {
		return reviewMap.values();
	}
}