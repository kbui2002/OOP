package donggoi;

public class BankOpperation {
    public static void main(String[] args) {
        BankAccount newAccount1 = new BankAccount();
        BankAccount newAccount2 = new BankAccount();

        newAccount1.setAccountNumber(234567);
        
        double balance = newAccount1.getBalance();
    }
}
