//write a function that takea radius as input and return circumference
import java.util.*;
public class methodQ4 {
    public double  circum(Scanner sc){
      double  r=sc.nextInt();
        double circumference= 2*3.14*r;
        return circumference;
    }
    public static void main(String[]args){
        Scanner sc= new Scanner (System.in);
        methodQ4 c=new methodQ4();
        double  circumference = c.circum(sc);
        System.out.println("circumference of circle  "+circumference);


    }
}
