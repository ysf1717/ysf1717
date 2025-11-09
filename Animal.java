public class Animal {


public void makeSound(){
System.out.println("Some animal sound");
}

public static void main(String[] args) {
     
    Dog d = new Dog();
    Cat c = new Cat();

    d.makeSound();
    c.makeSound();
}
    
}
