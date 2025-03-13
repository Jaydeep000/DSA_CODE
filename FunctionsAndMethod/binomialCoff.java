package FunctionsAndMethod;

public class binomialCoff {
    // Method to calculate factorial
    private static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    // Method to calculate binomial coefficient
    public static int binomialCoefficient(int n, int k) {
        return factorial(n) / (factorial(k) * factorial(n - k));
    }

    public static void main(String[] args) {
        int n = 5;
        int k = 2;
        System.out.println("Binomial Coefficient C(" + n + ", " + k + ") = " + binomialCoefficient(n, k));
    }
}
