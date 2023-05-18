package lab5.composition.account;

public class Account {
	private int id;
	private Customer customer;
	private double balance = 0.0;

	public Account(int id, Customer customer, double balance) {
		this.id = id;
		this.customer = customer;
		this.balance = balance;
	}

	public Account(int id, Customer customer) {
		this.id = id;
		this.customer = customer;
	}

	public int getID() {
		return id;
	}

	public Customer getCustomer() {
		return customer;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String toString() {
		return customer.toString() + " balance = $" + getBalance();
	}

	public String getCustomerName() {
		return customer.getName();
	}

	public Account deposit(double amount) {
		return new Account(id, customer, balance + amount);
	}

	public Account withdraw(double amount) {
		if (getBalance() >= amount) {
			return new Account(id, customer, balance - amount);
		} else {
			System.out.println("amount widthdrawn exceeds the current balance!");
		}
		return new Account(id, customer, balance);
	}
}
