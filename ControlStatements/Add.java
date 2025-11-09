package ControlStatements;


public class Add{

    int a;
    int b;
    int c;

    public int getresult(){
        return a+b+c;
    }
       public static void main(String[] args) {

        Add ad = new Add();
        ad.a=20;
        ad.b=30;
        ad.c=98;
        ad.getresult();

        System.out.println("Addition of a + b + c = " + ad.getresult());
    
     

    }

}