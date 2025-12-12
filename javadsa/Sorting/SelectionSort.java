package javadsa.Sorting;

import java.util.Scanner;

import javadsa.Searching.Base;

public class SelectionSort {
 int arr[]=new int[100];
 int size ;

//
    public static void Sort(int arr[] , int size){

        // Selection Sort Algorithm
        for(int i=0;i<size-1;i++){
            // finding index of minimum element idx referes to index of minimum element
            int idx =i;
            // traversing through unsorted array
            for(int j=i+1 ;j<size;j++){
                // comparing to find minimum element
                if(arr[j]<arr[idx]){
                    // updating idx if current element is smaller
                    idx =j;
                }
            }
            // swapping minimum element with first element of unsorted array
            int t=arr[i];
            arr[i]=arr[idx];
            arr[idx]=t;
        }
    }


  // Display sorted array
    public  void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
    }



      // Take initial input
    public  void takeInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        size = sc.nextInt();

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Successfully taken input.");
    }

    // Add more elements to the same array
    public  void ToSamearraay() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of new inputs: ");
        int newSize = sc.nextInt();

        for (int i = size; i < size + newSize; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        size = size + newSize;
        System.out.println("Successfully taken input.");
    }

    public void codeshow(){
        String quickSortCode = """
          public static void Sort(int arr[] , int size){

        for(int i=0;i<size-1;i++){
            int idx =i;
            for(int j=i+1 ;j<size;j++){
                if(arr[j]<arr[idx]){
                    idx =j;
                }
            }
            int t=arr[i];
            arr[i]=arr[idx];
            arr[idx]=t;
        }
    }
""";
        System.out.println(quickSortCode);
    }


// Main run method to execute Merge Sort operations
     public void run() {
       Base base = new Base();
       base.heding("Quick Sort  Algorithm");

        // Menu for user interaction
        int choice;
        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.println("1. Take Input");
            System.out.println("2. Sort Array");
            System.out.println("3. Display Array");
            System.out.println("4. Add More Elements to Array");
            System.out.println("5. Information about Merge Sort  Algorithm");
            System.out.println("6. Show Code Snippet");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    takeInput();
                    break;
                case 2:
                    Sort(arr,size-1);
                    break;
                case 3:
                    display();
                    break;
                case 4:
                    ToSamearraay();
                    break;
                case 5:
                   BaseSort baseSort = new BaseSort();
                     baseSort.getinfoquicksort();;
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
