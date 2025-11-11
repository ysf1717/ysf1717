package ControlStatements.Telusko;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Sets {

    public static void main(String[] args) {
        
        // Set<Integer> nums = new HashSet<Integer>();
        Set<Integer> nums = new TreeSet<Integer>();//Treeset for sorted value
        nums.add(7);// nums. will show you the objects to select. We have
        // selected add
        nums.add(85);
        nums.add(95);
        nums.add(18);
        nums.add(24);
        nums.add(34);
        nums.add(45);
        nums.add(83);

        for (int n:nums)

        {
            System.out.println(n);
        }
    
} 

}
