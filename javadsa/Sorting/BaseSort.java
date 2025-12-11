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


    public void getinfomergesort() {
        String defination = "Definition of Merge Sort Algorithm: \n" +
                            "Merge Sort is a divide-and-conquer sorting algorithm that divides the input array into two halves, recursively sorts each half, and then merges the sorted halves back together. It is known for its efficiency and stability, making it suitable for large datasets.";
        String timeComplexity = "Time Complexity: \n" +
                                "Best Case: O(n log n) - occurs when the array is already sorted.\n" +
                                "Average Case: O(n log n) - occurs for random order of elements.\n" +
                                "Worst Case: O(n log n) - occurs when the array is sorted in reverse order.";
        String spaceComplexity = "Space Complexity: O(n) - Merge Sort requires additional memory space proportional to the size of the input array for the temporary arrays used during the merging process.";
        String feacher = "\n" +
                         "1. Efficiency: Merge Sort consistently performs at O(n log n) time complexity, making it efficient for large datasets compared to simpler algorithms like Bubble Sort or Insertion Sort.\n" +
                         "2. Stability: Merge Sort maintains the relative order of equal elements, which is important in certain applications where stability is required.\n" +
                         "3. Divide-and-Conquer: The algorithm's divide-and-conquer approach allows it to break down complex sorting tasks into smaller, manageable sub-tasks.\n" +
                         "4. External Sorting: Merge Sort is well-suited for external sorting algorithms, where data is too large to fit into memory, as it can efficiently sort data stored on disk.\n" +
                         "5. Recursive Nature: The recursive implementation of Merge Sort can lead to increased overhead due to function calls, but it also simplifies the code and enhances readability.";

       Scanner sc = new Scanner(System.in);
       int choice;
       do{
        System.out.println("----------------------------------------------------------");
        System.out.println("1. Defination of Merge Sort Algorithm");
        System.out.println("2. Time Complexity of Merge Sort Algorithm");
        System.out.println("3. Space Complexity of Merge Sort Algorithm");
        System.out.println("4. Feachers of Merge Sort Algorithm");
        System.out.print("5. Exit :");
        choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Defination of Merge Sort Algorithm: \n" + defination);
                    break;
                case 2:
                    System.out.println("Time Complexity of Merge Sort Algorithm: \n" + timeComplexity
    );
                    break;
                case 3:
                    System.out.println("Space Complexity of Merge Sort Algorithm: \n" + spaceComplexity);
                    break;
                case 4:
                    System.out.println("Feachers of Merge Sort Algorithm: \n" + feacher);
                    break;
                case 5:
                    System.out.println("Exiting Merge Sort Information.");
                    break;
                default :
                    System.out.println("Invalid choice, please try again.");
                    break;
            }
        }
            while (choice!=5); 
                
    }

}
