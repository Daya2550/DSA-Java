package javadsa.Indexing;

import java.util.Scanner;

import javadsa.MainHelper.MainHelper;
import javadsa.MainHelper.MyExceptionHandling;
import javadsa.Sorting.BubbleSort;
import javadsa.Sorting.MergeSort;
import javadsa.Sorting.QuickSort;
import javadsa.Sorting.SelectionSort;

public class Sorting {
  public void Sort() {
    // Implementation for indexing search can be added here
    Scanner sc = new Scanner(System.in);
    int choice = 1;
    MainHelper.SectionHeader("Sorting Algorithms");
    do {
      System.out.println("Choose an option:");
      System.out.println("1. Bubble Sort");
      System.out.println("2. Merge Sort");
      System.out.println("3. Quick Sort");
      System.out.println("4. Slection Sort ");
      System.out.println("5. Exit :");
      System.out.println("6. Stop Application Program :");
      System.out.println("Some thing went Wrong !");
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
            BubbleSort obj = new BubbleSort();
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
            MergeSort obj = new MergeSort();
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
            QuickSort obj = new QuickSort();
            obj.run();
          } catch (MyExceptionHandling me) {
            System.out.println("Somthing Is Wrong : " + me.getMessage() + "\n Returning to Main Menu...");
          } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
            MainHelper.ErrorMessage();
          }

          break;
        case 4:
          try {
            SelectionSort obj = new SelectionSort();
            obj.run();
          } catch (MyExceptionHandling me) {
            System.out.println("Somthing Is Wrong : " + me.getMessage() + "\n Returning to Main Menu...");
          } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
            MainHelper.ErrorMessage();
          }

        case 5:
          MainHelper.SectionExit("Sorting Menu");
          break;

        case 6:
          MainHelper.StopApp();
          break;

        default:
          System.out.println("Invalid choice, please try again.");
      }
    } while (choice != 5);
  }
}
