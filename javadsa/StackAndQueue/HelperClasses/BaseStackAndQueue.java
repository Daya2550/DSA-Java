package javadsa.StackAndQueue.HelperClasses;

import java.util.Scanner;

import javadsa.MainHelper.MainHelper;

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
        int choice = 0;
        do {
            System.out.println("----------------------------------------------------------");
            System.out.println("1. Defination of Stack");
            System.out.println("2. Time Complexity of Stack");
            System.out.println("3. Space Complexity of Stack");
            System.out.println("4. Feachers of Stack ");
            System.out.print("5. Exit :");
            try {
                choice = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Some thing went Wrong !");
                MainHelper.ErrorMessage();
                InfoStack();
            }
            switch (choice) {
                case 1:
                    System.out.println("Defination of Stack: \n" + defination);
                    break;
                case 2:
                    System.out.println("Time Complexity of Stack: \n" + timeComplexity);
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
                default:
                    System.out.println("Invalid choice, please try again.");
                    break;
            }

        } while (choice != 5);

    }

    public void InfoQueue() {
        String defination = "Definition of Queue Algorithm: \n" +
                "A Queue is a linear data structure that follows the First In First Out (FIFO) principle. Elements are added at the rear (end) and removed from the front (beginning) of the queue.";
        String timeComplexity = "Time Complexity: \n" +
                "Enqueue Operation: O(1) - Adding an element to the rear of the queue.\n" +
                "Dequeue Operation: O(1) - Removing an element from the front of the queue.\n" +
                "Peek Operation: O(1) - Accessing the front element without removing it.";
        String spaceComplexity = "Space Complexity: \n" +
                "O(n) - The space required to store n elements in the queue.";
        String feacher = " Feachers of Queue Algorithm: \n" +
                "1. FIFO Principle: First In First Out order of element access.\n" +
                "2. Dynamic Size: Can grow and shrink as needed (if implemented using linked list).\n" +
                "3. Basic Operations: Enqueue, Dequeue, Peek, isEmpty, isFull.\n" +
                "4. Used in Scheduling Algorithms, Buffer Management, Breadth-First Search, etc.";

        Scanner sc = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("----------------------------------------------------------");
            System.out.println("1. Defination of Queue");
            System.out.println("2. Time Complexity of Queue");
            System.out.println("3. Space Complexity of Queue");
            System.out.println("4. Feachers of Queue ");
            System.out.print("5. Exit :");
            try {
                choice = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Something went wrong!");
                sc.nextLine();
                MainHelper.ErrorMessage();
            }
            switch (choice) {
                case 1:
                    System.out.println("Defination of Queue: \n" + defination);
                    break;
                case 2:
                    System.out.println("Time Complexity of Queue: \n" + timeComplexity);
                    break;
                case 3:
                    System.out.println("Space Complexity of Queue: \n" + spaceComplexity);
                    break;
                case 4:
                    System.out.println("Feachers of Queue: \n" + feacher);
                    break;
                case 5:
                    System.out.println("Exiting Queue Information.");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
                    break;
            }
        } while (choice != 5);
    }

    public void InfoCircularQueue() {
        String definition = "Definition of Circular Queue:\n" +
                "A Circular Queue is a linear data structure that follows FIFO, but the last position\n" +
                "is connected back to the first position to make a circle.\n" +
                "When the rear reaches the end of the array, it continues from the beginning.";

        String timeComplexity = "Time Complexity:\n" +
                "Enqueue Operation: O(1) using (rear + 1) % capacity.\n" +
                "Dequeue Operation: O(1) using (front + 1) % capacity.\n" +
                "Peek Operation: O(1).\n" +
                "All operations are constant time.";

        String spaceComplexity = "Space Complexity:\n" +
                "O(n) where n is the capacity of the circular queue array.";

        String features = "Features of Circular Queue:\n" +
                "1. FIFO Principle is followed.\n" +
                "2. Better memory utilization compared to normal queue.\n" +
                "3. No space is wasted after dequeue operations.\n" +
                "4. Used in CPU scheduling, buffering, streaming, traffic systems.\n" +
                "5. Implemented using modulo (%) operator.";

        Scanner sc = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("----------------------------------------------------------");
            System.out.println("1. Definition of Circular Queue");
            System.out.println("2. Time Complexity of Circular Queue");
            System.out.println("3. Space Complexity of Circular Queue");
            System.out.println("4. Features of Circular Queue");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            try {
                choice = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Something went wrong!");
                sc.nextLine();
                MainHelper.ErrorMessage();
            }

            switch (choice) {
                case 1:
                    System.out.println(definition);
                    break;
                case 2:
                    System.out.println(timeComplexity);
                    break;
                case 3:
                    System.out.println(spaceComplexity);
                    break;
                case 4:
                    System.out.println(features);
                    break;
                case 5:
                    System.out.println("Exiting Circular Queue Information.");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 5);
    }

}
