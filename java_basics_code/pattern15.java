public class pattern15 {
    public static void main(String[]args){
        //Hollow Rhombus 
    
        
        int n = 5; // Size of the rhombus

        for (int i = 1; i <= n; i++) {
            // 1. Print leading spaces
            for (int j = n; j >= i; j--) {
                System.out.print(" ");
            }
            
            // 2. Print stars for borders and spaces inside
            for (int j = 1; j <= n; j++) {
                // Print star at the first/last row or first/last column
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            // Move to the next line
            System.out.println();
        }
    }
}
    



    
    

