package ControlStatements;

public class Equalto {

    int a;
    int b;

    public boolean getanswer(){
        return a == b;
    }

    public boolean getanswer1(){
        return a !=b;
    }

    public boolean getanswer2(){
        return a > b;

    }
    
       public String getanswer3(){
        String result  = (a < b)?(a + " is less than " + b):( b + " is less than" + a);
        return result;
       }

       public String getanswer4(){
        String result  = (a >= b)?(a + " is greater than " + b):( a + " is not greater than " + b);
        return result;
       }

    public static void main(String[] args) {
        Equalto eq = new Equalto();
        eq.a = 10;
        eq.b = 40;
        eq.getanswer();

        Equalto eq1 = new Equalto();
        eq1.a = 10;
        eq1.b =10;
        eq1.getanswer1();

        Equalto eq2 = new Equalto();
        eq2.a = 10;
        eq2.b =20;
        eq2.getanswer2();

        Equalto eq3 = new Equalto();
        eq3.a = 10;
        eq3.b =20;
        eq3.getanswer3();

        Equalto eq4 = new Equalto();
        eq4.a = 10;
        eq4.b =20;
        eq3.getanswer4();

        System.out.println("A = B is " + eq.getanswer());
        System.out.println("A != B is " + eq1.getanswer1()); 
        System.out.println("A is greater than B : " + eq2.getanswer2()); 
        System.out.println(eq3.getanswer3());   
        System.out.println(eq4.getanswer4());                            
    }
}
