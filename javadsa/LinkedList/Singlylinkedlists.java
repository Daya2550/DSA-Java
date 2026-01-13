package javadsa.LinkedList;

import java.util.Scanner;

import javadsa.LinkedList.HelperClasses.BaseLL;
import javadsa.LinkedList.HelperClasses.ParentLL;
import javadsa.MainHelper.MyExceptionHandling;
import javadsa.Searching.HelperClasses.Base;


public class Singlylinkedlists {
    
Node head;
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data=data;
            next =null;
        }
    }

     public void AddFirst(String s){
        Node New =new Node(s);
        if(head==null){
            head=New;
            return ;
        }
        New.next =head;
        head=New;
    }

    public void AddLast(String s){
         Node New =new Node(s);
        if(head==null){
            head=New;
            return ;
        }
        Node cureeNode =head;
        while(cureeNode.next!=null) {
            cureeNode=cureeNode.next;
        }
        cureeNode.next=New;
    }


    public void DeleteFirst(){
        if(head==null){
            System.out.println("List are the Empty !");
        }
        Node currNode=head;
        head=currNode.next;
    }

    public  void DeleteLast(){
        if(head==null){
            System.out.println("List are the Empty !");
        }
        if(head.next==null){
            head=null;
            return;
        }
        Node currNode=head;
        Node lastNode=head.next;
        while(lastNode.next!=null) {
            currNode=currNode.next;
            lastNode=lastNode.next;
        }
        currNode.next=null;
    }

    public void Display(){
        Node cureeNode =head;
        while(cureeNode !=null) {
            System.out.print(cureeNode.data+"->");
            cureeNode=cureeNode.next;
        }
        System.out.println();
    }

    public int size(){
        if(head==null){
            return 0;
        }
        Node cureeNode =head;
        int count =0;
        while(cureeNode !=null) {
            count++;
            cureeNode=cureeNode.next;
        }
        System.out.println("\nSize of Linkedlist :"+count);
        return count;

    }



    public void run() throws MyExceptionHandling {
        Base base = new Base();
        base.heding("Singly Linked List Implementation");

        int choice;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("1.AddFirst Element");
            System.out.println("2. AddLast Element");
            System.out.println("3. DeleteFirst Element");
            System.out.println("4. DeleteLast Element");
            System.out.println("5. Display Linked List");
            System.out.println("6. Size of Linked List");
            System.out.println("7. Information about Singly Linked List Implementation");
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
                   BaseLL baseLL = new BaseLL();
                    baseLL.InfoSinglyLinkedList();
                    break;
                case 8:
                    ParentLL p = new ParentLL();
                    p.CodeSLL();

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
