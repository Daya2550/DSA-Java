package javadsa.Indexing;

import java.util.Scanner;

import javadsa.Searching.BinarySearch;
import javadsa.Searching.LinearSearch;
import javadsa.Sorting.BubbleSort;

public class Sorting {
     public void Sort() {
        // Implementation for indexing search can be added here
         Scanner sc = new Scanner(System.in);
        int choice =1;
        System.out.println("Welcome to Sorting Algo in Java");
        System.out.println("-----------------------------------------------");
      do{
        System.out.println("Choose an option:");
        System.out.println("1. Bubble Sort");
        System.out.print("2. Exit :");
        choice = sc.nextInt();  
       
        switch (choice) {
            case 1:
                  try {
                    BubbleSort obj = new BubbleSort();
                     obj.run();
                  } catch (Exception e) {  System.out.println("An error occurred: " + e.getMessage()); }

                break;

            case 2:
                  System.out.println("Exiting the program.");
                break;
         
            default:
                System.out.println("Invalid choice, please try again.");
      }
     }
        while(choice!=2);    
    }
}
