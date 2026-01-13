package javadsa.StackAndQueue;

import java.util.Scanner;

import javadsa.MainHelper.MainHelper;
import javadsa.MainHelper.MyExceptionHandling;
import javadsa.Searching.HelperClasses.Base;
import javadsa.StackAndQueue.HelperClasses.BaseStackAndQueue;
import javadsa.StackAndQueue.HelperClasses.parent;

public class Queue extends parent {

    private int[] elements;
    private int front;
    private int rear;
    private int capacity;

    // Add element to queue
    public void add() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value to add");
        int value = sc.nextInt();
        if (rear == capacity - 1) {
            System.out.println("Queue is Full");
            return;
        }

        elements[++rear] = value;
    }

    // Remove element from queue
    public void sub() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");

        }

        int removedValue = elements[front];

        // Shift elements only if needed
        for (int i = front; i < rear; i++) {
            elements[i] = elements[i + 1];
        }
        rear--;
        System.out.println("Removed value: " + removedValue);
    }

    // View front element
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        System.out.println("Front element is: " + elements[front]);
        return elements[front];
    }

    // Check if queue is empty
    private boolean isEmpty() {
        return rear < front;
    }

    // Display queue elements
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }

        for (int i = front; i <= rear; i++) {
            System.out.print(elements[i] + " ");
        }
        System.out.println();
    }

    public void takeSize() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of Queue");
        size = sc.nextInt();
        capacity = size;
        elements = new int[capacity];
        front = 0;
        rear = -1;
    }

    public void incressSize() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size to incress");
        int newsize = sc.nextInt();

        int newArr[] = new int[capacity + newsize];
        for (int i = 0; i <= rear; i++) {
            newArr[i] = elements[i];
        }

        capacity = capacity + newsize;
        elements = newArr;

        System.out.println("Queue size incressed to " + capacity);
    }

    public void run() throws MyExceptionHandling {
        MainHelper.SectionHeader("Queue Implementation");

        int choice = 0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("1. Take the size of Queue");
            System.out.println("2. Add Element");
            System.out.println("3. Remove Element");
            System.out.println("4. Peek Element");
            System.out.println("5. Display Queue Elements");
            System.out.println("6. Incresing the size of Queue");
            System.out.println("7. Information about Queue  Implementation");
            System.out.println("8. Show Code Snippet");
            System.out.println("9. Exit");
            System.out.println("10. Stop Application Program");

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
                    takeSize();
                    break;
                case 2:
                    add();
                    break;
                case 3:
                    sub();
                    break;
                case 4:
                    peek();
                    break;
                case 5:
                    display();
                    break;
                case 6:
                    incressSize();
                    break;
                case 7:
                    BaseStackAndQueue bq = new BaseStackAndQueue();
                    bq.InfoQueue();
                    break;
                case 8:
                    parent p = new parent();
                    p.CodeQueue();
                    break;
                case 9:
                    MainHelper.SectionExit("Queue Menu");
                    break;
                case 10:
                    MainHelper.StopApp();
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");

            }
        } while (choice < 9);
    }
}