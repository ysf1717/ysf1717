package ControlStatements.Telusko;

class employee{

    String empName;
    String empDepartment;
    int empID;

    employee(String empName, String empDepartment,  int empID ){
        this.empName = empName;
        this. empDepartment = empDepartment;
        this. empID = empID;
        }

    employee() {
        this("Varun", "Software", 1717);   
    }

    void displayinfo(){

        System.out.println("Employee name : " + empName);
        System.out.println("Employee Department : " + empDepartment);
        System.out.println("Employee ID : " + empID);
        System.out.println("..............................");
    }


}

public class Constructor1 {

    public static void main(String[] args) {
        
        employee emp = new employee();
        employee emp1= new employee("Mohammed", "Software", 1717);
        emp.displayinfo();
        emp1.displayinfo();
    
    }

}
