package javadsa.StackAndQueue.HelperClasses;

import java.util.Scanner;

public class BaseStackAndQueue {
      public void InfoStack() {
        String defination = "Definition of Stack Algorithm: \n" +
                            "A Stack is a linear data structure that follows the Last In First Out (LIFO) principle. Elements are added and removed from the same end, known as the top of the stack.";
        String timeComplexity = "Time Complexity: \n" +
                                "Push Operation: O(1) - Adding an element to the top of the stack.\n" +
                                "Pop Operation: O(1) - Removing an element from the top of the stack.\n" +
                                "Peek Operation: O(1) - Accessing the top element without removing it.";
        String spaceComplexity = "Space Complexity: \n" +
                              "O(n) - The space required to store n elements in the stack.";
        String feacher = " Feachers of Stack Algorithm: \n" +
                         "1. LIFO Principle: Last In First Out order of element access.\n" +
                         "2. Dynamic Size: Can grow and shrink as needed (if implemented using linked list).\n" +
                         "3. Basic Operations: Push, Pop, Peek, isEmpty, isFull.\n" +
                         "4. Used in Function Call Management, Expression Evaluation, Backtracking Algorithms, etc.";

       Scanner sc = new Scanner(System.in);
       int choice;
       do{
        System.out.println("----------------------------------------------------------");
        System.out.println("1. Defination of Stack");
        System.out.println("2. Time Complexity of Stack");
        System.out.println("3. Space Complexity of Stack");
        System.out.println("4. Feachers of Stack ");
        System.out.print("5. Exit :");
        choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Defination of Stack: \n" + defination);
                    break;
                case 2:
                    System.out.println("Time Complexity of Stack: \n" + timeComplexity
    );
                    break;          
                case 3:
                    System.out.println("Space Complexity of Stack: \n" + spaceComplexity);
                    break;      
                case 4:
                    System.out.println("Feachers of Stack: \n" + feacher);
                    break;
                case 5:
                    System.out.println("Exiting Stack Information.");
                    break;
                default :
                    System.out.println("Invalid choice, please try again.");
                    break;
                }            
        
            }
            while (choice!=5); 
                
    }

}
