public class Vehicle {
    String brand;

    public void displayBrand(){

        System.out.println("Brand of the car is " + brand);

    }
    
    public static void main(String[] args) {
        
        ElectricCar ec = new ElectricCar();
        ec.brand = "Maruti Suzuki";
        ec.model = "SWIFT";
        ec. batteryCapacity = 50;

        ec.displayAllInfo();
    }
}
