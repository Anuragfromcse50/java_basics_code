// Write a program to enter the numbers till the user wants and at the end
 // it should display the count of positive, negative and zeros entered.
import java.util.*;
public class methodQ6vi {
    


    
    public void countNumbers(Scanner sc) {
        int positives = 0;
        int negatives = 0;
        int zeros = 0;
        char choice;

        do {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            // Check the type of number
            if (num > 0) {
                positives++;
            } else if (num < 0) {
                negatives++;
            } else {
                zeros++;
            }

            // Ask the user if they want to continue
            System.out.print("Do you want to enter another number? (y/n): ");
            choice = sc.next().charAt(0);
            System.out.println();

        } while (choice == 'y' || choice == 'Y');

        // Print final results
        System.out.println("Total Positive numbers: " + positives);
        System.out.println("Total Negative numbers: " + negatives);
        System.out.println("Total Zeros: " + zeros);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        methodQ6vi obj = new methodQ6vi();
        
        obj.countNumbers(sc);

        // see it again and again
    }
}


