import java.time.Year;
import java.util.Currency;

public class Tasks1 {

   // Declare Variables: Declare different types of 
   //variables (int, double, char, boolean) and print
//their values.
    

public void Taskone() {

    int a = 17;
    double d = 17.7;
    char c = 'c';
    boolean booly = true;

        System.out.println("int: " + a);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + booly);

        Tasks2();
}

public void Tasks2() {

//2. Swap Two Numbers: Write a program to swap two 
//numbers using a temporary variable
        int a = 5;
        int b = 10;
        System.out.println("Before Swapping : ");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //using temp variable we are swapping
        // a and b

        int temp = a;
        a =  b;
        b = temp;

        System.out.println("After Swapping : ");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

      Tasks3();

}


public void Tasks3() {

//Task.: Circle Area: Calculate the area of a 
 //circle given its radius.
 // Area is calculated using the formula: π × r².
//π  = 3.14
//r=7.0
 
 double radius = 7.0;
 double area = 3.14159*radius*radius;
   
 System.out.println("Radius : " + radius);
 System.out.println("Area of the Circle : " + area);


   Task4();

}

public void Task4() {
//Simple Interest: Calculate simple interest 
//based on principal, rate, and time.
//simple interest formula

double principal = 100000.00;
double rate = 9.5;
double time = 5;

//formula = principal*rate*time/100
double interest = (principal*rate*time)/100;

System.out.println("Principle is : " + principal + " Rs");
System.out.println("Rate is : " + rate + " %");
System.out.println("Time is : " + time + " Months");
System.out.println("Interest is : " + interest);

   Task5();

}

public void Task5() {

    //Temperature Conversion: Convert temperature 
    //from Celsius to Fahrenheit.
    //Formula to convert Celsius to Fahrenheit
    // - Multiply the Celsius temperature by 9/5 (or 1.8)
//Then add 32 to the result

double celcius = 75.0;
double fahrnheit = (celcius*9/5) + 32;

System.out.println("Celcius is " + celcius + " °C");
System.out.println("Fahrnheit is " + fahrnheit + " °F");


Task6();

}

public void Task6() {
//Sum of Two Numbers: Write a program to calculate the 
//sum of two integers

int a = 6;
int b = 15;
int result = a + b;
 
System.out.println("Result of a + b is " + result);

Task7();

}

public void Task7() {
 //Product of Two Numbers: Calculate the product of 
//two floating-point numbers.
float num1 = 65.7f;
float num2 =  78.2f;

//product of two floating numbers
float product = num1*num2;

System.out.println("Product of two floating point is : " + product);

Task8();

}

public void Task8() {
//Rectangle Area: Calculate the area of a 
//rectangle given its length and width
//formula to calculate rectangle area = length*width

float length = 58.7f;  // We can also double. to save memory, used float
float width = 24;

//lenghth*width
float measurement = length*width;

System.out.println("Measurement of the rectangle is : " + measurement + " cm" );

Task9();

}

public void Task9() {
//Square Perimeter: Calculate the perimeter of a square 
//given its side length

float length = 6;

float squareCalculation = length*4;

System.out.println("Perimeter of the square is " + squareCalculation + " cm");


Task10();

}

public void Task10() {
//BMI Calculator: Calculate the Body Mass Index (BMI) 
//given weight and height.
//formula -divide the weight by the square of the height(meters)
double weight = 75.7;
double height = 1.646;

double bmi = weight/(height*height);
System.out.println("BMI :  " + bmi);

if (bmi<=24.9){

    System.out.println("Good");
} else {

     System.out.println("BAD");
}

  TaskArithmetic();   
}
// TASK WITH OPERATORS.
public void TaskArithmetic(){

    int a = 40;
    int b = 20;

    System.out.println("Addition of a + b : " + (a+b));
    System.out.println("Subraction of a-b : " + (a-b));
    System.out.println("Multiplication of a * b: " + (a*b));
    System.out.println("Division of a/b : " + (a/b));

    TaskTwelve();
}

public void TaskTwelve(){
//Modulus Operation: Find the remainder when 
//one number is divided by another.

 int dividend = 17; //This is the number we want to divide.
 int divisor = 5; //This is the number we divide by.
 int remainder = dividend % divisor; //% gives the remainder.

 System.out.println("Remainder when " + dividend + " is divided by " + divisor + " = " + remainder);

 TaskThirteen();
}

public void TaskThirteen(){

//Increment/Decrement: Demonstrate the use of 
//increment and decrement operators.

//++ increases the value by 1.
//-- decreases the value by 1. 
//prefix : ++Y or --Y changes the values BEFORE its used.
//postfix : Y++ or Y-- changes the value afer its used.

int Y = 5;

System.out.println("Original value of Y is " + Y);

//Increment
Y++; //same as Y=Y+1
System.out.println("After Y++ post increament : " + Y);

//Increment
++Y; //same as Y=Y+1
System.out.println("After ++Y pre increament : " + Y);

//Decrement
Y--; //same as Y=Y-1
System.out.println("After Y-- post decrement : " + Y);

//Decrement
--Y; //same as Y=Y-1
System.out.println("After --Y pre decrement : " + Y);

TaskFourteen();

}

public void TaskFourteen(){
//Circle Circumference: Calculate the circumference of a 
//circle given its radius.

double radius = 8.0;

//radius formula = 2*Math.PI or 3.14159*radius
double circumference = 2*Math.PI*radius;

System.out.println("Circumference of a circle given its radius of 7 is " + circumference);

//TaskFifteen doubt
//Tasksixteen
AverageOFThreeNumbers();

}

