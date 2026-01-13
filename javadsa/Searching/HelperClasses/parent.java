package javadsa.Searching.HelperClasses;

import java.util.Scanner;

import javadsa.Searching.BinarySearch;
import javadsa.Sorting.MergeSort;

public class parent {
    public int[] arr = new int[100];
    public int target;
    public int size;

    public void takeInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        size = sc.nextInt();
        if (size > 100) {
            System.out.println("Size too large, setting to 100.");
            size = 100;
        }

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Successfully taken input.");

    }

    public int toTakeInputSearch() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the target to search: ");
        target = sc.nextInt();
        return target;
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

    public void itbeingSorted() {
        // To checking array is sorted or not
        for (int i = 0; i < size - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                System.out.println("Your Entered Array is not sorted. Sorting the array using Merge Sort...");
                try {
                    MergeSort ms = new MergeSort();
                    ms.divide(arr, 0, size - 1);
                } catch (Exception e) {
                    System.out.println(
                            "Error in sorting the array before binary search. Please ensure the array is sorted.");
                }
                return;
            }
        }
    }

    public void BinarySearchCode() {
        String binarySearchCode = """

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
                """;
        System.out.println(binarySearchCode);
    }

    public void LinearSearchCode() {
        String linearSearchCode = """
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

                     """;
        System.out.println(linearSearchCode);
    }
}
