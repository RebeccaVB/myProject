package myProject;

public class Review {
	long id;
	String title;
	String imageURL;
	String content;
	String category;
	String date;

	public Review(long id, String title, String imageURL, String content, String category, String date) {
		this.id = id;
		this.title = title;
		this.imageURL = imageURL;
		this.content = content;
		this.category = category;
		this.date = date;
	}

	public String gettitle() {
		return title;
	}

	public long getId() {
		return id;
	}

	public String getImage() {
		return imageURL;
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
