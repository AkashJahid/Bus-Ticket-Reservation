
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
public class PassangerListClass {
    
     String passangerList="";
     
     
    
     //read list from file
      public void readList(){
       try {
      File studentFile = new File("passengerlist.txt");
      Scanner readStatuent= new Scanner(studentFile);
      passangerList="";
      while (readStatuent.hasNext()) {
         passangerList  += readStatuent.nextLine()+"\n";
        
      }
     System.out.println("Successfully read the list");
     // readStatuent.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");}
      
    }
      
      public String getList(){
          return passangerList;
      }
}
