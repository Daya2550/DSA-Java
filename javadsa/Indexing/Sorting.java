package javadsa.Indexing;

import java.util.Scanner;

import javadsa.Sorting.BubbleSort;
import javadsa.Sorting.MergeSort;
import javadsa.Sorting.QuickSort;
import javadsa.Sorting.SelectionSort;

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
         System.out.println("2. Merge Sort");
         System.out.println("3. Quick Sort");
         System.out.println("4. Slection Sort ");
        System.out.print("5. Exit :");
        choice = sc.nextInt();  
       
        switch (choice) {
            case 1:
                  try {
                    BubbleSort obj = new BubbleSort();
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
                  try {
                    QuickSort obj = new QuickSort();
                     obj.run();
                  } catch (Exception e) {  System.out.println("An error occurred: " + e.getMessage()); }

                break;  
              case 4:
                    try {
                      SelectionSort obj = new SelectionSort();
                       obj.run();
                    } catch (Exception e) {  System.out.println("An error occurred: " + e.getMessage()); }      

            case 5:
                  System.out.println("Exiting the program.");
                break;
         
            default:
                System.out.println("Invalid choice, please try again.");
      }
     }
        while(choice!=5);    
    }
}
