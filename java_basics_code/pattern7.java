public class pattern7 {//inverted pyramid with numbers
    public static void main(String[]args){
        int n=5,i,j;
      /*  for (i=1;i<=n;i++){//starts from 5 4 3 2 1
            for(j=5;j>=i;j--){
                System.out.print(j+" ");
            }System.out.println(" ");
        }*/
    for (i=n;i>=1;i--){//starts from 1 2 3 4 5
            for(j=1;j<=i;j++){
                System.out.print(j+" ");
            }System.out.println(" ");
        }
    }
}
