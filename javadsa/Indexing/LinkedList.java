package javadsa.Indexing;

import java.util.Scanner;

import javadsa.LinkedList.DoublyLinkedList;
import javadsa.LinkedList.Singlylinkedlists;
import javadsa.MainHelper.MainHelper;
import javadsa.MainHelper.MyExceptionHandling;

public class LinkedList {
  public void LL() {
    // Implementation for indexing search can be added here
    Scanner sc = new Scanner(System.in);
    int choice = 1;
    MainHelper.SectionHeader("Linked List Implementation");
    do {
      System.out.println("Choose an option:");
      System.out.println("1. Singly Linked List");
      System.out.println("2. Doubly Linked List");
      System.out.println("3. Circular Linked List");
      System.out.println("4. Exit :");
      System.out.println("5. Stop Application Program :");
      try {
        choice = sc.nextInt();
      } catch (Exception e) {
        System.out.println("Something went wrong!");
        sc.nextLine();
        MainHelper.ErrorMessage();
      }

      switch (choice) {
        case 1:
          try {
            Singlylinkedlists obj = new Singlylinkedlists();
            obj.run();
          } catch (MyExceptionHandling me) {
            System.out.println("Somthing Is Wrong : " + me.getMessage() + "\n Returning to Main Menu...");
          } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
            MainHelper.ErrorMessage();
          }

          break;

        case 2:
          try {
            DoublyLinkedList obj = new DoublyLinkedList();
            obj.run();
          } catch (MyExceptionHandling me) {
            System.out.println("Somthing Is Wrong : " + me.getMessage() + "\n Returning to Main Menu...");
          }

          catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
            MainHelper.ErrorMessage();
          }

          break;
        case 3:
          try {
            choice = 4;
          }
          // catch(MyExceptionHandling me){
          // System.out.println("Somthing Is Wrong : " + me.getMessage() + "\n Returning
          // to Main Menu...");
          // new MainHelper().ToStart();
          // }
          catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
          }
          break;

        case 4:
          MainHelper.SectionExit("Linked List Menu");
          break;

        case 5:
          MainHelper.StopApp();
          break;

        default:
          System.out.println("Invalid choice, please try again.");
      }
    } while (choice != 4);
  }
}
