package javadsa.Sorting;

import java.util.Scanner;

import javadsa.Searching.HelperClasses.Base;
import javadsa.Sorting.HelperClasses.BaseSort;
import javadsa.Sorting.HelperClasses.parent;

public class BubbleSort extends parent {

   

    


// int arr[]={1,2,3,4,5,6};



    
    // Bubble sort Algorithm
    public void ToSort() {
        // Bubble Sort Algorithm
        for (int i = 0; i < size - 1; i++) {
            // Last i elements are already sorted
            for (int j = 0; j < size - i - 1; j++) { 
                // Swap if the element found is greater than the next element
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

















// Main run method to execute Bubble Sort operations
     public void run() {
       Base base = new Base();
       base.heding("Bubble Sort  Algorithm");

        // Menu for user interaction
        int choice;
        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.println("1. Take Input");
            System.out.println("2. Sort Array");
            System.out.println("3. Display Array");
            System.out.println("4. Add More Elements to Array");
            System.out.println("5. Information about Bubble Sort  Algorithm");
            System.out.println("6. Show Code Snippet");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    takeInput();
                    break;
                case 2:
                    ToSort();
                    break;
                case 3:
                    display();
                    break;
                case 4:
                    ToSamearraay();
                    break;
                case 5:
                   BaseSort baseSort = new BaseSort();
                     baseSort.ToGetBubbleSortInfo();
                    break;
                case 6:
                    BubbleSortCode();
                    break;
                case 7:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
                 

            }
        } while (choice != 7);
    }


}
