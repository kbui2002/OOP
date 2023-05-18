package lab8.anoclassanimal;

public class BigDog extends Dog {

	@Override
	public void greets() {
		System.out.println("Woow!");
	}

	@Override
	public void greets(Dog another) {
		System.out.println("Wooooooow!");
	}

}
