package ControlStatements.Telusko;

public class Static {

    String brand;
    static String name;
    int price;

   //Static is a keyword that means something belongs to the class itself, 
  // not to any specific object created from that class. 
   //It’s like saying: “This thing is shared by all objects of the class.”


    public void show(){

 System.out.println(brand + " : " + name + " : " + price);
}
}
 class mobile
 {
    public static void main(String[] args) {
        Static st = new Static();
        st.brand = ("Apple");
        Static.name = "iPhone 12";
        st. price = 45000;

        

        Static st1 = new Static();
        st1.brand = ("Samsung");
        Static.name = "S23";/// We use static to change the variable name
        st1. price = 55000;

        Static.name= "phone"; //It is implemented at Static.name 
        
        st.show(); //declaring method
        st1.show();//declaring method

        //- static members are shared, not unique to each object.
     //You access them using the class name, not the object.
//You cannot use this inside a static method because there's no 
//specific object



    }
 }

