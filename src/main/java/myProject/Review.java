package myProject;

public class Review {
	long id;
	String title;
	String imageUrl;
	String content;
	String category;
	String date;

	public Review(long id, String title, String imageUrl, String content, String category, String date) {
		this.id = id;
		this.title = title;
		this.imageUrl = imageUrl;
		this.content = content;
		this.category = category;
		this.date = date;
	}

	public String getTitle() {
		return title;
	}

	public long getId() {
		return id;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public String getContent() {
		return content;
	}

	public String getCategory() {
		return category;
	}

	public String getDate() {
		return date;
	}
}
