package ControlStatements.Telusko;

interface A {

    int age = 28;
    String name = "Harsh";

void show();
void config ();

}
class B implements A{

    public void show() {
        
      System.out.println(" In a Show ");
    }

    public void config() {  
        
        System.out.println("In a Config");
    }

}

public class Interfaces {

    public static void main(String[] args) {

        A inter;
        inter = new B();
        inter.show();
        inter.config();

        System.out.println(A.age);
        
    }

}

