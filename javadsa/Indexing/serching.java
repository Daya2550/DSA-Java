package javadsa.Indexing;

import java.util.Scanner;

import javadsa.Searching.LinearSearch;
import javadsa.MainHelper.MainHelper;
import javadsa.MainHelper.MyExceptionHandling;
import javadsa.Searching.BinarySearch;

public class serching {
    public void search() {
        // Implementation for indexing search can be added here
         Scanner sc = new Scanner(System.in);
        int choice =1;
        System.out.println("Welcome to Data Structures and Algorithms in Java");
        System.out.println("-----------------------------------------------");
      do{
        System.out.println("Choose an option:");
        System.out.println("1. binary Search");
        System.out.println("2. Linear Search");
        System.out.print("3. Exit :");
        choice = sc.nextInt();  
       
        switch (choice) {
            case 1:
                  try {
                    BinarySearch obj = new BinarySearch();
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
                    LinearSearch obj1 = new LinearSearch();
                    obj1.run();
                  } 
                    catch(MyExceptionHandling me){
                    System.out.println("Somthing Is Wrong : " + me.getMessage() + "\n Returning to Main Menu...");
                    new MainHelper().ToStart();
                  }
                  catch (Exception e) {  System.out.println("An error occurred: " + e.getMessage()); }
                break;
                
            case 3:
                System.out.println("Exiting the program.");
                break;
                    
            default:
                System.out.println("Invalid choice, please try again.");
      }
     }
        while(choice!=3);    
    }
}
