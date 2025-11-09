package ControlStatements.Telusko;

public class MyString {

    public static void main(String[] args) 
    {
        
        // // String name = new String("Yusuf");
  
        // String name = "Yusuf";

        // // System.out.println(name);
        // // System.out.println(name.concat(" Mohammed"));
        // // System.out.println(name.concat(" Mohammed Vali Ahamed"));

        // name = name +" Mohammed";
        // System.out.println(name);

        // String s1 = "Tiger";
        // String s2 = "tiger";

        // System.out.println(s1==s2);

        StringBuffer sb = new StringBuffer("Yusuf");

        // System.out.println(sb.capacity());
        //   System.out.println(sb.length());
        // sb.append(" Mohammed");
        sb.insert(0, "Mr. ");
        System.out.println(sb);

    }

}
