package javadsa.Searching;

import java.lang.reflect.Array;
import java.util.Scanner;

import javadsa.MainHelper.MainHelper;
import javadsa.MainHelper.MyExceptionHandling;
import javadsa.Searching.HelperClasses.Base;
import javadsa.Searching.HelperClasses.parent;
import javadsa.Sorting.MergeSort;

public class BinarySearch extends parent {

    // Binary Search Algorithm

    public int ToSearch(int beg, int end, int[] arr, int target) {
        // base case for empty array
        if (arr == null || size == 0) {
            System.out.println("Array is empty");
            return -1;
        }
        // base case for element not found
        if (beg > end) {
            System.out.println("Element not found");
            return -1;
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
            return ToSearch(mid + 1, end, arr, target);

        } else {
            return ToSearch(beg, mid - 1, arr, target);
        }
    }

    public void run() throws MyExceptionHandling {
        Base base = new Base();
        MainHelper.SectionHeader("Binary Search Algorithm");

        // Menu for user interaction
        int choice = 0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("1. Take Input");
            System.out.println("2. Search Element");
            System.out.println("3. Display Array");
            System.out.println("4. Add More Elements to Array");
            System.out.println("5. Information about Binary Search Algorithm");
            System.out.println("6. Show Code Snippet");
            System.out.println("7. Exit");
            System.out.println("8. Stop Application Program");

            System.out.print("Enter your choice: ");
            try {
                choice = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Some thing went Wrong !");
                MainHelper.ErrorMessage();
                run();
            }

            switch (choice) {
                case 1:
                    takeInput();
                    break;
                case 2:
                    int r = toTakeInputSearch();
                    ToSearch(0, size - 1, arr, r);
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
                    MainHelper.SectionExit("Binary Search");
                    break;
                case 8:
                    MainHelper.StopApp();
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");

            }
        } while (choice != 7);
    }

}
