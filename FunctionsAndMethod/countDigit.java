package FunctionsAndMethod;
import java.util.*;

public class countDigit {
    public static int evenDivides(int n) {
        int count = 0, num = n;
        while (num > 0) {
            int rem = num % 10;
            if (rem != 0 && n % rem == 0) {
                count++;
            }
            num = num / 10;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("The number of digits that divides the number are: " + evenDivides(n));
    }
}
