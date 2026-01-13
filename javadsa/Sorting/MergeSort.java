package javadsa.Sorting;

import java.util.Scanner;

import javadsa.MainHelper.MainHelper;
import javadsa.MainHelper.MyExceptionHandling;
import javadsa.Searching.HelperClasses.Base;
import javadsa.Sorting.HelperClasses.BaseSort;
import javadsa.Sorting.HelperClasses.parent;

public class MergeSort extends parent {

    public void divide(int a[], int st, int ed) {
        // base case for single element array or empty array
        if (st >= ed) {
            return;
        }

        // finding mid point
        int mid = (st + ed) / 2;

        // recursive calls to divide array into halves
        divide(a, st, mid);
        divide(a, mid + 1, ed);

        // merging 2 sorted halves
        conquer(a, st, mid, ed);

    }

    public void conquer(int arr[], int st, int mid, int ed) {
        // temporary array
        int meg[] = new int[ed - st + 1];

        int id1 = st, // first array starting index
                id2 = mid + 1, // second array starting index
                x = 0;// mega array index

        // merging 2 sorted array
        while (id1 <= mid && id2 <= ed) {
            if (arr[id1] <= arr[id2]) {
                meg[x++] = arr[id1++];
            } else {
                meg[x++] = arr[id2++];
            }
        }
        // if any element left in first array
        while (id1 <= mid) {
            meg[x++] = arr[id1++];
        }
        // if any element left in second array
        while (id2 <= ed) {
            meg[x++] = arr[id2++];
        }

        // copy tem array to original array
        for (int i = 0, j = st; i < meg.length; i++, j++) {
            arr[j] = meg[i];
        }
    }

    // Main run method to execute Merge Sort operations
    public void run() throws MyExceptionHandling {
        MainHelper.SectionHeader("Merge Sort Algorithm");

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
                    divide(arr, 0, size - 1);
                    break;
                case 3:
                    display();
                    break;
                case 4:
                    ToSamearraay();
                    break;
                case 5:
                    BaseSort baseSort = new BaseSort();
                    baseSort.getinfomergesort();
                    break;
                case 6:
                    MergeSortCode();
                    break;
                case 7:
                    MainHelper.SectionExit("Merge Sort");
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
