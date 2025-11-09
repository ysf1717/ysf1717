package ControlStatements;

public class Modulus {
   
    int a;
    int b;

    public int getmodulus(){
        return a%b;

    }

    public static void main(String[] args) {
        
    Modulus md = new Modulus();
    md.a = 98;
    md.b = 1589;
    md.getmodulus();

    System.out.println("Modulus of a%b is " + md.getmodulus() );
    }
}
