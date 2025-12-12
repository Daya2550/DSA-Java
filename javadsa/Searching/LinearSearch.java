package javadsa.Searching;

import java.util.Scanner;

public class LinearSearch {
    // Linear Search implementation

    Scanner sc = new Scanner(System.in);
    int[] arr = new int[100];
    int target;
    int size;








    
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









// Take initial input

    public void takeInput() {
        System.out.print("Enter the size of array: ");
        size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Successfully taken input.");
    }

    // Input target to search
    public void toTakeInputSearch() {
        System.out.print("Enter the target to search: ");
        target = sc.nextInt();
        ToSearch(arr, size, target);
    }
    
// Add more elements to the same array
    public void ToSamearraay() {
        System.out.print("Enter the size of new inputes: ");
        int newsize = sc.nextInt();

        for (int i = size; i < (size + newsize); i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        size += newsize;
        System.out.println("Successfully added new elements.");
    }

    public void codeshow(){
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

         """
                ;
                System.out.println(linearSearchCode);
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
                    toTakeInputSearch();
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
                    codeshow();
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
