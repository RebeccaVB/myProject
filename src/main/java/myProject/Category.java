package myProject;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	long id;
	String name;
	

	@OneToMany(mappedBy = "category", fetch = FetchType.EAGER)
	private Collection<Review> review;
	
	public void String(long id, String name, Collection<Review> review){
		this.id = id;
		this.name = name;
		this.review = review;
	}
	
	public Collection<Review> getReviews() {
		return review;
	}
	public String getName(){
		return name;
	}
}
