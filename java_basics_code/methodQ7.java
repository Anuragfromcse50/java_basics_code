 //Two numbers are entered by the user, x and n.
  //Write a function to find the value of one number raised to the power of another i.e. \(x^{n}\)
import java.util.*;
public class methodQ7 {
    public void value(Scanner sc){
        int x = sc.nextInt();
         int n = sc.nextInt();
  
 // Math.pow(x, n) calculates x^n. 
        double val =  Math.pow(x, n); //special function
         System.out.println("the value is    "+val);
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        methodQ7 p=new methodQ7();
        p.value(sc);
    }
}
