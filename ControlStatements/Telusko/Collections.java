package ControlStatements.Telusko;

import java.util.ArrayList;
import java.util.Collection;

public class Collections {

    public static void main(String[] args) {
        
        Collection<Integer> nums = new ArrayList<Integer>() ;
        nums.add(7);// nums. will show you the objects to select. We have
        // selected add
        nums.add(8);
        nums.add(9);
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);

        //enchanced FOR LOOP
        for(int n: nums)
        {
            System.out.println(n);
        }

        // for(Object n:nums)
        // {
        //     int num=(Integer) n;
        //     System.out.println(num*2);
        
               //We can use Object and then 
        //     //declare a wrapper class with a new variable but it is
        //     //recommended to use wrappers with collections
        // }

        //System.out.println(nums); //We can directly print a collection
    }
    
}
