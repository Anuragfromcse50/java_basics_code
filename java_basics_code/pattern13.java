public class pattern13 {//Palindromic pattern
    public static void main(String[]args){
        int n=5;
        
        //first half
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
          
            }
            
            for( int p=i;p>=1;p--){
                
                System.out.print(p);
                
                }
                //second half
                for(int j=2;j<=i;j++){
                    System.out.print(j);
                }

            System.out.println(" ");
        }
    }
    
}
