package javadsa.Searching;

import java.util.Scanner;

import javadsa.Searching.HelperClasses.Base;
import javadsa.Searching.HelperClasses.parent;

public class LinearSearch extends parent {


   








    
// Linear Search Algorithm
    public int ToSearch(int[] arr, int size, int target) {
        // base case for empty array
        if(arr==null || size==0){
            System.out.println("Array is empty");
            return -1;
        }
        // linear search through the array
        for (int i = 0; i < size; i++) {
            if (arr[i] == target) {
                System.out.println("Element found at index: " + i + " Value: " + arr[i]);
                return i;
            }
        }
        System.out.println("Element not found");
        return -1;
    }










  

    // Main run method to execute Linear Search operations
    public void run() {
        Base base = new Base();
        base.heding("Linear Search ");

        int choice;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1. Take Input");
            System.out.println("2. Search Element");
            System.out.println("3. Display Array");
            System.out.println("4. Add More Elements to Array");
            System.out.println("5. Information about Linear Search Algorithm");
            System.out.println( "6. Show Code Snippet");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    takeInput();
                    break;
                case 2:
                   int r= toTakeInputSearch();
                ToSearch(arr, size, r);
                    break;
                case 3:
                    base.display(arr, size);
                    break;
                case 4:
                    ToSamearraay();
                    break;
                case 5:
                    base.toGetLinearSearchInfo();
                    break;

                case 6:
                    LinearSearchCode();
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
