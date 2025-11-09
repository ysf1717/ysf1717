package ControlStatements;

public class Division {

    int a;
    int b;

    public int getdivision(){

        return a/b;
    }
         public static void main(String[] args){

Division dv = new Division();
dv.a = 45;
dv.b = 5;
dv.getdivision();

System.out.println("Division : " + dv.getdivision());

         }
    }
    
