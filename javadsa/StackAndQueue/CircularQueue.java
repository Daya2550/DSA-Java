package javadsa.StackAndQueue;

import java.util.Scanner;

import javadsa.MainHelper.MainHelper;
import javadsa.MainHelper.MyExceptionHandling;
import javadsa.Searching.HelperClasses.Base;
import javadsa.StackAndQueue.HelperClasses.BaseStackAndQueue;
import javadsa.StackAndQueue.HelperClasses.parent;

public class CircularQueue {

    private int[] arr;
    private int front = -1;
    private int rear = -1;
    private int capacity = 0;

    // Enqueue (add element)
    public void enqueue() {
        if (capacity == 0) {
            System.out.println("Please set the size of the queue first.");
            return;
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value: ");
        int value = sc.nextInt();

        if ((front == (rear + 1) % capacity)) {
            System.out.println("Queue is full");
            return;
        }
        if (front == -1) {
            // First element being added
            front = 0;
        }
        rear = (rear + 1) % capacity;
        arr[rear] = value;
        System.out.println("Enqueued: " + value);
    }

    // Dequeue (remove element)
    public int dequeue() {
        if (front == -1) {
            System.out.println("Queue is empty!");
            return -1;
        }
        int value = arr[front];
        arr[front] = 0;

        if (front == rear) {
            // Only one element is present
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % capacity;
        }
        System.out.println("Dequeued: " + value);
        return value;
    }

    // Peek (get front element)
    public int peek() {
        if (front == -1) {
            System.out.println("Queue is empty!");
            return -1;
        }
        int value = arr[front];
        System.out.println("Front element: " + value);
        return value;
    }

    // Display elements
    public void display() {
        if (front == -1) {
            System.out.println("Queue is empty!");
            return;
        }
        System.out.print("Queue Elements: ");
        for (int i = front;; i = (i + 1) % capacity) {
            System.out.print(arr[i] + " ");
            if (i == rear)
                break;
        }
        System.out.println();
    }

    // Set the size
    public void takeSize() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Queue: ");
        capacity = sc.nextInt();
        if (capacity <= 0) {
            System.out.println("Invalid size. Capacity must be > 0.");
            capacity = 0;
            arr = null;
            return;
        }
        arr = new int[capacity];
        front = -1;
        rear = -1;
        System.out.println("Queue created with size " + capacity);
    }

    // Increase the queue size
    public void increaseSize() {
        if (capacity == 0 || arr == null) {
            System.out.println("Please set the size of the queue before increasing.");
            return;
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how much size you want to increase: ");
        int extraSize = sc.nextInt();

        if (extraSize <= 0) {
            System.out.println("Invalid size increment.");
            return;
        }

        int newCapacity = capacity + extraSize;
        int[] newArr = new int[newCapacity];

        if (front != -1) {
            int index = 0;
            for (int i = front;; i = (i + 1) % capacity) {
                newArr[index++] = arr[i];
                if (i == rear) {
                    break;
                }
            }
            front = 0;
            rear = index - 1;
        } else {
            front = -1;
            rear = -1;
        }

        arr = newArr;
        capacity = newCapacity;
        System.out.println("Queue size increased to " + capacity);
    }

    // Main run loop
    public void run() throws MyExceptionHandling {
        MainHelper.SectionHeader("Circular Queue Implementation");

        int choice = 0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("\n--------------------------");
            System.out.println("1. Set the size of CircularQueue");
            System.out.println("2. Add Element (Enqueue)");
            System.out.println("3. Remove Element (Dequeue)");
            System.out.println("4. Peek Element");
            System.out.println("5. Display CircularQueue Elements");
            System.out.println("6. Increase the size of CircularQueue");
            System.out.println("7. Information about CircularQueue Implementation");
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
                    enqueue();
                    break;
                case 3:
                    dequeue();
                    break;
                case 4:
                    peek();
                    break;
                case 5:
                    display();
                    break;
                case 6:
                    increaseSize();
                    break;
                case 7:
                    BaseStackAndQueue cc = new BaseStackAndQueue();
                    cc.InfoCircularQueue();
                    break;
                case 8:
                    parent p = new parent();
                    p.CodeCircularQueue();
                    break;
                case 9:
                    MainHelper.SectionExit("Circular Queue Menu");
                    break;
                case 10:
                    MainHelper.StopApp();
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        } while (choice != 9);
    }
}
