package myProject;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Review {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	String title;
	String imageUrl;
	String content;
	
	@ManyToOne
	private Category category;
	
	private Review() {
	}
	

	public Review(long id, String title, String imageUrl, Category category, String content) {
		super();
		this.id = id;
		this.title = title;
		this.imageUrl = imageUrl;
		this.category = category;
		this.content = content;
		}
	

	public long getId() {
		return id;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getImageUrl() {
		return imageUrl;
	}
	
	public Category getCategory() {
		return category;
	}
	
	public String getContent() {
		return content;
	}

}