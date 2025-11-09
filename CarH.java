public class CarH extends Vehicles implements Engine {
// Car class: Takes from Vehicle and implements Engine

public void start()
{
    System.out.println("Car Engine has started! ");
}

    public static void main(String[] args) {
        CarH car = new CarH();
       car.start();
       car.run();
       

    }
}
