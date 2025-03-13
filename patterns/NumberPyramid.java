package patterns;

public class NumberPyramid {
    public static void pattern(int n) {
        for (int i = 1; i <= n; i++) {    
            for (int j = n - i; j >= 1; j--)  // Fix: Corrected loop syntax
                System.out.print(" ");
            
            for (int j = 1; j <= i; j++)  // Fix: Print numbers correctly
                System.out.print(i + " ");
            
            System.out.println();  // Fix: Move to the next line
        }
    }

    public static void main(String[] args) {
        pattern(5);  // Fix: Correct function call
    }
}
