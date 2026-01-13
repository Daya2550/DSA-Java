package javadsa.Indexing;

import java.util.Scanner;

import javadsa.MainHelper.MainHelper;
import javadsa.MainHelper.MyExceptionHandling;
import javadsa.StackAndQueue.CircularQueue;
import javadsa.StackAndQueue.stack;

public class StackAndQueue {
  public void choice() {
    // Implementation for indexing search can be added here
    Scanner sc = new Scanner(System.in);
    int choice = 1;
    MainHelper.SectionHeader("Stack & Queue Implementation");
    do {
      System.out.println("Choose an option:");
      System.out.println("1. Stack Implementation");
      System.out.println("2. Queue Implementation");
      System.out.println("3. CircularQueue Implementation");
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
            stack obj = new stack();
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
            javadsa.StackAndQueue.Queue obj = new javadsa.StackAndQueue.Queue();
            obj.run();
          } catch (MyExceptionHandling me) {
            System.out.println("Somthing Is Wrong : " + me.getMessage() + "\n Returning to Main Menu...");
          } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
            MainHelper.ErrorMessage();
          }

          break;
        case 3:
          try {
            CircularQueue obj = new CircularQueue();
            obj.run();

          } catch (MyExceptionHandling me) {
            System.out.println("Somthing Is Wrong : " + me.getMessage() + "\n Returning to Main Menu...");
          } catch (Exception e) {
            System.out.println("Something went wrong!");
            MainHelper.ErrorMessage();
          }
          break;

        case 4:
          MainHelper.SectionExit("Stack & Queue Menu");
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
