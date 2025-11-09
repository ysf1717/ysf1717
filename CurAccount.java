 public class CurAccount extends BankAccount {

    double overDraftLimit = 5000;

    
 public void withdraw(double amount) {
        if (amount <= balance + overDraftLimit) {
            balance -= amount;
            System.out.println("Withdrew Rs" + amount + " (Overdraft allowed)");
        } else {
            System.out.println("Withdrawal exceeds overdraft limit.");
        }
    }
}


