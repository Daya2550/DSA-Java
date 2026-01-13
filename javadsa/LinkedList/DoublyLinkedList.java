package javadsa.LinkedList;

import java.util.Scanner;

import javadsa.LinkedList.HelperClasses.BaseLL;
import javadsa.LinkedList.HelperClasses.ParentLL;
import javadsa.MainHelper.MyExceptionHandling;
import javadsa.Searching.HelperClasses.Base;

public class DoublyLinkedList {
    
   Node head;
   Node tail;

    class Node {
        String data;
        Node prev;
        Node next;

        Node(String data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }



    public void AddFirst(String s) {
        Node New = new Node(s);
        if (head == null) {
            head = New;
            tail = New;
            return;
        }
        New.next = head;
        head.prev = New;
        head = New;
    }


    public void AddLast(String s) {
        Node New = new Node(s);
        if (head == null) {
            head = New;
            tail = New;
            return;
        }
        tail.next = New;
        New.prev = tail;
        tail = New;
    }


    public void DeleteFirst() {
        if (head == null) {
            System.out.println("List are the Empty !");
            return;
        }
        if (head.next == null) {
            head = null;
            tail = null;
            return;
        }
        head = head.next;
        head.prev = null;
    }


    public void DeleteLast() {
        if (head == null) {
            System.out.println("List are the Empty !");
            return;
        }
        if (head.next == null) {
            head = null;
            tail = null;
            return;
        }
        tail = tail.prev;
        tail.next = null;
    }


    public void Display() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        Node current = head;
        System.out.print("Doubly Linked List: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }


    public void DisplayReverse() {
        if (tail == null) {
            System.out.println("List is empty!");
            return;
        }
        Node current = tail;
        System.out.print("Doubly Linked List in Reverse: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.prev;
        }
        System.out.println();
    }


    public int size() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        System.out.println("Size of the Doubly Linked List: " + count);
        return count;
    }


    public void run() throws MyExceptionHandling {
        Base base = new Base();
        base.heding("Doubly Linked List Implementation");

        int choice;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("1.AddFirst Element");
            System.out.println("2. AddLast Element");
            System.out.println("3. DeleteFirst Element");
            System.out.println("4. DeleteLast Element");
            System.out.println("5. Display Linked List");
            System.out.println("6. Size of Linked List");
            System.out.println("7. Information about Doubly Linked List Implementation");
            System.out.println("8. Show Code Snippet");
            System.out.println("9. Exit");
         
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter data to add at first: ");
                    String dataFirst = sc.next();
                    AddFirst(dataFirst);
                    break;
                case 2:
                    System.out.print("Enter data to add at last: ");
                    String dataLast = sc.next();
                    AddLast(dataLast);
                    break;
                case 3:
                    DeleteFirst();
                    break;
                case 4:
                   DeleteLast();
                    break;
                case 5:
                     Display();
                    break;
                case 6:
                     size();
                    break;
                case 7:
                BaseLL.infoDoublyLinkedList();
                    break;
                case 8:
                    ParentLL parentLL = new ParentLL();
                    parentLL.CodeDLL();

                break;        
                case 9:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
                 
            }
        } while (choice < 9);
        sc.close();
    }

}
