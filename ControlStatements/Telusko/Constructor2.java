package ControlStatements.Telusko;


class animal{
    String type;

    animal (String type){
    this.type = type;

}

void displayType(){
    System.out.println("Animal Type : " + type);
}
}

class dog extends animal{
    String breed;
    
    dog(String type,String breed){
    super(type);
    this.breed = breed;
    }
   void displayType(){
    System.out.println("Animal breed : " + breed);
}
    }

public class Constructor2 {


    public static void main(String[] args) {
        
        dog dg= new dog("Dog", "German Shepherd");
        dog dg1= new dog("Dog", "Boxer");
        dg.displayType();
        dg1.displayType();
    }

} 






