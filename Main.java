/* "Your name"
 * "Class and period"
 * "Date"
 */

import java.util.Scanner;
import java.util.ArrayList;

class Main {
    private static final Scanner scanner = new Scanner(System.in);      // Creates a scanner to read inputs
    private static Library library = new Library();  // Creates a library database
    public static void main(String[] args) {
        boolean run = true;
        while (run) {
            System.out.println("\nWelcome to my Application!\n");
            System.out.println("1. print all titles");
            System.out.println("2. Quit");
            System.out.print("Please select an option: ");

            String option = scanner.nextLine();     // Takes input from user
            switch(option) {                        // Switch statement for options
                case "1":
                    library.printAllTitles();
                    break;
                case "2":
                    System.out.println("Application is closing now. Bye!");
                    run = false;
                    break;
                default:
                    System.out.println("Option is invalid. Try again");
            }
        }
    }
}