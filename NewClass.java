public class NewClass {
    public static void main(String a[]) {
        int y1 = 120;
        byte by = 127;
        short sh = 120;
        long ln = 1548l;
        float f = 15.2f;
        double d = 5.8;
        char c = 'y';
        boolean b = true;

        int num1 = 0b101;
        System.out.println(num1);

        calculate(); // ✅ Call the method here
        printbyte();
        sum();
    }

    public static void calculate() {
        int num0 = 5;
        int num2 = 10;
        int result = num0 + num2;
        System.out.println("my result is " + result);

    }

        public static void printbyte() {

            byte b = 127;

            System.out.println(b);
        
    }


        public static void sum() {

     //byte b = 125;
     int a = 257;
     byte k = (byte) a;

     float f = 5.6f;
     int t = (int) f;
     
     System.out.println(f);

     

     // ans is 1. The byte value is 256 and modulus
     //when divided with a 257, the ans is 1
     
    }
           


}

