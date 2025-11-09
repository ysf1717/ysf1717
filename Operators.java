public class Operators {
public static void main(String a[]) {
        
    int num1 = 7;

    int num2 = 5;

    int result = num1 + num2;
    System.out.println("Addition: " + result);

    result = num1 - num2;
    System.out.println("Subtraction: " + result);

    result = num1 * num2;
    System.out.println("Multiplication: " + result);

    result = num1 / num2;
    System.out.println("Division: " + result);

    result = num1++;
    System.out.println("increment: " + result);

    result = num1--;
    System.out.println("decrement: " + result);
    System.out.println("Post-increment: " + num1);
    System.out.println("Pre-decrement: " + (--num1));
    
}

}
