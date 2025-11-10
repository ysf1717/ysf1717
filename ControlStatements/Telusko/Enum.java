package ControlStatements.Telusko;

enum Status{
    Running, Pending, Failed, Success;
}


public class Enum {

    public static void main(String[] args) {
        
        // Status[] ss = Status.values();// will return the value in arrays
    
        // for(Status s : ss){

        //     System.out.println(s + ": " + s.ordinal());

        Status s = Status.Failed;

        if (s ==Status.Success){
            System.out.println("It's Ready!!!");
        }else if (s ==Status.Pending){
            System.out.println("ALL GOOD!!!");
        }else if (s ==Status.Running){
            System.out.println("On the Way!!!");
        }else {
            System.out.println("Please Wait!!! ");
        }
        }
        }
        
    
