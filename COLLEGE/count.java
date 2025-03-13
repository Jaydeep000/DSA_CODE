package COLLEGE;
import java.util.*;

public class count {
    public static void main(String[] args) {
        int x, y;
        Scanner c = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        x = c.nextInt();
        System.out.print("Enter the second number: ");
        y = c.nextInt();
        c.close();

        int result = countOnes(x, y);
        System.out.println("Total digit '1' in the range: " + result);
    };                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          
    public static int countOnes(int m, int n) {
        int sum = 0;
        for (int i = m; i <= n; i++) {
            sum += onesInNumber(i);
        }
        return sum;
    }

    private static int onesInNumber(int num) {
        int count = 0;
        while (num > 0) {
            if (num % 10 == 1) {
                count++;
            }
            num /= 10;
        }
        return count;
    }
}
//time complexity in n
/*
 * package COLLEGE;
import java.util.*;

public class CountOnesOptimized {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int start = sc.nextInt();
        System.out.print("Enter the second number: ");
        int end = sc.nextInt();
        sc.close();

        int result = countOnesInRange(start, end);
        System.out.println("Total occurrences of digit '1' in the range: " + result);
    }

    public static int countOnesInRange(int start, int end) {
        return countOnesUptoN(end) - countOnesUptoN(start - 1);
    }

    public static int countOnesUptoN(int num) {
        if (num <= 0) return 0;

        int count = 0;
        int factor = 1;  // Tracks 1s, 10s, 100s, etc.

        while (factor <= num) {
            int lower = num - (num / factor) * factor;   // Right part
            int current = (num / factor) % 10;          // Current digit
            int higher = num / (factor * 10);          // Left part

            // Counting occurrences of '1' at this place
            if (current == 0) {
                count += higher * factor;
            } else if (current == 1) {
                count += higher * factor + lower + 1;
            } else {
                count += (higher + 1) * factor;
            }

            factor *= 10;  // Move to the next place value
        }

        return count;
    }
}

 */