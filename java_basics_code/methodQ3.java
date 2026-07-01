//write a function that take two numbers and return greater of them


import java.util.*;
public class methodQ3 {
    public void greaterno(Scanner sc){
       
        int a=sc.nextInt();
         int b=sc.nextInt();
         if(a>b){
            System.out.println(a  + "  is greater than "+b);
         }else{
               System.out.println(b  + "  is greater than "+a);
         }
        
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
          methodQ3 obj = new  methodQ3();
         obj.greaterno(sc);

    }
}
    

