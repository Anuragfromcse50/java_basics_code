//write a infinite loop using do while condition

public class loopinfinite {
    public static void main(String[]args){
        int n=5;
        int i=1;
        do{
            System.out.print(i);
        }while(i<=n);
        i--;
    }//due to wrong increment/decrement it becomes infinite loop
    
}
