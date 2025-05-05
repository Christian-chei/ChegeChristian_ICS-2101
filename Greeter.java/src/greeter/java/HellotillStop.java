import java.util.*;

class HellotillStop {
   Scanner sc = new Scanner(System.in);
   
   // outputs Hello while user wants to
   void showHello(){
      String choice; // guard variable
      
      System.out.println("For Hello type h, naything else to stop");
      choice = sc.next();//set guard variable
      while("h".equals(choice)){
      System.out.println("Hello");
      choice = sc.next();// update guard variable
      }
    
   }
   
}
