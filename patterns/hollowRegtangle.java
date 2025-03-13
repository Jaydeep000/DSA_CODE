// * * * * *  // 5 stars
// *       *  // 2 stars and 3 spaces
// *       *  // 2 stars and 3 spaces
// * * * * *  // 5 stars

//total lines (total rows) = 4
//      outer (1 to 4)
//      inner (1 to 5)
//      if (outer == 1 || outer == 4 || inner == 1 || inner == 5)


package patterns;

import java.util.Scanner;


public class hollowRegtangle {
    public static void hollow(int rows, int cols) {
        for (int i=1; i<=rows; i++){
            for (int j=1;j<=cols;j++){
                if(i==1 || i==rows || j==cols || j==1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
              
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the number of rows:");
        Scanner sc=new Scanner (System.in);
        int rows=sc.nextInt();
        System.out.println("Enter the number of columns:");
        int cols=sc.nextInt();
        hollow(rows, cols); 
        sc.close();

    }
    
}
