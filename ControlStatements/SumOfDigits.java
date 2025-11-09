package ControlStatements;

public class SumOfDigits {

    public static int sumOfNums(int num){
        int sum = 0;
        num = Math.abs(num); //to handle negative numbers.. it converts negative to positive

 while (num >0){
    int digit = num%10; //get the last digit
    sum += digit;// add it to sum
    num/=10; //to remove the last digit
 }
    return sum;

}

public static void main(String[] args) {
    int num = 123456789;
    System.out.println("The Sum of " + num + " is " + sumOfNums(num));
}
    }


