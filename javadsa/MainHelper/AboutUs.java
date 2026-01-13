package javadsa.MainHelper;

import java.util.Scanner;

public class AboutUs {
    public void displayAboutUs() {
        MainHelper.SectionHeader("About Us");

        System.out.println("Project Name: Java DSA Learning Kit");
        System.out.println("Developed By: [Your Team Name / Developer Name]");
        System.out.println("Version: 1.0.0");
        System.out.println();

        System.out.println("Mission:");
        System.out.println("To provide a simple, interactive, and terminal-based platform for students and developers");
        System.out.println("to practice and understand the core concepts of Data Structures and Algorithms.");
        System.out.println();

        System.out.println("Links & Resources:");
        System.out.println("- GitHub Repository: [Link to Repo]");
        System.out.println("- Documentation: [Link to Docs]");
        System.out.println("- Contact: [Contact Email/Info]");

        System.out.println();
        MainHelper.SectionExit("About Us Section");

        System.out.println("Press Enter to continue...");
        try {
            Scanner sc = new Scanner(System.in);
            sc.nextLine();
        } catch (Exception e) {
        }
    }
}
