package javadsa.Searching;

import java.lang.reflect.Array;
import java.util.Scanner;

import javadsa.Searching.HelperClasses.Base;
import javadsa.Searching.HelperClasses.parent;
import javadsa.Sorting.MergeSort;

public class BinarySearch extends parent {
  







    
// Binary Search Algorithm

    public int ToSearch(int beg, int end, int[] arr, int target) {
        // base case for empty array
        if(arr==null || size==0){
            System.out.println("Array is empty");
            return -1;
        }
        // base case for element not found
        if (beg > end) {
            System.out.println("Element not found");
            return -1  ;
        }
        // finding mid point
        int mid = (beg + end) / 2;
        // checking mid element with target
        if (arr[mid] == target) {
            System.out.println("Element found at index: " + mid + " Value: " + arr[mid]);
            return mid;
        }
         // recursive calls to search in left or right half
         else if (arr[mid] < target) {
            ToSearch(mid + 1, end, arr, target);

        } else {
            ToSearch(beg, mid - 1, arr, target);
        }
        return -1;
    }






    
  

    

 




    public void run() {
       Base base = new Base();
       base.heding("Binary Search Algorithm");

        // Menu for user interaction
        int choice;
        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.println("1. Take Input");
            System.out.println("2. Search Element");
            System.out.println("3. Display Array");
            System.out.println("4. Add More Elements to Array");
            System.out.println("5. Information about Binary Search Algorithm");
            System.out.println("6. Show Code Snippet");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    takeInput();
                    break;
                case 2:
                    int r=toTakeInputSearch();
                    ToSearch(0, size-1, arr, r);
                    break;
                case 3:
                    base.display(arr, size);
                    break;
                case 4:
                    ToSamearraay();
                    break;
                case 5:
                    base.toGetBinarySearchInfo();
                    
                    break;
                case 6:
                    BinarySearchCode();
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
