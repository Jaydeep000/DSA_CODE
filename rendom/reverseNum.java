package rendom;
import java.util.Scanner;

public class reverseNum {
    public static int reversenumber(int n) {
        boolean isNegative = n < 0;
        if(isNegative){
            n = -n;
        }
        
        
        int rev = 0;
        while (n > 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        return isNegative ? -rev : rev;
    }

    public static void main(String[] args) {
        System.out.println("Enter the num:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("The reverse of the number is: " + reversenumber(n));
        sc.close();
    }
}
