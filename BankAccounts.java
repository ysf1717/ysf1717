
 class BankAccount {
    double balance;

    void deposit(double amount) {
        System.out.println("Deposited Rs. " + amount);
        balance += amount;
    }

    void withDrawn(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew Rs. " + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    void displayBalance() {
        System.out.println("Balance: Rs. " + balance);
    }
}

public class BankAccounts {

    public static void main(String[] args) {
        System.out.println("Savings Account:");
        SavAccount sa = new SavAccount();
        sa.deposit(1000);
        sa.addInterest();
        sa.displayBalance();

        System.out.println("\nCurrent Account:");
        CurAccount ca = new CurAccount();
        ca.deposit(4000);
        ca.withdraw(8000);  // overdraft used
        ca.displayBalance();
    }
}

