package javadsa.Indexing;

import java.util.Scanner;

import javadsa.Searching.LinearSearch;
import javadsa.MainHelper.MainHelper;
import javadsa.MainHelper.MyExceptionHandling;
import javadsa.Searching.BinarySearch;

public class serching {
  public void search() {
    // Implementation for indexing search can be added here
    Scanner sc = new Scanner(System.in);
    int choice = 1;
    MainHelper.SectionHeader("Search Algorithms");
    do {
      System.out.println("Choose an option:");
      System.out.println("1. binary Search");
      System.out.println("2. Linear Search");
      System.out.println("3. Exit :");
      System.out.println("4. Stop Application Program :");

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
            BinarySearch obj = new BinarySearch();
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
            LinearSearch obj1 = new LinearSearch();
            obj1.run();
          } catch (MyExceptionHandling me) {
            System.out.println("Somthing Is Wrong : " + me.getMessage() + "\n Returning to Main Menu...");
          } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
            MainHelper.ErrorMessage();

          }
          break;

        case 3:
          MainHelper.SectionExit("Search Menu");
          break;

        case 4:
          MainHelper.StopApp();
          break;

        default:
          System.out.println("Invalid choice, please try again.");
      }
    } while (choice != 3);
  }
}
