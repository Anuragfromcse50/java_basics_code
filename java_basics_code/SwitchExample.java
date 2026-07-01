import java.util.*;
public class SwitchExample {
    public static void main(String[]args){
         Scanner scanner  = new Scanner(System.in);
         System.out.println("Enter a button:a or b or c  ");
         String button = scanner.next();
         switch (button) {
             case "a":
                 System.out.println("Hello");
                 break;
             case "b":
                 System.out.println("HII");
                 break;
             case "c":
                 System.out.println("Bye");
                 break;
             default:
                 System.out.println("Invalid button");
         }
    }
    
}
