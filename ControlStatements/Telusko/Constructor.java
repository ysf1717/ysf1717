package ControlStatements.Telusko;

class rectangle{


private int length;
private int breath;

rectangle(int length, int breath ){
this.length=length;
this.breath= breath;
}


rectangle(){
    this(10,20);
}

void display(){

    System.out.println("Length is "+ length + " : " + " breath is " + breath );
}
}

public class Constructor {

    public static void main(String[] args) {
        rectangle rc1 = new rectangle();
        rectangle rc2 = new rectangle(30,40);
        rc1.display();
        rc2.display();
        
    }
    
}
