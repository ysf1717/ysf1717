public class ElectricCar extends Car {
    int batteryCapacity;

    public void displayBatteryCapacity(){
     if (batteryCapacity > 30){
        System.out.println(" The Battery Capaticity is " + batteryCapacity + ".  HAPPY RIDING!!!");
    } else {
     System.out.println(" The Battery Capaticity is low - RECHARGE!!!!");
    }
    
}
    public void displayAllInfo(){
    displayBrand();
    displayModel();
    displayBatteryCapacity();

}

}
