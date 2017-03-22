package myProject;

import java.util.Collection;
import java.util.Collections;

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
	private Collection<Review> reviews;

	protected Category() {
	}

	public Category(long id, String name) {
		this(id, name, Collections.emptyList());
	}

	public Category(long id, String name, Collection<Review> reviews) {
		this.id = id;
		this.name = name;
		this.reviews = reviews;
	}

	public Collection<Review> getReviews() {
		return reviews;
	}

	public String getName() {
		return name;
	}

	public long getId() {
		return id;
	}
}
