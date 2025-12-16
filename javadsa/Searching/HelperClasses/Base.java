package javadsa.Searching.HelperClasses;

import java.util.Scanner;

public class Base {
      public void display(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    public  void heding(String heading) {
         System.out.println("----------------------------------------------------------");
         System.out.println("-----------------"+heading+"--------------------");
         System.out.println("----------------------------------------------------------");
    }

    public void exceptionHandling() {
        System.out.println("Invalid input, please try again.");

        
    }


public void toGetBinarySearchInfo() {
        String defination = "Binary Search is an efficient algorithm for finding an item from a sorted array of items. " +
                            "It works by repeatedly dividing the search interval in half. If the value of the search key is less than the item in the middle of the interval, " +
                            "the search continues in the lower half. Otherwise, it continues in the upper half. This process is repeated until the item is found or the interval is empty.";
        String timeComplexity = "Time Complexity:Best case  o(1) , O(log n) in the average and worst case scenarios.";
        String spaceComplexity = "Space Complexity: O(1) for iterative implementation and O(log n) for recursive implementation due to call stack.";
        String feacher = "Feachers of Binary Search: \n" +
                         "1. Efficient for large datasets: Binary Search significantly reduces the number of comparisons needed to find an element, making it much faster than linear search for large datasets.\n" +
                         "2. Requires sorted data: Binary Search can only be performed on data that is already sorted, which may require additional preprocessing time if the data is unsorted.\n" +
                         "3. Divide and conquer approach: Binary Search uses a divide-and-conquer strategy, which makes it a classic example of this algorithmic paradigm.\n" +
                         "4. Recursive and iterative implementations: Binary Search can be implemented both recursively and iteratively, providing flexibility in how it is used.\n" +
                         "5. Logarithmic time complexity: The time complexity of Binary Search is O(log n), making it very efficient for searching operations compared to linear search's O(n) time complexity.";

       Scanner sc = new Scanner(System.in);
       int choice;
       do{
        System.out.println("----------------------------------------------------------");
        System.out.println("1. Defination of Binary Search Algorithm");
        System.out.println("2. Time Complexity of Binary Search Algorithm");
        System.out.println("3. Space Complexity of Binary Search Algorithm");
        System.out.println("4. Feachers of Binary Search Algorithm");
        System.out.print("5. Exit :");
        choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Defination of Binary Search Algorithm: \n" + defination);
                    break;
                case 2:
                    System.out.println("Time Complexity of Binary Search Algorithm: \n" + timeComplexity );
                    break;
                case 3:
                    System.out.println("Space Complexity of Binary Search Algorithm: \n" + spaceComplexity);
                    break;
                case 4:
                    System.out.println("Feachers of Binary Search Algorithm: \n" + feacher);
                    break;
                case 5:
                    System.out.println("Exiting Binary Search Information.");
                    break;
                        
                default:

                    System.out.println("Invalid choice, please try again.");
                    break;
            }
       }
       while(choice!=5);  

    }
      
    public void toGetLinearSearchInfo() {
        String defination = "Linear Search is a simple searching algorithm that checks each element in a list sequentially until the desired element is found or the end of the list is reached.";
        String timeComplexity = "Time Complexity: O(n) in the best, average, and worst case scenarios.";
        String spaceComplexity = "Space Complexity: O(1) as it requires a constant amount of additional space.";
        String feacher = "Feachers of Linear Search: \n" +
                         "1. Simplicity: Linear Search is easy to understand and implement, making it suitable for small datasets or educational purposes.\n" +
                         "2. No sorting required: Unlike more complex algorithms like Binary Search, Linear Search does not require the data to be sorted beforehand.\n" +
                         "3. Works on unsorted data: Linear Search can be applied to both sorted and unsorted datasets without any modifications.\n" +
                         "4. Stable search method: Linear Search maintains the relative order of equal elements, making it a stable search algorithm.\n" +
                         "5. Inefficient for large datasets: As the size of the dataset increases, the performance of Linear Search degrades linearly, making it less efficient compared to more advanced algorithms.";

       Scanner sc = new Scanner(System.in);
       int choice;
       do{
        System.out.println("----------------------------------------------------------");
        System.out.println("1. Defination of Linear Search Algorithm");
        System.out.println("2. Time Complexity of Linear Search Algorithm");
        System.out.println("3. Space Complexity of Linear Search Algorithm");
        System.out.println("4. Feachers of Linear Search Algorithm");
        System.out.print("5. Exit :");
        choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Defination of Linear Search Algorithm: \n" + defination);
                    break;
                case 2:
                    System.out.println("Time Complexity of Linear Search Algorithm: \n" + timeComplexity );
                    break;
                case 3:
                    System.out.println("Space Complexity of Linear Search Algorithm: \n" + spaceComplexity);
                    break;
                case 4:
                    System.out.println("Feachers of Linear Search Algorithm: \n" + feacher);
                    break;
                case 5:
                    System.out.println("Exiting Linear Search Information.");
                    break;
                default :
                    System.out.println("Invalid choice, please try again.");
                    break;
            }
        }
            while (choice!=5); 
                
    }           


}

 