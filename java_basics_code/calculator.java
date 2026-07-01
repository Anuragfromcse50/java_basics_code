import java.util.*;
public class calculator {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first number: ");
    int num1 = sc.nextInt();
    System.out.println("Enter second number: ");
    int num2 = sc.nextInt();
    System.out.println("Enter operator (+, -, *, /): ");
    char operator = sc.next().charAt(0);
   // for character input, we use charAt(0) to get the first character of the string input
    double result = 0;
    switch (operator) {
        case '+':
            result = num1 + num2;
            break;
        case '-':
            result = num1 - num2;
            break;
        case '*':
            result = num1 * num2;
            break;
        case '/':
            result = num1 / num2;
            break;
        default:
            System.out.println("Invalid operator");
    }
    System.out.println("Result: " + result);
}
}