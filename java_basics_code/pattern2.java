public class pattern2 {//hollow rectangle
    public static void main (String[]args){
        int m=4;
        int n=5;
        int j;
        for(int i=1;i<=m;i++){
            for(j=1;j<=n;j++){
                if(i==1||i==m||j==1||j==n){
                    System.out.print("*");

                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");//due to this whole code got distrupted
               
        }
       
    }
}
