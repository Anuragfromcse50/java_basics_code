import java.util.*;//import java.util.Scanner; // Import the Scanner class
public class input {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
    //sc is the object of imported Scanner class
   // System.out.print("Enter your name: ");
   // String name = sc.next(); for single word input
    String name = sc.nextLine(); // for multiple word input
    //more scanner class methods are 
    // nextInt() for integer input
    // nextDouble() for double input
    //nextBoolean() for boolean input
    //nextFloat() for float input
    //nextLong() for long input

    


    System.out.println("Hello, " + name + "!");
}
}