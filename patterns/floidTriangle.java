//1
//2 3
//4 5 6
//7 8 9 10  
//11 12 13 14 15 // floid triangle

package patterns;

import java.util.Scanner;

public class floidTriangle {

    public static void floidTriangle(int r) {
        int n = 1;
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(n + " ");
                n++;
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        System.out.println("Enter the number of rows:");
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();
        System.out.println("The Result is :");
        floidTriangle(num);
        sc.close();
    }
}
