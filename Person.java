public class Person {
    String name;
    int age;

    public void displayInfo(){
        System.out.println("Employee Name : " + name);
        System.out.println("Employee Age : " + age);
       
    }
    
    public static void main(String[] args) {
        Employee print = new Employee();
         print.name = "Mohammed";
         print.age = 37;
        print.employeeID = 1717;
        print.displayEmployeeInfo();

    }
}
