package javadsa.LinkedList.HelperClasses;

import java.util.Scanner;

import javadsa.MainHelper.MainHelper;

public class BaseLL {
    public void InfoSinglyLinkedList() {
        String defination = "Definition of Linked List: \n" +
                "A Linked List is a linear data structure where elements are stored in nodes, and each node contains a data field and a reference (link) to the next node in the sequence.";
        String timeComplexity = "Time Complexity: \n" +
                "Insertion at Beginning: O(1) - Adding an element at the beginning of the list.\n" +
                "Insertion at End: O(n) - Adding an element at the end of the list.\n" +
                "Deletion at Beginning: O(1) - Removing an element from the beginning of the list.\n" +
                "Deletion at End: O(n) - Removing an element from the end of the list.\n" +
                "Accessing an Element: O(n) - Accessing an element by index in a linked list.";
        String spaceComplexity = "Space Complexity: \n" +
                "O(n) -  The space required to store n elements in the linked list.";
        String feacher = " Feachers of Linked List Algorithm: \n" +
                "1. Dynamic Size: Can grow and shrink as needed (if implemented using linked list).\n" +
                "2. Efficient Insertion/Deletion: Fast insertion and deletion at the beginning of the list.\n" +
                "3. No Memory Wastage: Memory is allocated dynamically as needed.\n" +
                "4. Used in Implementing Other Data Structures: Stacks, Queues, Hash Tables, etc.";

        Scanner sc = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("----------------------------------------------------------");
            System.out.println("1. Defination of Linked List");
            System.out.println("2. Time Complexity of Linked List");
            System.out.println("3. Space Complexity of Linked List");
            System.out.println("4. Feachers of Linked List ");
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
                    System.out.println("Defination of Linked List: \n" + defination);
                    break;
                case 2:
                    System.out.println("Time Complexity of Linked List: \n" + timeComplexity);
                    break;
                case 3:
                    System.out.println("Space Complexity of Linked List: \n" + spaceComplexity);
                    break;
                case 4:
                    System.out.println("Feachers of Linked List: \n" + feacher);
                    break;
                case 5:
                    System.out.println("Exiting Linked List Information.");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
                    break;
            }
        } while (choice != 5);
    }

    public static void infoDoublyLinkedList() {

        String definition = "Definition of Doubly Linked List:\n" +
                "A Doubly Linked List is a linear data structure where each node contains\n" +
                "three parts: data, a reference to the previous node, and a reference to the next node.\n" +
                "This allows traversal in both forward and backward directions.";

        String timeComplexity = "Time Complexity:\n" +
                "Insertion at Beginning: O(1)\n" +
                "Insertion at End: O(1) if tail is maintained, otherwise O(n)\n" +
                "Deletion at Beginning: O(1)\n" +
                "Deletion at End: O(1) if tail is maintained\n" +
                "Searching an Element: O(n)\n" +
                "Traversal (Forward/Backward): O(n)";

        String spaceComplexity = "Space Complexity:\n" +
                "O(n) - Each node requires extra memory for storing previous and next references.";

        String features = "Features of Doubly Linked List:\n" +
                "1. Two-Way Traversal: You can move forward as well as backward.\n" +
                "2. Efficient Deletion: Deleting a specific node is easier because the previous node is directly accessible.\n"
                +
                "3. Dynamic Size: The list can grow or shrink at runtime.\n" +
                "4. Used in Applications: Browser history, undo/redo operations, navigation systems.";

        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("\n----------------------------------------------");
            System.out.println("1. Definition of Doubly Linked List");
            System.out.println("2. Time Complexity");
            System.out.println("3. Space Complexity");
            System.out.println("4. Features");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            try {
                choice = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Something went wrong!");
                scanner.nextLine();
                MainHelper.ErrorMessage();
            }

            switch (choice) {
                case 1:
                    System.out.println("\n" + definition);
                    break;
                case 2:
                    System.out.println("\n" + timeComplexity);
                    break;
                case 3:
                    System.out.println("\n" + spaceComplexity);
                    break;
                case 4:
                    System.out.println("\n" + features);
                    break;
                case 5:
                    System.out.println("\nExiting Doubly Linked List Information.");
                    break;
                default:
                    System.out.println("\nInvalid choice. Please try again.");
            }

        } while (choice != 5);
    }

}
