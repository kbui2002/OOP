package lab5.composition.book2;

public class TestAuthor {
	public static void main(String[] args) {
		Author ahTeck = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
		// Test the constructor
		System.out.println(ahTeck);
		ahTeck.setEmail("paulTan@nowhere.com");
		System.out.println("name is: " + ahTeck.getName());
		System.out.println("email is: " + ahTeck.getEmail());
		System.out.println("gender is: " + ahTeck.getGender());
	}
}