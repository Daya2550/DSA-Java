package javadsa.MainHelper;

import java.util.Scanner;

import javadsa.Indexing.Sorting;
import javadsa.Indexing.StackAndQueue;
import javadsa.Indexing.serching;

public class MainHelper {
    public void ToStart() {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        MainHeading();

        // System.out.println("Welcome to Data Structures and Algorithms in Java");
        // System.out.println("--------------------------------------------------");
        do {
            System.out.println("Choose an option:");
            System.out.println("1. Searching Algorithms:");
            System.out.println("2. Sorting Algorithms:");
            System.out.println("3. Stack and Queue Implementation");
            System.out.println("4. Linked List Implementation");
            System.out.println("5. Information about Data Structures:");
            System.out.println("6. Help & Information");
            System.out.println("7. About Us");
            System.out.println("8. Stop Program :");

            try {
                choice = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Something went wrong!");
                sc.nextLine(); // Clear the invalid input
                ErrorMessage();
            }

            switch (choice) {
                case 1:

                    try {
                        serching ser = new serching();
                        ser.search();
                    } catch (Exception e) {
                        System.out.println("Something went wrong!");
                        ErrorMessage();
                    }
                    break;

                case 2:
                    try {
                        Sorting sort = new Sorting();
                        sort.Sort();
                    } catch (Exception e) {
                        System.out.println("Something went wrong!");
                        ErrorMessage();
                    }
                    break;

                case 3:

                    try {
                        StackAndQueue sq = new StackAndQueue();
                        sq.choice();
                    } catch (Exception e) {
                        System.out.println("Something went wrong!");
                        ErrorMessage();
                    }
                    break;

                case 4:

                    try {
                        javadsa.Indexing.LinkedList ll = new javadsa.Indexing.LinkedList();
                        ll.LL();
                    } catch (Exception e) {
                        System.out.println("Something went wrong!");
                        ErrorMessage();
                    }
                    break;

                case 5:

                    try {
                        information info1 = new information();
                        info1.TogetDifination();
                    } catch (Exception e) {
                        System.out.println("Something went wrong!");
                        ErrorMessage();
                    }
                    break;

                case 6:
                    Help h = new Help();
                    h.displayHelp();
                    break;

                case 7:
                    AboutUs au = new AboutUs();
                    au.displayAboutUs();
                    break;

                case 8:
                    StopApp();
                    break;

                default:
                    System.out.println("Invalid choice, please try again.");
                    break;
            }
        } while (choice != 8);

    }

    public void MainHeading() {
        String MainHeading = """


                               ██╗    ██╗  ███████╗  ██╗        ██████╗   ██████╗   ███╗   ███╗  ███████╗
                               ██║    ██║  ██╔════╝  ██║       ██╔════╝  ██╔═══██╗  ████╗ ████║  ██╔════╝
                               ██║ █╗ ██║  █████╗    ██║       ██║       ██║   ██║  ██╔████╔██║  █████╗
                               ██║███╗██║  ██╔══╝    ██║       ██║       ██║   ██║  ██║╚██╔╝██║  ██╔══╝
                               ╚███╔███╔╝  ███████╗  ███████╗  ╚██████╗  ╚██████╔╝  ██║ ╚═╝ ██║  ███████╗
                                ╚══╝╚══╝   ╚══════╝  ╚══════╝   ╚═════╝   ╚═════╝   ╚═╝     ╚═╝  ╚══════╝

                                                            W E L C O M E

                """;

        System.out.println(MainHeading);
        String subHeading = """
                                         ████████╗   ██████╗     ██████╗   ███████╗   █████╗
                                         ╚══██╔══╝  ██╔═══██╗    ██╔══██╗  ██╔════╝  ██╔══██╗
                                            ██║     ██║   ██║    ██║  ██║  ███████╗  ███████║
                                            ██║     ██║   ██║    ██║  ██║  ╚════██║  ██╔══██║
                                            ██║     ╚██████╔╝    ██████╔╝  ███████║  ██║  ██║
                                            ╚═╝      ╚═════╝     ╚═════╝   ╚══════╝  ╚═╝  ╚═╝

                                                                T O   D S A

                """;
        System.out.println(subHeading);

    }

    public static void ErrorMessage() {
        String errorMessage = """


                                               ███████╗ ██████╗   ██████╗    ██████╗   ██████╗
                                               ██╔════╝ ██╔══██╗  ██╔══██╗  ██╔═══██╗  ██╔══██╗
                                               █████╗   ██████╔╝  ██████╔╝  ██║   ██║  ██████╔╝
                                               ██╔══╝   ██╔══██╗  ██╔══██╗  ██║   ██║  ██╔══██╗
                                               ███████╗ ██║  ██║  ██║  ██║  ╚██████╔╝  ██║  ██║
                                               ╚══════╝ ╚═╝  ╚═╝  ╚═╝  ╚═╝   ╚═════╝   ╚═╝  ╚═╝

                                                                 E R R O R

                """;
        System.out.println(errorMessage);
    }

    public static void StopApp() {
        System.out.print("Are you sure you want to stop the application? (Y/N): ");
        Scanner sc = new Scanner(System.in);
        String response = sc.next();
        if (response.equalsIgnoreCase("Y")) {
            System.out.println("Exiting Application...");
            System.exit(0);
        }
    }

    public static void SectionHeader(String title) {
        System.out.println("\n==========================================================");
        System.out.println("             ENTERING: " + title.toUpperCase());
        System.out.println("==========================================================\n");
    }

    public static void SectionExit(String sectionName) {
        System.out.println("\n==========================================================");
        System.out.println("             EXITING: " + sectionName.toUpperCase());
        System.out.println("         Returning to previous menu...");
        System.out.println("==========================================================\n");
    }
}

class information {
    public void TogetDifination() {
        String defination = "A data structure is a technique to systematically store data so that the data can be easily and"
                +
                "effectively created, accessed, and managed. This system collects data values";
        String typesofdata = "1. Linear Data Structure: In a linear data structure, data elements are arranged in a sequential manner, "
                +
                "where each element is connected to its previous and next element. Examples include arrays, linked lists, stacks, and queues."
                +
                "\n2. Non-Linear Data Structure: In a non-linear data structure, data elements are not arranged in a sequential manner. "
                +
                "Instead, they are organized in a hierarchical or interconnected manner. Examples include trees and graphs.";

        System.out.println("Defination of Data Structure: \n" + defination);
        System.out.println();
        System.out.println("\nTypes of Data Structure: \n" + typesofdata);
        System.out.println();

    }
}
