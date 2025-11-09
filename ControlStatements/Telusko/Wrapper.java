package ControlStatements.Telusko;


public class Wrapper {

public static void main(String[] args) {
    
    int num = 7;
    Integer num1= num; // autoboxing - Integer used

    int num2 = num1; // auto-unboxing

 System.out.println(num2);

 String str = "21";
 int num3= Integer.parseInt(str);// converting string into integer. ParseInt

 System.out.println(num3*5);
}

}
