package javadsa.LinkedList.HelperClasses;

import java.util.Scanner;

public class ParentLL {
    
    public void CodeSLL() {


       Scanner sc = new Scanner(System.in);
       int choice;
       do{
        System.out.println("----------------------------------------------------------");
        System.out.println("1. Node of Linked List ");
        System.out.println("2. AddFirst Linked List Code");
        System.out.println("3. AddLast Linked List Code");
        System.out.println("4. DeleteFirst Linked List Code");
        System.out.println("5. DeleteLast Linked List Code");
        System.out.println("6. Display Linked List Code");
        System.out.print("7. Exit :");
        choice = sc.nextInt();
            switch (choice) {
                case 1:

                    System.out.println("Node of Linked List Code: \n");
                    // Code snippet for Node of Linked List
                    String nodeCode ="""
                          class Node {
                              String data;
                              Node next;
                              
                              Node(String data) {
                                  this.data = data;
                                  this.next = null;
                              }
                          }
                            """;
                    System.out.println(nodeCode);
                    break;
                case 2:
                    System.out.println("AddFirst Linked List Code: \n");
                    // Code snippet for AddFirst Linked List
                    String addFirstCode ="""
                          public void AddFirst(String data) {
                             Node newNode = new Node(data);  
                              if (head == null) {  
                              head = newNode;
                              return;
                                                }
                           newNode.next = head;
                         head = newNode;
                          }
                            """;
                    System.out.println(addFirstCode);
                    break;
                case 3:
                    System.out.println("AddLast Linked List Code: \n");
                    // Code snippet for AddLast Linked List
                    String addLastCode ="""
                          public void AddLast(String data) {
                             Node newNode = new Node(data);  
                              if (head == null) {  
                              head = newNode;
                              return;
                                                }
                           Node currNode = head;
                           while (currNode.next != null) {
                               currNode = currNode.next;
                           }
                           currNode.next = newNode;
                          }
                            """;
                    System.out.println(addLastCode);
                    break;          
                case 4:
                    System.out.println("DeleteFirst Linked List Code: \n");
                    // Code snippet for DeleteFirst Linked List
                    String deleteFirstCode ="""
                          public void DeleteFirst() {
                              if (head == null) {
                                  System.out.println("List is empty");
                                  return;
                              }
                              head = head.next;
                          }
                            """;
                    System.out.println(deleteFirstCode);
                    break;      
                case 5:
                    System.out.println("DeleteLast Linked List Code: \n");
                    // Code snippet for DeleteLast Linked List
                    String deleteLastCode ="""
                          public void DeleteLast() {
                              if (head == null) {
                                  System.out.println("List is empty!");
                                  return;
                              }
                              if (head.next == null) {
                                  head = null;
                                  return;
                              }
                              Node currNode = head;
                              Node lastNode = head.next;
                              while (lastNode.next != null) {
                                  currNode = currNode.next;
                                  lastNode = lastNode.next;
                              }
                              currNode.next = null;
                          }
                            """;
                    System.out.println(deleteLastCode);
                    break;
                case 6:
                    System.out.println("Display Linked List Code: \n");
                    // Code snippet for Display Linked List
                    String displayCode ="""
                          public void Display() {
                              Node currNode = head;
                              if (head == null) {
                                  System.out.println("List is empty!");
                                  return;
                              }
                              while (currNode != null) {
                                  System.out.print(currNode.data + " -> ");
                                  currNode = currNode.next;
                              }
                              System.out.println("null");
                          }
                            """;
                    System.out.println(displayCode);
                    break;
                case 7:
                    System.out.println("Exiting Linked List Code Snippets.");
                    break;
                default :
                    System.out.println("Invalid choice, please try again.");
                    break;
                }}
                while(choice!=7);  
             }   


    public void CodeDLL() {

    Scanner sc = new Scanner(System.in);
       int choice;
       do{
        System.out.println("----------------------------------------------------------");
        System.out.println("1. Node of Linked List ");
        System.out.println("2. AddFirst Linked List Code");
        System.out.println("3. AddLast Linked List Code");
        System.out.println("4. DeleteFirst Linked List Code");
        System.out.println("5. DeleteLast Linked List Code");
        System.out.println("6. Display Linked List Code");
        System.out.print("7. Exit :");
        choice = sc.nextInt();
            switch (choice) {
                case 1:

                    System.out.println("Node of Linked List Code: \n");
                    // Code snippet for Node of Linked List
                    String nodeCode ="""
                          class Node {
                                String data;
                                Node next;
                                Node prev;
                                
                                Node(String data) {
                                    this.data = data;
                                    this.next = null;
                                    this.prev = null;
                                }
                            """;
                    System.out.println(nodeCode);
                    break;
                case 2:
                    System.out.println("AddFirst Linked List Code: \n");
                    // Code snippet for AddFirst Linked List
                    String addFirstCode ="""
                          
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
                           }
                            """;
                    System.out.println(addFirstCode);
                    break;
                case 3:
                    System.out.println("AddLast Linked List Code: \n");
                    // Code snippet for AddLast Linked List
                    String addLastCode ="""
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
                            """;
                    System.out.println(addLastCode);
                    break;          
                case 4:
                    System.out.println("DeleteFirst Linked List Code: \n");
                    // Code snippet for DeleteFirst Linked List
                    String deleteFirstCode ="""
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
                                                    """;
                    System.out.println(deleteFirstCode);
                    break;      
                case 5:
                    System.out.println("DeleteLast Linked List Code: \n");
                    // Code snippet for DeleteLast Linked List
                    String deleteLastCode ="""
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
                     """;
                    System.out.println(deleteLastCode);
                    break;
                case 6:
                    System.out.println("Display Linked List Code: \n");
                    // Code snippet for Display Linked List
                    String displayCode ="""
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
                    """;
                            System.out.println(displayCode);    
                            
                    break;
                case 7:
                    System.out.println("Exiting Linked List Code Snippets.");
                    break;
                default :
                    System.out.println("Invalid choice, please try again.");
                    break;
                }}
                while(choice!=7);  
    }
}
