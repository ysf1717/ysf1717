 public class SavAccount extends BankAccount {

double interestRate = 0.05;
public void addInterest (){
 double interest = balance * interestRate;
        balance += interest;
        System.out.println("Interest added: Rs" + interest);

    
}

}