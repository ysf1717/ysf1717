public class Logical {

    public static void main(String[] args) {
        
        int x = 9;
        int y = 4;
        int a = 2;
        int b = 6;

        boolean result = x > y;
        System.out.println("Result is  " + result);

        result = x > y && a >b;
        System.out.println("Result of short circuit && is " + result);

        result = x > y || a > b;
        System.out.println("Result of short circuit || is " + result);

        result = x > y;
        System.out.println("Result is  " + !result);
        // ! is the opposite answer of the result. 
    

        
    }
    
}
