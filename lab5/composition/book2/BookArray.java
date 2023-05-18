package lab5.composition.book2;

public class BookArray {
	private String name;
	private Author[] authors;
	private double price;
	private int qty = 0;

	public BookArray(String name, Author[] authors, double price) {
		this.name = name;
		this.authors = authors;
		this.price = price;
	}

	public BookArray(String name, Author[] authors, double price, int qty) {
		this.name = name;
		this.authors = authors;
		this.price = price;
		this.qty = qty;
	}

	public String getName() {
		return name;
	}

	public Author[] getAuthors() {
		return authors;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public String toString() {
		return "Book[name = " + getName() + ", " + getAuthorNames() + ", price = " + getPrice() + ", qty = " + getQty()
				+ "]";
	}

	public String getAuthorNames() {
		String authorNames = "";
		authorNames += authors[0];
		for (int i = 1; i < authors.length; i++) {
			authorNames = authorNames + ", " + authors[i];
		}
		return authorNames;
	}
}
