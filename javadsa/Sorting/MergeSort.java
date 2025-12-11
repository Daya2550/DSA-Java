package javadsa.Sorting;

import java.util.Scanner;

import javadsa.Searching.Base;

public class MergeSort {

  // Merge sort implementation
    int arr[] = new int[100];
    int size;
 
    public  void divide(int a[], int st ,int ed){
      // base case for single element array or empty array
        if(st>=ed){
            return;
        }

        // finding mid point
        int mid = (st+ed)/2;

        // recursive calls to divide array into halves
        divide(a,st,mid);
        divide(a,mid+1,ed);

        // merging 2 sorted halves
        conquer(a,st,mid,ed);

    }



    public  void conquer(int arr[], int st ,int mid ,int ed){
      // temporary array
      int meg[]=new int[ed-st+1];

      int id1=st ,//  first array  starting index
      id2=mid+1 ,// second array starting index
      x=0;// mega array index

      // merging 2 sorted array
      while (id1<=mid && id2<=ed) {
            if(arr[id1]<=arr[id2]){
                meg[x++]=arr[id1++];
            }
            else{
                meg[x++]=arr[id2++];
            }
      }
    // if any element left in first array
      while(id1<=mid){
        meg[x++]=arr[id1++];
      }
    // if any element left in second array  
      while( id2<=ed){
         meg[x++]=arr[id2++];
      }

   // copy tem  array to original array
      for(int i=0 ,j=st ;i<meg.length;i++,j++){
        arr[j]=meg[i];
      }
    }















        // Display sorted array
    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
    }



      // Take initial input
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

    // Add more elements to the same array
    public void ToSamearraay() {
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
       base.heding("Merge Sort  Algorithm");

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
                    divide(arr,0,size-1);
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
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");

            }
        } while (choice != 6);
    }


}