public void AverageOFThreeNumbers(){
//Average of Three Numbers: Calculate the 
//average of three integers.

int num1 = 20;
int num2 = 30;
int num3 = 40;

float average = (num1 + num2 + num3/3.0f);

System.out.println("The Average of 3 integers is " + average);

//TaskSeventeen
ConvertMetersToKilometers();

}

public void ConvertMetersToKilometers(){
//1 kilometer = 1000 meters
// to convert meter to kilo meter, we must
//divide the meter by 1000 

double meter = 3000.0;
double kilometer = meter/1000.0;

System.out.println(meter + "meter is " + kilometer + " km");

//TaskEighteen
CurrencyConverter();

}

public void CurrencyConverter(){
//Currency Converter: Convert an amount from one 
//currency to another (e.g., USD to INR)
//1 USD = 80 INR

//converting INR to USD = INR/USD
// converting USD to INR = USD*INR

double inr = 5000.0;
double usd = 80.0;

double conversion = usd*inr;

System.out.println(usd +" USD" + " is :" + conversion + " INR");

//task19
TipCalculator();

}

public void TipCalculator(){

    double billAmount = 5400;
    double tipPercentage = 10;

    double tipAmount = (billAmount*tipPercentage)/100;
    double totalBill = (billAmount + tipAmount);

    System.out.println("The total bill amount is " + totalBill);
    System.out.println("Tips : " + tipAmount);

    //Task20
TotalCostCalculation();

}

public void TotalCostCalculation(){
//total cost calculation including sales tax. 
//sales tax = 8%. total cost = (Bill cost*sales tax)/100
    double billAmount = 4999;
    double salesTaxPercentage = 8;

    double salesTax = (billAmount*salesTaxPercentage)/100;
    double totalBill = (billAmount + salesTax);

    System.out.println("The total bill amount is " + totalBill + " INR");
    System.out.println("Sales Tax : " + salesTax + " INR");
 
    OddOrEven();
}
//CHAPTER 3: Tasks with Control Statements 

public void OddOrEven() {
//Even or Odd: Write a program to check if 
//a number is even or odd.
//a%2==0 checks the remainder when dividing by 2
//If the remainder is 0, it's even; otherwise, it's odd

int a = 12;

if (a%2==0){
    System.out.println( a + " is EVEN");
} else {
    System.out.println( a + " is ODD");
}

PositiveOrNegative();

}

public void PositiveOrNegative(){

//Determine if a number is positive, negative, or zero.
int a  = -15;
 
if (a>0){
    System.out.println(a + " is positive");
}
else if(a<0){
   System.out.println(a + " is negative");
}else
{
    System.out.println(a + " is zero");
}

LargestOfThreeNumbers();

}

public void LargestOfThreeNumbers(){

    int a = 10;
    int b = 15;
    int c = 12;
    
    int largest;

    if (a>=b && a >=c){
        largest=a;
    }else if (b>=a && b>=c){
        largest = b;
    }else
    {
        largest=c;
    }
 System.out.println("The largest number is: " + largest);

LeapYearChecker();

}

public void LeapYearChecker(){
//A year is a leap year if:
//It is divisible by 4 and not divisible by 100,
//OR It is divisible by 400.

int year = 2024;

if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
    System.out.println(year + " is a leap year.");
} else {
    System.out.println(year + " is not a leap year.");
}

GradeCalculator();

}

public void GradeCalculator(){
//Calculate the grade of a student based on marks
    int marks = 70;
    char grade;

    if (marks >=90){
        grade = 'A';
    }else if (marks >=75){
        grade = 'B';
    }else if (marks >=60){
        grade = 'C';
    }else if (marks >=50){
        grade = 'D';
    }else if (marks >=40){
        grade = 'E';
    }else
    {
        grade = 'F';
    }

    System.out.println( marks + " marks is grade : " + grade);

SumOfNaturalNumbers();
}

public void SumOfNaturalNumbers(){
//Calculate the sum of the first n natural numbers.
//formula = n*(n+1)/2

 int n = 10;
 int sum = 0;

 for (int i = 1; i<= n; i++){
 sum += i;

 System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
 }
  int no = 10;
        int sum1 = no * (no + 1) / 2;
 System.out.println("The sum of the first " + n + " natural numbers is: " + sum);

 Factorial();

}

public void Factorial(){
//Calculate the factorial of a given number.

int n = 10;
int fact = 1;

for (int i = 1; i <=n; i++){
fact = fact*i;
}
System.out.println("The factorial of " +  n + " is : " + fact);

MultiplicationTable();

}
public void MultiplicationTable(){
 //the multiplication table of a given number.

 int n = 12;
 int table = 1;

 for (int i = 1; i <=n; i++){
table = i*n;

System.out.println("The multiplication of " +  n + ("*") + i + " is : " + table);

 }
FibonacciSeries();
}

  public void FibonacciSeries(){
  //It’s a series of numbers where:
//The first two numbers are always:0 and 1
//Every number after that is the sum of the two before it

        int a = 0;
        int b = 1;
        int limit = 10;

        System.out.println("Fibonacci series:");
        for (int i = 1; i <= limit; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
       System.out.println();  
        GreetingMethod();   
}
    //Prime Number Checker: Check if a number is prime.
    //A prime number is a natural number greater than 1 that has exactly two distinct positive divisors:
//1 and itself.
    
    
    //Task with Methods; Chapter 3
    public void GreetingMethod()
    {   
System.out.println("Greeting Method: ");
System.out.println("Hello! Welcome to Java programming.");
  

    }

public static void main(String[] args) {
    Tasks1 obj = new Tasks1();
    obj.Taskone(); 
   // Commit tests
    
 }

}

