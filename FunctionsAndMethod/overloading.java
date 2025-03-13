package FunctionsAndMethod;

public class overloading {
    public static void main(String[] args) {
        System.out.println("The sum of two integers is: " + add(5, 6));
        System.out.println("The sum of two doubles is: " + add(5.5, 6.5));
        System.out.println("The sum of three integers is: " + add(5, 6, 7));
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }
}
