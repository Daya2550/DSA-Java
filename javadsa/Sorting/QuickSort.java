package javadsa.Sorting;

import java.util.Scanner;

import javadsa.MainHelper.MyExceptionHandling;
import javadsa.Searching.HelperClasses.Base;
import javadsa.Sorting.HelperClasses.BaseSort;
import javadsa.Sorting.HelperClasses.parent;

public class QuickSort  extends parent{





public  void Sort (int arr[], int st , int ed){
// base case
    if(st<ed){
        // partitioning array and getting pivot index
        int p =part(arr ,st,ed);
        // recursive calls to sort left and right halves
        Sort(arr, st, p-1);
        Sort(arr,p+1, ed);
    }
}


public  int part(int arr[], int st, int ed){
    // pivot index initialization 
     int p=arr[ed];
     // Refference index for smaller element
    int i=st-1;
   
// traversing through all elements
    for(int j=st ;j<ed;j++){
        // if current element is smaller than pivot
        if(arr[j]<p){
            // incrementing index of smaller element
            i++;
            // swapping elements
            int t=arr[i];
            arr[i]=arr[j];
            arr[j]=t;
        }
    }
// placing pivot element at correct position
    i++;
// swapping pivot element with element at index i
    int t=arr[i];
    arr[i]=p;
    arr[ed]=t;

    // returning pivot index
    return i;
}






// Main run method to execute Merge Sort operations
     public void run() throws MyExceptionHandling {
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
                    QuickSortCode();
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
