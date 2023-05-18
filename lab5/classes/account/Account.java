package lab5.classes.account;

public class Account {

    private String id;
    private String name;
    private int balance;

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
        this.balance = 0;
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int credit(int amount) {
        return balance += amount;
    }

    public int debit(int amount) {
        if (amount <= getBalance()) {
            balance -= amount;
        } else {
            System.out.print("Amount exceeded balance");
        }
        return balance;
    }

    public int transferTo(Account another, int amount) {
        if (amount <= getBalance()) {
            balance -= amount;
            another.setBalance(amount + another.getBalance());
        } else {
            System.out.print("Amount exceeded balance");
        }
        return balance;
    }

    public String toString() {
        return "Account[id = " + getId() + ", name = " + getName() + ", balance = " + getBalance() + "]";
    }
}