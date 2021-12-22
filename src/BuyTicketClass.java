
import java.io.FileWriter;
import java.io.IOException;


public class BuyTicketClass {
     private String method;
     private String direction;
     private String amount;
  
    

 public void setValue(String method,String accountnumber,String amount){
        this.method=method;
        this.direction=accountnumber;
        this.amount=amount;
       
   }
   
   

 public void dataWriteinFile(){
        try {
      FileWriter myWriter = new FileWriter("buyticket.txt",true);
       myWriter.write("\r\nDirection:"+direction);
      myWriter.write("\nMethod:"+method);
     
      myWriter.write("\r\nAmount:"+amount);
      myWriter.close();
      System.out.println("Successfully paid amount");
    } catch (IOException e) {
      System.out.println("A Error found");
    }
   }
    
}
