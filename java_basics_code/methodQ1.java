//enter 3 numbers from user and make a function print their average


import java.util.*;
public class methodQ1 {
    public int average(int a, int b, int c){
         int avg=(a+b+c)/3;
         return avg;
    }
    public static void main(String[]args){
     Scanner sc=new Scanner(System.in);
     int a=sc.nextInt();
     int b=sc.nextInt();
     int c=sc.nextInt();

     methodQ1 ave=new  methodQ1 ();
     int result=ave.average( a, b,  c);
     System.out.println("The average of these integers are   "+result);

    }
}
