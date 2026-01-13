package javadsa.MainHelper;

import java.util.Scanner;

public class Help {
    public void displayHelp() {
        MainHelper.SectionHeader("Help & Information");

        System.out.println("About This Application:");
        System.out.println(
                "This application is a comprehensive Data Structures and Algorithms (DSA) learning tool implemented in Java.");
        System.out.println("It provides interactive menus to learn, visualize, and execute various algorithms.");
        System.out.println();

        System.out.println("Key Features:");
        System.out.println("1. Searching Algorithms: Binary Search, Linear Search.");
        System.out.println("2. Sorting Algorithms: Bubble, Merge, Quick, Selection Sort.");
        System.out.println("3. Data Structures: Stack, Queue, Circular Queue, Linked Lists.");
        System.out.println("4. Helper Information: Definition, Time/Space Complexity for each topic.");
        System.out.println();

        System.out.println("How to Use:");
        System.out.println("- Navigate through the numbered menus by entering the corresponding index.");
        System.out.println("- Follow on-screen prompts to input data sizes and elements.");
        System.out.println("- Use the 'Show Code Snippet' option to view the implementation details.");
        System.out.println("- Select 'Stop Application Program' from any menu to exit safely.");

        System.out.println();
        MainHelper.SectionExit("Help Section");

        System.out.println("Press Enter to continue...");
        try {
            Scanner sc = new Scanner(System.in);
            sc.nextLine();
        } catch (Exception e) {
        }
    }
}
