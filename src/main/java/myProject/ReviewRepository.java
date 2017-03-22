package myProject;




import java.util.List;

import org.springframework.data.repository.CrudRepository;
//import org.springframework.stereotype.Component;

public interface ReviewRepository extends CrudRepository <Review, Long> {

	 List<Category> findById(long id);
}
	
	//	Map<Long, Review> reviewMap = new HashMap<Long, Review>();

//	public ReviewRepository() {
	//	reviewMap.put(000L,
		//		new Review(000L, "Passengers", "/images/Passengers.jpg", "author", "content"));
		//reviewMap.put(001L,
			//	new Review(001L, "Doctor Strange", "/images/Doctor_Strange_poster.jpg", "author", "content"));
		//reviewMap.put(002L,
			//	new Review(002L, "Manchester By the Sea", "/images/Manchester.jpg", "author", "content"));
	//}

	//public Review findOne(long id) {
		//return reviewMap.get(id);
	//}

	//public Collection<Review> findAll() {
	//	return reviewMap.values();
//	}
//}