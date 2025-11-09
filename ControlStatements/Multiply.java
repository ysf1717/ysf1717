package ControlStatements;

public class Multiply {

    int a = 2568;
    int b = 89;

    public int getmultiplication(){

        return a*b;
    }
        public static void main(String[] args) {

            Multiply ml = new Multiply();
            ml.getmultiplication();

            System.out.println("Multiplication of a*b is " + ml.getmultiplication());
    }
    
}
