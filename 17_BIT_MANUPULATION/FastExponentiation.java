public class FastExponentiation {
    // Method to calculate fast exponentiation (a^n)
    public static int Expo(int a, int n) {
        int ans = 1;
        
        while (n > 0) { // Iterate until exponent becomes 0
            if ((n & 1) != 0) { // Check if LSB of n is 1
                ans *= a; // Multiply result by current base
            }
            a *= a; // Square the base
            n >>= 1; // Right shift exponent (n = n / 2)
        }
        
        return ans;
    }

    public static void main(String[] args) {
        System.out.println("3^5 = " + Expo(3, 5)); // Expected Output: 243
    }
}
