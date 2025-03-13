package COLLEGE;
import java.util.*;

public class MaxMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();

        int result = getMaxMultiplication(num);
        System.out.println("Maximum multiplication result: " + result);
    }

    public static int getMaxMultiplication(int num) {
        List<Integer> digits = new ArrayList<>();
        int sum = 0;

    
        while (num > 0) {
            int d = num % 10;
            digits.add(d);
            sum += d;
            num /= 10;
        }

        Collections.sort(digits, Collections.reverseOrder());

        if (sum % 3 == 0) {
            return getProduct(digits);
        }

        boolean removed = false;
        for (int i = digits.size() - 1; i >= 0; i--) {
            if (digits.get(i) % 3 == sum % 3) {
                digits.remove(i);
                removed = true;
                break;
            }
        }


        if (!removed) {
            int count = 0;
            for (int i = digits.size() - 1; i >= 0; i--) {
                if (digits.get(i) % 3 != 0) {
                    digits.remove(i);
                    count++;
                    if (count == 2) break;
                }
            }
        }

        // Compute the final product
        return getProduct(digits);
    }

    private static int getProduct(List<Integer> digits) {
        int product = 1;
        for (int d : digits) {
            product *= d;
        }
        return product;
    }
}
