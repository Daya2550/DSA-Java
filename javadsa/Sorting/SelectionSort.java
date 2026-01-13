package javadsa.Sorting;

import java.util.Scanner;

import javadsa.MainHelper.MainHelper;
import javadsa.MainHelper.MyExceptionHandling;
import javadsa.Searching.HelperClasses.Base;
import javadsa.Sorting.HelperClasses.BaseSort;
import javadsa.Sorting.HelperClasses.parent;

public class SelectionSort extends parent {

    //
    public static void Sort(int arr[], int size) {

        // Selection Sort Algorithm
        for (int i = 0; i < size - 1; i++) {
            // finding index of minimum element idx referes to index of minimum element
            int idx = i;
            // traversing through unsorted array
            for (int j = i + 1; j < size; j++) {
                // comparing to find minimum element
                if (arr[j] < arr[idx]) {
                    // updating idx if current element is smaller
                    idx = j;
                }
            }
            // swapping minimum element with first element of unsorted array
            int t = arr[i];
            arr[i] = arr[idx];
            arr[idx] = t;
        }
    }

    // Main run method to execute Merge Sort operations
    public void run() throws MyExceptionHandling {
        MainHelper.SectionHeader("Selection Sort Algorithm");

        // Menu for user interaction
        int choice = 0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("1. Take Input");
            System.out.println("2. Sort Array");
            System.out.println("3. Display Array");
            System.out.println("4. Add More Elements to Array");
            System.out.println("5. Information about Merge Sort  Algorithm");
            System.out.println("6. Show Code Snippet");
            System.out.println("7. Exit");
            System.out.println("8. Stop Application Program");

            System.out.print("Enter your choice: ");
            try {
                choice = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Something went wrong!");
                sc.nextLine();
                MainHelper.ErrorMessage();
            }

            switch (choice) {
                case 1:
                    takeInput();
                    break;
                case 2:
                    Sort(arr, size - 1);
                    break;
                case 3:
                    display();
                    break;
                case 4:
                    ToSamearraay();
                    break;
                case 5:
                    BaseSort baseSort = new BaseSort();
                    baseSort.getinfoquicksort();
                    ;
                    break;
                case 6:
                    SelectionSortCode();
                    break;
                case 7:
                    MainHelper.SectionExit("Selection Sort");
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
