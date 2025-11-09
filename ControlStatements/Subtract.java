package ControlStatements;

public class Subtract {

    int a;
    int b;

    public int getresult(){
        return a-b;
    }
    
    public static void main(String[] args) {
    Subtract sb = new Subtract();
    sb.a = 97;
    sb.b = 58;
    sb.getresult();

    System.out.println("Subtraction :  " + sb.getresult());
    }
}
