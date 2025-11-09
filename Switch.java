public class Switch {

    public static void main(String[] args) {

        int n = 5;

        // use of switch statement
        switch (n) {
            case 1:
             System.out.println("Monday");
             break; //break code is used to stop at the result.

             case 2:
             System.out.println("Tuesday");
             break;

             case 3:
             System.out.println("Wednesday");
             break;

             case 4:
             System.out.println("Thursday");
             break;

             case 5:
             System.out.println("Friday");
             break;

             case 6:
             System.out.println("Saturday");
             break;

             case 7:
             System.out.println("Sunday");
             break;

             default: // default is used to trigger a warning message if valid input not entered like "else"
              System.out.println("Enter a valid number");

        }

            NewSwitch(); // New updated version of Switch
    }

        public static void NewSwitch() {

        String day = "Tuesday";

        switch (day) {

            case "Saturday", "Sunday"->System.out.println("6am");

            case "Monday" -> System.out.println("7am");

            default ->System.out.println("5am");
        

        
        }

        NewSwitches();
    }

  public static void NewSwitches() {

        String day = "Sunday";
        String result = "";

        result = switch(day) 
        {

            case "Saturday", "Sunday"-> "6am";

            case "Monday" -> "7am";

            default ->"5am";  
        
};
        System.out.println(result);
       NewSwitches1();
    
}
      

  public static void NewSwitches1() {

        String day = "Tuesday";
        String result = "";

        result = switch(day) 
        {

            case "Saturday", "Sunday": yield "6am";
            //we use yied when we use : instead of -> in switch

            case "Monday" :yield"7am";

            default :yield"5am";  
        };

        System.out.println(result);

    }

}




            