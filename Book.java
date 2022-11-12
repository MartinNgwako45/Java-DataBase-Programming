public class Book {
	
	private String id;
	private String title;
	private String author;
	private Integer qty;

	public Book() {


	}

	//constructors
	public Book(String id, String title, String author, Integer qty) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.qty = qty;
	}

	// getters and setters method
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Integer getQty() {
		return qty;
	}
	public void setQty(Integer qty) {
		this.qty = qty;
	}
}
