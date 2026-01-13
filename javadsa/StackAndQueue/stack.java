package javadsa.StackAndQueue;

import java.util.Scanner;

import javadsa.MainHelper.MainHelper;
import javadsa.MainHelper.MyExceptionHandling;
import javadsa.Searching.HelperClasses.Base;
import javadsa.StackAndQueue.HelperClasses.BaseStackAndQueue;
import javadsa.StackAndQueue.HelperClasses.parent;

public class stack extends parent {

    public void push(int arr[], int size) {
        if (head == size - 1) {
            System.out.println("full the size");
        } else {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the value");
            int value = sc.nextInt();
            head++;
            arr[head] = value;
        }
    }

    public void pop(int arr[], int size) {
        if (head == -1) {
            System.out.println("empty the stack");
        } else {
            int value = arr[head];
            arr[head] = 0;
            head--;
            System.out.println("value popped " + value);
        }
    }

    public void peek(int arr[], int size) {
        if (head == -1) {
            System.out.println("empty the stack");
        } else {
            System.out.println("top element is " + arr[head]);
        }
    }

    public void display(int arr[], int size) {
        if (head == -1) {
            System.out.println("empty the stack");
        } else {
            for (int i = head; i >= 0; i--) {
                System.out.println(arr[i]);
            }
        }
    }

    public void incressSize() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size to incress");
        int newsize = sc.nextInt();

        int newArr[] = new int[size + newsize];
        for (int i = 0; i <= head; i++) {
            newArr[i] = arr[i];
        }

        size = size + newsize;
        arr = newArr;

        System.out.println("stack size incressed to " + size);
    }

    public void takeSize() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of stack");
        size = sc.nextInt();
        arr = new int[size];
        head = -1;
        System.out.println("stack of size " + size + " created");
    }

    public void run() throws MyExceptionHandling {
        MainHelper.SectionHeader("Stack Implementation");

        int choice = 0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("1. Take the size of stack");
            System.out.println("2. Push Element");
            System.out.println("3. pop Element");
            System.out.println("4. Peek Element");
            System.out.println("5. Display Stack Elements");
            System.out.println("6. Incresing the size of stack");
            System.out.println("7. Information about stack  Implementation");
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
                    push(arr, size);
                    break;
                case 3:
                    pop(arr, size);
                    break;
                case 4:
                    peek(arr, size);
                    break;
                case 5:
                    display(arr, size);
                    break;
                case 6:
                    incressSize();
                    break;
                case 7:
                    BaseStackAndQueue b = new BaseStackAndQueue();
                    b.InfoStack();
                    break;
                case 8:
                    StackCode();
                    break;
                case 9:
                    MainHelper.SectionExit("Stack Menu");
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
