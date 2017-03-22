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
	String author;
	Date date;
	
	@ManyToOne
	private Category category;
	

	public Review(long id, String title, String imageUrl, String reviewCategory, String content, Category category ) {
		super();
		this.id = id;
		this.title = title;
		this.imageUrl = imageUrl;
		this.category = category;
		this.content = content;
		}
	
	@Override
	public String toString() {
		return String.format("Review[id=%d, title='%s', category='%s']", id, title, category);
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