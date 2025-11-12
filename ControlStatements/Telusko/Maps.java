package ControlStatements.Telusko;

import java.util.HashMap;
import java.util.Map;


public class Maps {

    public static void main(String[] args) {
        
        Map <String, Integer> students = new HashMap<>();

        students.put("Navin", 42);
        students.put("Harsh", 56);
        students.put("Prakash", 48);
        students.put("Lalit", 52);
        students.put("Arya", 30);
        students.put("Arya", 72);

        // System.out.println(students.keySet());
 
        for (String key : students.keySet())
        {
            System.out.println(key + " : " + students.get(key));
        }

        // for (int value : students.values())
        // {
        //     System.out.println(value + " : " + students.get(students));
        // } THIS DOESN'T WORK

   // System.out.println(students);

        
    }
    
}
