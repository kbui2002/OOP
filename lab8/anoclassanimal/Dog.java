package lab8.anoclassanimal;

public class Dog extends Animal {

	@Override
	public void greets() {
		System.out.println("Woof!");
	}

	public void greets(Dog another) {
		System.out.println("Woooof!");
	}
}
