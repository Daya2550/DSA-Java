
package javadsa;
import java.util.Scanner;

import javadsa.Indexing.Sorting;
import javadsa.Indexing.StackAndQueue;
import javadsa.Indexing.serching;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice ;
        System.out.println("Welcome to Data Structures and Algorithms in Java");
        System.out.println("--------------------------------------------------");
      do{
        System.out.println("Choose an option:");
        System.out.println("1. Serching Algorithms:");
         System.out.println("2. Sorting Algorithms:");
         System.out.println("3. Stack and Queue Implementation");
         System.out.println("4. Linked List Implementation");
        System.out.println("5. Information about Data Structures:");
        System.out.print("6. Exit :");
        choice = sc.nextInt();  
       
        switch (choice) {
            case 1:
               serching ser= new serching();
               ser.search();
                break;
            
            case 2:
                Sorting sort = new Sorting();
                sort.Sort();
                break;    
            
            case 3:
                StackAndQueue sq = new StackAndQueue();
                sq.choice();
                break; 
            
            case 4:
                javadsa.Indexing.LinkedList ll = new javadsa.Indexing.LinkedList();
                ll.LL();
                break;
                
            case 5:
                information info1 = new information();
                info1.TogetDifination();
                break;

            case 6:
                  System.out.println("Exiting the program.");
                break;    
                    
            default:
                System.out.println("Invalid choice, please try again.");
      }
     }
        while(choice!=4);    


    
}

}


class information {
    public void TogetDifination(){
        String defination ="A data structure is a technique to systematically store data so that the data can be easily and" + 
                           "effectively created, accessed, and managed. This system collects data values";
        String typesofdata ="1. Linear Data Structure: In a linear data structure, data elements are arranged in a sequential manner, " +
                             "where each element is connected to its previous and next element. Examples include arrays, linked lists, stacks, and queues." +
                             "\n2. Non-Linear Data Structure: In a non-linear data structure, data elements are not arranged in a sequential manner. " +
                             "Instead, they are organized in a hierarchical or interconnected manner. Examples include trees and graphs.";     

                  System.out.println("Defination of Data Structure: \n" + defination);
                  System.out.println();   
                  System.out.println("\nTypes of Data Structure: \n" + typesofdata); 
                  System.out.println();          
                            
    }
}

