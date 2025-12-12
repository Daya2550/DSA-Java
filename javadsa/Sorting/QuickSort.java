package javadsa.Sorting;

import java.util.Scanner;

import javadsa.Searching.Base;

public class QuickSort {
 int arr[]=new int[100];
 int size ;




public  void Sort (int arr[], int st , int ed){

    if(st<ed){
        int p =part(arr ,st,ed);
        Sort(arr, st, p-1);
        Sort(arr,p+1, ed);
    }
}


public  int part(int arr[], int st, int ed){
    int i=st-1;
    int p=arr[ed];

    for(int j=st ;j<ed;j++){
        if(arr[j]<p){
            i++;
            int t=arr[i];
            arr[i]=arr[j];
            arr[j]=t;
        }
    }
    i++;

    int t=arr[i];
    arr[i]=p;
    arr[ed]=t;

    return i;
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
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    takeInput();
                    break;
                case 2:
                    Sort(arr,0,size-1);
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
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");

            }
        } while (choice != 6);
    }



}
