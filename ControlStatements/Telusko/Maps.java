package ControlStatements.Telusko;

import java.io.FileInputStream;
import java.io.IOException;
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

       
// <project xmlns="http://maven.apache.org/POM/4.0.0"

//          xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"

//          xsi:schemaLocation="http://maven.apache.org/POM/4.0.0

//                              https://maven.apache.org/xsd/maven-4.0.0.xsd">

//     <modelVersion>4.0.0</modelVersion>

 

//     <groupId>com.example</groupId>

//     <artifactId>Java11AM</artifactId>

//     <version>1.0-SNAPSHOT</version>

//     <packaging>jar</packaging>

 

//     <properties>

//         <maven.compiler.source>21</maven.compiler.source>

//         <maven.compiler.target>21</maven.compiler.target>

//     </properties>

 

 

// </project>

// ___________________________________________________
        

// package basics; import org.apache.poi.ss.usermodel.Cell; import org.apache.poi.ss.usermodel.Row; import org.apache.poi.ss.usermodel.Sheet; import org.apache.poi.ss.usermodel.Workbook; import org.apache.poi.xssf.usermodel.XSSFWorkbook; import java.io.FileInputStream; import java.io.IOException; public class ExcelData { String file = "C:\\Users\\acer\\Downloads\\Test.xlsx"; public void readData () { try { FileInputStream fis = new FileInputStream(file); Workbook workbook = new XSSFWorkbook(fis); Sheet sheet1 = workbook.getSheetAt(0); for(Row row : sheet1){ for(Cell cell : row){ System.out.print(cell + "||"); } System.out.println(); } }catch (IOException e){ System.out.println("File Not Found"); } } public static void main(String[] args) { ExcelData ed = new ExcelData(); ed.readData(); } }
    }
    
}
