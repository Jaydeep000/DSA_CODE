
//       * r=1 spaces = 3 stars = 1
//     * * r=2 spaces = 2 stars = 2
//   * * * r=3 spaces = 1 stars = 3
// * * * * r=4 spaces = 0 stars = 4

package patterns;
import java.util.Scanner;
public class InvertedRoteted{
public static void printInvertedRotated(int rows) {
    for (int i=1;i<=rows;i++){
        
        for (int j=1;j<=rows-i;j++){
            System.out.print("  ");
        }
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
   
public static void main(String[] args) {
        System.out.println("Enter the number of rows:");
        try (Scanner sc = new Scanner(System.in)) {
        int rows=sc.nextInt();
        printInvertedRotated(rows);
        }
    }
}

