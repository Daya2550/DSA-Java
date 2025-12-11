package javadsa.Searching;

import java.util.Scanner;
import javadsa.Searching.Base;

public class BinarySearch {
    int[] arr = new int[100];
    int target;
    int size;






// Binary Search Algorithm

    public int ToSearch(int beg, int end, int[] arr, int target) {
        if(arr==null || size==0){
            System.out.println("Array is empty");
            return -1;
        }
        if (beg > end) {
            System.out.println("Element not found");
            return -1  ;
        }
        int mid = (beg + end) / 2;
        if (arr[mid] == target) {
            System.out.println("Element found at index: " + mid + " Value: " + arr[mid]);

            return mid;
        } else if (arr[mid] < target) {
            ToSearch(mid + 1, end, arr, target);

        } else {
            ToSearch(beg, mid - 1, arr, target);
        }
        return -1;
    }






    
  

    public void takeInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        size = sc.nextInt();

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Successfully taken input.");
    }

    public void toTakeInputSearch() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the target to search: ");
        target = sc.nextInt();
        ToSearch(0, size - 1, arr, target);
    }

    public void ToSamearraay() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of new inputes: ");
        int newsize = sc.nextInt();

        for (int i = size; i < (size + newsize); i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        size = (size + newsize);
        System.out.println("Successfully taken input.");
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
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    takeInput();
                    break;
                case 2:
                    toTakeInputSearch();
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
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");

            }
        } while (choice != 6);
    }

}
