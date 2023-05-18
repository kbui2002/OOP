package donggoi;

public class BankAccount {

    public static int count; // class atribute

    private int accountNumber; // instance atribute
    private double balance;

    public void setAccountNumber(int newAccountNumber) {
        this.accountNumber = newAccountNumber;
    }

    public void setBalance(int newBalance) {
        this.balance = newBalance;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public void initialized(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public int withDraw(int amount) {
        if(this.balance < amount) {
            return 0;
        } else {
            this.balance -= amount;
            return 1;
        }
    }

    public void deposit(double amount) { // instatnce method
        this.balance += amount;
    }

    public static int getCount() { // class method
        return count;
    }
}
