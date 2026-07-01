import java.util.*;
public class oddeven{
public static void main(String[] args){
Scanner num = new Scanner(System.in);
System.out.println("enter n:");
int n = num.nextInt();
if (n%2==0){
System.out.println(n +"is an even number");
}else{
System.out.println(n +"is an odd number");
}
}
}

