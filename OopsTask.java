

    public class OopsTask {
    // Creating class level variables (fields)
    String make;
    String model;
    String type;
    int year;

    public static void main(String[] args) {
        // Create car objects
        OopsTask car1 = new OopsTask();
        car1.make = "Mercedes";
        car1.model = "Benz";
        car1.type = "Petrol";
        car1.year = 2020;

        OopsTask car2 = new OopsTask();
        car2.make = "BMW";
        car2.model = "Sports";
        car2.type = "Diesel";
        car2.year = 2022;

        OopsTask car3 = new OopsTask();
        car3.make = "Jaguar";
        car3.model = "F-Pace";
        car3.type = "Petrol";
        car3.year = 2024;

        // Print details
        System.out.println("Car 1: " + car1.make + " " + car1.model + " " + car1.year);
        System.out.println("Car 2: " + car2.make + " " + car2.model + " " + car2.year);
        System.out.println("Car 3: " + car3.make + " " + car3.model + " " + car3.year);
    }

    // Inheritance: (Single, Multilevel, Hierarchical & Hybrid)

    //1. Single inheritance
    }

