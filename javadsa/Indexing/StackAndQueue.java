package javadsa.Indexing;

import java.util.Scanner;

import javadsa.MainHelper.MainHelper;
import javadsa.MainHelper.MyExceptionHandling;
import javadsa.StackAndQueue.CircularQueue;
import javadsa.StackAndQueue.stack;

public class StackAndQueue {
     public void choice() {
        // Implementation for indexing search can be added here
         Scanner sc = new Scanner(System.in);
        int choice =1;
        System.out.println("Welcome to Satack and Queue Implementation in Java");
        System.out.println("-----------------------------------------------");
      do{
        System.out.println("Choose an option:");
        System.out.println("1. Stack Implementation");
         System.out.println("2. Queue Implementation");
         System.out.println("3. CircularQueue Implementation");
        System.out.print("4. Exit :");
        choice = sc.nextInt();  
       
        switch (choice) {
            case 1:
                  try {
                    stack obj = new stack();
                     obj.run();
                  }
                    catch(MyExceptionHandling me){
                    System.out.println("Somthing Is Wrong : " + me.getMessage() + "\n Returning to Main Menu...");
                    new MainHelper().ToStart();
                  }
                  catch (Exception e) {  System.out.println("An error occurred: " + e.getMessage()); }

                break;

             case 2:
                  try {
                    javadsa.StackAndQueue.Queue obj = new javadsa.StackAndQueue.Queue();
                     obj.run();
                 
                  } 
                    catch(MyExceptionHandling me){
                    System.out.println("Somthing Is Wrong : " + me.getMessage() + "\n Returning to Main Menu...");
                    new MainHelper().ToStart();
                  }
                  catch (Exception e) {  System.out.println("An error occurred: " + e.getMessage()); }

                break; 
            case 3:
                  try {
                    CircularQueue obj = new CircularQueue();
                      obj.run();

                  } 
                    catch(MyExceptionHandling me){
                    System.out.println("Somthing Is Wrong : " + me.getMessage() + "\n Returning to Main Menu...");
                    new MainHelper().ToStart();
                  }
                  catch (Exception e) {
                    System.out.println("Some thing went Wrong !");
                  }
                break;         

            case 4:
                  System.out.println("Exiting the program.");
                break;
             
         
            default:
                System.out.println("Invalid choice, please try again.");
      }
     }
        while(choice!=4);    
    }
}
