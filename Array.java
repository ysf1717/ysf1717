public class Array {
// Array start from 0 (index)
    public static void main(String[] args) {
        
        int num[] = {5,6,7,8};
        num[3] = 1578;
        //int nums[] = new int[4]; //we can create upto 4
       
        System.out.println(num[3]);
        ArrayLoop();
    }
    
    

    public static void ArrayLoop()
    {
        int num[] = {5,6,7,8};
        //nums.length will calculate the numbers in the
        //array instead of manually counting

        for(int i= 0; i<4;i++)
        {
            System.out.println(num[i]);
        }
    }
}