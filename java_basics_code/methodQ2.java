//Write a function to print the sum of all numbers from 1 to n

import java.util.*;
public class methodQ2 {
    public int sum (int n){
        int s = n*(n+1)/2;
        return s;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        methodQ2 summ=new methodQ2();
        int p=summ.sum(n);
        System.out.println("sum to all natural numbers upto n   "+ p);

    }

    
}
