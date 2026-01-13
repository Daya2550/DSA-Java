package javadsa.Indexing;

import java.util.Scanner;

import javadsa.LinkedList.DoublyLinkedList;
import javadsa.LinkedList.Singlylinkedlists;
import javadsa.MainHelper.MainHelper;
import javadsa.MainHelper.MyExceptionHandling;

public class LinkedList {
     public void LL() {
        // Implementation for indexing search can be added here
         Scanner sc = new Scanner(System.in);
        int choice =1;
        System.out.println("Welcome to Linked List Implementation in Java");
        System.out.println("-----------------------------------------------");
      do{
        System.out.println("Choose an option:");
        System.out.println("1. Singly Linked List");
         System.out.println("2. Doubly Linked List");
         System.out.println("3. Circular Linked List");
        System.out.print("4. Exit :");
        choice = sc.nextInt();  
       
        switch (choice) {
            case 1:
                  try {
                    Singlylinkedlists obj = new Singlylinkedlists();
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
                   DoublyLinkedList obj = new DoublyLinkedList();
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
                      choice=4;
                  } 
                  //  catch(MyExceptionHandling me){
                  //   System.out.println("Somthing Is Wrong : " + me.getMessage() + "\n Returning to Main Menu...");
                  //   new MainHelper().ToStart();
                  // }
                  catch (Exception e) {  System.out.println("An error occurred: " + e.getMessage()); }
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
