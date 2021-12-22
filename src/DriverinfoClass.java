
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class DriverinfoClass {
     String driverinfotext="";
     
     
 
     //read list from file
      public void readList(){
       try {
      File courseFile = new File("driverinfo.txt");
      Scanner readCourse= new Scanner(courseFile);
      driverinfotext="";
      while (readCourse.hasNext()) {
         driverinfotext  += readCourse.nextLine()+"\n";
        
      }
     System.out.println("Successfully read the list");
     // readCourse.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");}
      
    }
      
      public String getList(){
          return driverinfotext;
      }
}
