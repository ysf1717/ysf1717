package ControlStatements.Telusko;



    class Human {

       private String name = "Java Sundaresan";
        private int age = 35;

        public Human()
        {
            System.out.println("I am printing this in Constructor");
        }

        public String getName()
        {
        return name;
        }

        public void setName(String n)
        {
            name=n;
        }

        public void setAge(int a)
        {
            age = a;
        }

        public int getAge()
        {
            return age;
        }

    }

public class Encapsulation {

    public static void main(String[] args) {
       Human hum = new Human();
       hum.setAge(35);
      hum.setName("Java Sundrasen");

       System.out.println("Name : " + hum.getName());
       System.out.println("Age: " + hum.getAge());
       System.out.println("____________________");

    }
}
                                        