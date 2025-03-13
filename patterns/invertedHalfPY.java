package patterns;

// 1 2 3 4 5 i=1 1 to 5
// 1 2 3 4   i=2 1 to 4
// 1 2 3     i=3 1 to 3
// 1 2       i=4 1 to 2
// 1         i=5 1 to 1

import java.util.Scanner;
public class invertedHalfPY {

    public static void pyramid(int rows){
        for (int i=0;i<rows;i++){
            for (int j=1;j<=rows-i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        System.out.println("Enter the number of the rows:");
        Scanner sc= new Scanner (System.in);
        int rows = sc.nextInt();
        pyramid(rows);
        sc.close();

    }
}
