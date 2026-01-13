package javadsa.Indexing;

import java.util.Scanner;

import javadsa.LinkedList.DoublyLinkedList;
import javadsa.LinkedList.Singlylinkedlists;
import javadsa.Sorting.BubbleSort;
import javadsa.Sorting.MergeSort;
import javadsa.Sorting.QuickSort;
import javadsa.Sorting.SelectionSort;

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
                  } catch (Exception e) {  System.out.println("An error occurred: " + e.getMessage()); }

                break;

             case 2:
                  try {
                   DoublyLinkedList obj = new DoublyLinkedList();
                    obj.run();
                  } catch (Exception e) {  System.out.println("An error occurred: " + e.getMessage()); }

                break;
             case 3:
                  try {
                      choice=4;
                  } catch (Exception e) {  System.out.println("An error occurred: " + e.getMessage()); }
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
