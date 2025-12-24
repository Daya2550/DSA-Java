package javadsa.Indexing;

import java.util.Scanner;

import javadsa.Sorting.BubbleSort;
import javadsa.Sorting.MergeSort;
import javadsa.Sorting.QuickSort;
import javadsa.Sorting.SelectionSort;
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
        System.out.print("3. Exit :");
        choice = sc.nextInt();  
       
        switch (choice) {
            case 1:
                  try {
                    stack obj = new stack();
                     obj.run();
                  } catch (Exception e) {  System.out.println("An error occurred: " + e.getMessage()); }

                break;

             case 2:
                  try {
                    MergeSort obj = new MergeSort();
                     obj.run();
                  } catch (Exception e) {  System.out.println("An error occurred: " + e.getMessage()); }

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
