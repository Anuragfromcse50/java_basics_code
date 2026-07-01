public class pattern10{//Butterfly pattern
    public static void main(String[]args){
        int i ,j,k,m, a=4;
        //upperhalf
       for(i=1;i<=a;i++){
        //for half pyramid
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            //for stars
            for(k=1;k<=2*(a-i);k++){
                System.out.print(" ");
            }
            //for inverted pyramid
            
            for(m=1;m<=i;m++){
                System.out.print("*");
            }System.out.println(" ");

        }
        //lower half
        for(i=a;i>=1;i--){
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            for(k=1;k<=2*(a-i);k++){
                System.out.print(" ");
            }
            
            for(m=1;m<=i;m++){
                System.out.print("*");
            }System.out.println(" "); 
                
        

    

    
    
    } }}