package lab5.composition.account;

public class TestAccount2 {
	public static void main(String[] args) {
		// Test Customer class
		Customer customer1 = new Customer(88, "Tan Ah Teck", 'm');
		System.out.println(customer1);
		System.out.println("id is: " + customer1.getID());
		System.out.println("name is: " + customer1.getName());
		// System.out.println("discount is: " + customer1.getDiscount());

		// Test Account class
		Account account1 = new Account(88, customer1, 88.8);
		System.out.println(account1);

		account1.setBalance(99.9);
		System.out.println(account1);
		System.out.println("id is: " + account1.getID());
		System.out.println("account is: " + account1.getCustomer());
		System.out.println("balance is: " + account1.getBalance());
		System.out.println("account's name is: " + account1.getCustomerName());
		System.out.println("account's name is: " + account1.getCustomer().getName());
		System.out.println("deposit: " + account1.deposit(10));
		System.out.println("widthdraw: " + account1.withdraw(100));
	}
}
