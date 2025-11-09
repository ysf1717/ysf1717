package ControlStatements.Telusko;


abstract class car{

    public abstract void start();
    public abstract void fly();
    public abstract void stop();

     public void playMusic(){

        System.out.println("Start Playing Music");

    }

    
}

 class benz extends car{
  
    public void start(){

        System.out.println("ENGINE STARTED");
    }

    public void fly(){

        System.out.println("STARTED FLYING!!!");

 }

 public void stop(){

        System.err.println("Car has stopped");

    }
}
   
public class Abstract {

    public static void main(String[] args) {
         car cr = new benz();
        cr.playMusic();
        cr.start();
        cr.fly();
        cr.stop();
    }

}
