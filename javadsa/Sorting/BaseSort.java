package javadsa.Sorting;

import java.util.Scanner;

public class BaseSort {

     public void ToGetBubbleSortInfo() {
        String defination = "Definition of Bubble Sort Algorithm: \n" +
                            "Bubble Sort is a simple sorting algorithm that repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order. The process is repeated until the list is sorted. The algorithm gets its name from the way smaller elements 'bubble' to the top of the list.";
        String timeComplexity = "Time Complexity: \n" +
                                "Best Case: O(n) - occurs when the array is already sorted.\n" +
                                "Average Case: O(n^2) - occurs for random order of elements.\n" +
                                "Worst Case: O(n^2) - occurs when the array is sorted in reverse order.";
        String spaceComplexity = "Space Complexity: O(1) - Bubble Sort is an in-place sorting algorithm, meaning it requires a constant amount of additional memory space regardless of the input size.";
        String feacher = "\n" +
                         "1. Simplicity: Bubble Sort is easy to understand and implement, making it suitable for small datasets or educational purposes.\n" +
                         "2. In-Place Sorting: It sorts the array without requiring additional storage space, making it memory efficient.\n" +
                         "3. Stable Sort: Bubble Sort maintains the relative order of equal elements, which is important in certain applications.\n" +
                         "4. Adaptive: The algorithm can be optimized to stop early if the array becomes sorted before completing all passes, improving performance on nearly sorted datasets.\n" +
                         "5. Inefficient for Large Datasets: Due to its O(n^2) time complexity in average and worst-case scenarios, Bubble Sort is not suitable for large datasets compared to more advanced algorithms like Quick Sort or Merge Sort.";

       Scanner sc = new Scanner(System.in);
       int choice;
       do{
        System.out.println("----------------------------------------------------------");
        System.out.println("1. Defination of Bubble Sort Algorithm");
        System.out.println("2. Time Complexity of Bubble Sort Algorithm");
        System.out.println("3. Space Complexity of Bubble Sort Algorithm");
        System.out.println("4. Feachers of Bubble Sort Algorithm");
        System.out.print("5. Exit :");
        choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Defination of Bubble Sort Algorithm: \n" + defination);
                    break;
                case 2:
                    System.out.println("Time Complexity of Bubble Sort Algorithm: \n" + timeComplexity );
                    break;
                case 3:
                    System.out.println("Space Complexity of Bubble Sort Algorithm: \n" + spaceComplexity);
                    break;
                case 4:
                    System.out.println("Feachers of Bubble Sort Algorithm: \n" + feacher);
                    break;
                case 5:
                    System.out.println("Exiting Bubble Sort Information.");
                    break;
                default :
                    System.out.println("Invalid choice, please try again.");
                    break;
            }
        }
            while (choice!=5); 
                
    }         

}
