//Write a function that calculates the Greatest Common Divisor of 2 numbers

import java.util.*;
public class methodQ8vi {
    



    // Function to calculate GCD using the Euclidean algorithm
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        // Call the function and store the result
        int gcd = findGCD(num1, num2);

        System.out.println("The Greatest Common Divisor (GCD) is: " + gcd);

        // sse and try again 
    }
}

