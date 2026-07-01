
import java.util.*;
public class ifelse {
    public static void main(String[] args) {
    Scanner age = new Scanner(System.in);
    System.out.println("Enter your age: ");
    int a = age.nextInt();
    if(a<18){
        System.out.println("You are not eligible to vote.");
    } else {
        System.out.println("You are eligible to vote.");
    }
    }
}
