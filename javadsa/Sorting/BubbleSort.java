package javadsa.Sorting;

import java.util.Scanner;

import javadsa.Searching.Base;

public class BubbleSort {

    int arr[] = new int[100];
    int size;





    
    // Bubble sort (same logic as your code)
    public void ToSort() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) { 
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
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



     public void run() {
       Base base = new Base();
       base.heding("Bubble Sort  Algorithm");

        // Menu for user interaction
        int choice;
        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.println("1. Take Input");
            System.out.println("2. Sort Array");
            System.out.println("3. Display Array");
            System.out.println("4. Add More Elements to Array");
            System.out.println("5. Information about Bubble Sort  Algorithm");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    takeInput();
                    break;
                case 2:
                    ToSort();
                    break;
                case 3:
                    display();
                    break;
                case 4:
                    ToSamearraay();
                    break;
                case 5:
                   BaseSort baseSort = new BaseSort();
                     baseSort.ToGetBubbleSortInfo();
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
