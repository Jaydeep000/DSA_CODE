package FunctionsAndMethod;

import java.util.Scanner;

public class DecimalToBinary {
    public static int covert(int n) {
        int bin = 0;
        int pow = 0;
        while (n > 0) {
            int r = n % 2;
            bin = bin + (r * (int) Math.pow(10, pow));
            pow++;
            n = n / 2;
        }
        return bin;
    }

    public static void main(String[] args) {
        System.out.println("Enter the number:");
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            System.out.println("The binary number is: " + covert(n));
        }
    }
}
