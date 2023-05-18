package lab5.composition.book2;

public class TestBookArray {
	public static void main(String[] args) {
		// Declare and allocate an array of Authors
		Author[] authors = new Author[2];
		authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
		authors[1] = new Author("Paul Tan", "Paul@somwwhere.com", 'm');

		// Declare and allocate a Book instance
		BookArray javaDummy = new BookArray("Java for Dummy", authors, 19.99, 99);
		System.out.println(javaDummy);
	}
}
