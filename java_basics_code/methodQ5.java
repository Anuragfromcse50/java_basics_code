//write a function that takes ages as input and return whether it is eligible for vote or not.


import java.util.*;
public class methodQ5 {
    public void checkeligibility(Scanner sc){
        int age=sc.nextInt();
        if(age>=18){
            System.out.println(" eligible for vote ");
        }else{
             System.out.println(" not eligible for vote ");
        }

    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        methodQ5 obj=new methodQ5();
        obj.checkeligibility(sc);
    }
    
}
