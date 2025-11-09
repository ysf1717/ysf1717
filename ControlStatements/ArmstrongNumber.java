package ControlStatements;

public class ArmstrongNumber {
//A number is an Armstrong number if the sum of its digits raised 
//to the power of the number of digits equals the number itself.
// eg: - 153 = 1^3 + 5^3 + 3^3 = 153

 public static boolean isArmstrong (int num){
 int original = num;// to save the original number so we can compare it later.
 int sum=0;
 int digits = String.valueOf(num).length();

 while (num >0){
    int digit = num%10; //gives the last digit
    sum+= Math.pow(digit, digits); //- Math.pow() raises the 
    //digit to the power of digits.
    num/=10; //removes the last digit
 }
 return sum == original;//returns the value of sum to orginal int
 }
 public static void main(String[] args){
int num = 1534;
if (isArmstrong(num)){
    System.out.println(num + " is an Armstrong number");

}else{
    System.out.println(num + " is not an Armstrong number");

}
 

}
}
 