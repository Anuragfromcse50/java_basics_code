public class pattern4 {//inverted half pyramid
      public static void main (String[]args){
        int n=4;
        int i,j;
        /*for (i=n;i>=1;i--){
            for(j=1;j<=i;j++){
                System.out.print(" * ");

            }
            System.out.println("");
        }*/
        for (i=1;i<=n;i++){
            for(j=n;j>=i;j--){
                System.out.print(" * ");

            }
            System.out.println("");

      }
      }
}
