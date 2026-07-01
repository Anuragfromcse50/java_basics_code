//Write a program to print Fibonacci series of n terms where n is input by user : 0 1 1 2 3 5 8 13 24 ..... 
//In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it. 

import java.util.*;
public class methodQ9vi {
   
    // Function to print Fibonacci series up to n terms
    public static void printFibonacci(int n) {
        if (n <= 0) {
            System.out.println("Please enter a positive integer greater than 0.");
            return;
        }

        int first = 0;
        int second = 1;

        System.out.print("Fibonacci Series up to " + n + " terms: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");

            // Calculate the next term
            int next = first + second;
            
            // Update the variables for the next iteration
            first = second;
            second = next;
        }
        System.out.println(); // For a clean new line at the end
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of terms (n): ");
        int n = sc.nextInt();

        // Call the function
        printFibonacci(n);

        
    }
  }  // see and try it again


