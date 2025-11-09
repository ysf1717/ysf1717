public class HelloJava {
    public static void greet(){
        System.out.println("Hello Java");
        System.out.println("I will expertise Java");
        
    }


// Method 2: Sum Calculation
    public static void calculateSum() {
        int a = 5;
        int b = 10;
        int sum = a + b;
        System.out.println("Sum = " + sum);
    }


    public static void world() {
        System.out.println("Hello world");
    }

    // ✅ Only ONE main method allowed
    public static void main(String[] args) {
        // Choose which method to run by commenting/uncommenting

        greet(); 
        calculateSum();
        world();
                 // Run greeting
        // calculateSum(); // Run sum calculator
    }
}   




    

    





