public class pattern14 {// diamond pattern
    public static void main(String[]args){
        int n=4;
        //upper half
         for(int i=1;i<=n;i++){
            //first side
             for(int j=1;j<=n-i;j++){
                System.out.print(" ");
          
            }
            
            for( int p=i;p>=1;p--){
                
                System.out.print("*");
                
                }
                //second side
                for(int k=2;k<=i;k++){
                    System.out.print("*");

                    
                }System.out.println(" ");
            }
                //lower half
               for(int i=n;i>=1;i--){
            //first side
             for(int j=1;j<=n-i;j++){
                System.out.print(" ");
          
            }
                //first side
                for(int k=2;k<=i;k++){
                    System.out.print("*");

                    
                }//other side
                for(int l=3;l<=i;l++){
                    System.out.print("*");
                }
                
                System.out.println(" ");
            }
    }
    
}
// see it once more 