package FunctionsAndMethod;

import java.util.Scanner;
public class funcOverloading {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example usage of overloaded methods with user input
        System.out.println("Enter two integers:");
        int int1 = scanner.nextInt();
        int int2 = scanner.nextInt();
        System.out.println("Sum of integers: " + add(int1, int2));

        System.out.println("Enter two doubles:");
        double double1 = scanner.nextDouble();
        double double2 = scanner.nextDouble();
        System.out.println("Sum of doubles: " + add(double1, double2));

        System.out.println("Enter two strings:");
        scanner.nextLine(); // Consume newline
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        System.out.println("Concatenated strings: " + add(str1, str2));

        System.out.println("Enter three integers:");
        int int3 = scanner.nextInt();
        System.out.println("Sum of three integers: " + add(int1, int2, int3));

        System.out.println("Enter three doubles:");
        double double3 = scanner.nextDouble();
        System.out.println("Sum of three doubles: " + add(double1, double2, double3));

        scanner.close();
    }

    // Example of method overloading with different parameters
    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static String add(String a, String b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static double add(double a, double b, double c) {
        return a + b + c;
    }
}