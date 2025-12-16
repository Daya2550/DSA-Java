package javadsa.Sorting.HelperClasses;

import java.util.Scanner;

import javadsa.Sorting.QuickSort;

public class parent {
    
    public int arr[] = new int[100];
   public  int size;


   


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


        // Show code snippet
        public void BubbleSortCode() {
            String bubbleSortCode = """
           public void ToSort() {
              // Bubble Sort Algorithm
              for (int i = 0; i < size - 1; i++) {
              // Last i elements are already sorted
                 for (int j = 0; j < size - i - 1; j++) { 
                 // Swap if the element found is greater than the next element
                 if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }""";
            
            System.out.println(bubbleSortCode);
        }



        
public void MergeSortCode() {
        String mergeSortCode = """
public void divide(int a[], int st, int ed){
    // base case for single element array or empty array
    if(st >= ed){
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

public void conquer(int arr[], int st, int mid, int ed){
    // temporary array
    int meg[] = new int[ed - st + 1];

    int id1 = st, // first array starting index
        id2 = mid + 1, // second array starting index
        x = 0; // mega array index

    // merging 2 sorted array
    while(id1 <= mid && id2 <= ed){
        if(arr[id1] <= arr[id2]){
            meg[x++] = arr[id1++];
        } else {
            meg[x++] = arr[id2++];
        }
    }

    // if any element left in first array
    while(id1 <= mid){
        meg[x++] = arr[id1++];
    }

    // if any element left in second array
    while(id2 <= ed){
        meg[x++] = arr[id2++];
    }

    // copy temp array to original array
    for(int i = 0, j = st; i < meg.length; i++, j++){
        arr[j] = meg[i];
    }
}
""";
        System.out.println(mergeSortCode);
    }



    
    public void QuickSortCode(){
        String quickSortCode = """
public void Sort(int arr[], int st, int ed){
    if(st < ed){
        int p = part(arr, st, ed);
        Sort(arr, st, p - 1);
        Sort(arr, p + 1, ed);
    }
}

public int part(int arr[], int st, int ed){
    int i = st - 1;
    int p = arr[ed];

    for(int j = st; j < ed; j++){
        if(arr[j] < p){
            i++;
            int t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
        }
    }
    i++;

    int t = arr[i];
    arr[i] = p;
    arr[ed] = t;

    return i;
}
""";
        System.out.println(quickSortCode);
    }



       public void SelectionSortCode(){
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

}
