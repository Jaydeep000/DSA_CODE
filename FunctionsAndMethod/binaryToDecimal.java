package FunctionsAndMethod;

import java.util.*;

// binary to decimal conversion
public class binaryToDecimal{
    public static int convert(int n){
        int sum=0;
        int power=0;
        while(n>0){
            int lastDigit = n % 10;
            sum += lastDigit * Math.pow(2, power);
            power++;
            n = n / 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the binary number: ");
            int n = sc.nextInt();
            System.out.println("The decimal number is: " + convert(n));
        }
    }
}


