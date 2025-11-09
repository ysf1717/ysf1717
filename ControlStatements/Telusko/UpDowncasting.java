package ControlStatements.Telusko;

class A{

    public void show1(){

       System.out.println("In Show A");
    }

}

class B extends A{

public void show2(){

    System.out.println("In Show B");
}

}

public class UpDowncasting {

    public static void main(String[] args) {

  A up = new B(); // upcasting
  up.show1();

   B downcasting = (B) up;// downcasting
   downcasting.show2();


}

}















