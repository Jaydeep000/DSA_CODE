package rendom;
import java.util.Scanner;

public class reverse {
    public static int reverseNumber(int x) {
        String str = Integer.toString(x);
        boolean isNegative = str.charAt(0) == '-';

        StringBuilder sb = new StringBuilder(isNegative ? str.substring(1) : str);
        try {
            return isNegative ? (-1 * Integer.parseInt(sb.reverse().toString()))
                    : Integer.parseInt(sb.reverse().toString());
        } catch (Exception e) {
            return 0;
        }
        
    }

    public static void main(String[] args) {
        System.out.println("Enter the num:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("The reverse of the number is: " + reverseNumber(n));
        sc.close();

    }
}
