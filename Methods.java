import java.util.Scanner;

public class Methods {
//sum using methods
public void sum (int a, int b){

    int result = a + b;

    System.out.println("The sum of " + a + (" and ") + b + (" = ") + result);
}

public void MaxMethod(int a, int b){
//Write a method to find the maximum of two numbers.

if (a>b)
{
    System.out.println(a + " is greater ");
}else if(b>a)
{
    System.out.println(b + " is greater ");
}else
{
  System.out.println(a + " and " + b + "+ are equal");  
}

}

//Palindrome Checker: Write a method to check 
//if a number is a palindrome.

public void Palindrome(int num){
int original = num;
int reverse = 0;

while (num !=0) {
    int digit = num %10; // gets the last digit of the num
     reverse = reverse*10 + digit; // add the digit to the last num
    num/= 10; // removes the last digit from the original number
}
    if (original==reverse){
        System.out.println(original + " is a palindrome number ");
    }else 
    {
      System.out.println(original + " is not a palindrome number ");  
    }
                        
}

//Write a method to calculate the factorial of a number.
public void factorial(int n){

int fact = 1;

for (int i = 1; i <=n; i++){
fact = fact*i;
}
System.out.println("The factorial of " +  n + " is : " + fact);


}

//Write a method to calculate the area of a circle.
public void circleArea( double radius){

    double area = Math.PI*radius*radius;

 System.out.println("Radius : " + radius + " cm");
 System.out.println("Area of the Circle : " + area + " cm");
}

// a method to calculate the area of a circle.
public void evenOrOdd(int a)
{ 
    if (a%2==0){
System.out.println(a + " is a Even number");
    }else 
    {
        System.out.println(a + " is a odd number");
    }
}

//a method to check if a number is prime

// need to work on explanation so skipping to next one

//Write a method to swap two numbers.

public void swapTwoNum(int a, int b){

    int temp= a;
     a = b;
     b = temp;

    System.out.println(a + " = a ");
    System.out.println(b + " = b ");

}

// a method to reverse a string

public void reverseAString(String input){

String reversed = ""; //Empty string to store the result.
for (int i = input.length()-1; i >= 0; i--){
    reversed += input.charAt(i);
}
//input.length() - 1 starts at the last character.
//i-- moves backward one character at a time.
//input.charAt(i) gets the character at position i.
//reversed += ... adds that character to the result.

System.out.println("Original = " + input);
System.out.println("Reversed = " + reversed);
}


// 4 variations of Methods. Need to work 




    public static void main(String[] args) {
       Methods obj = new Methods();
       obj.sum(10, 50);
       obj.MaxMethod(40,25);
       obj.Palindrome(121);
       obj.factorial(10);
       obj.circleArea(10);
       obj.evenOrOdd(11);
       obj.swapTwoNum(10,20);
       obj.reverseAString("Mohammed");
       // prime number not completed.. Need to work
       //on understanding. 

    }
    
}
