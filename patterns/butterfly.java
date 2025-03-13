package patterns;

public class butterfly {
    public static void butter(int h) {
        // Upper Half
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print("* ");
            for (int j = 1; j <= ((h - i) * 2); j++)
                System.out.print("  ");
            for (int j = 1; j <= i; j++)
                System.out.print("* ");
            System.out.println();
        }

        // Lower Half
        for (int i = h - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++)
                System.out.print("* ");
            for (int j = 1; j <= ((h - i) * 2); j++)
                System.out.print("  ");
            for (int j = 1; j <= i; j++)
                System.out.print("* ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int height = 4; 
        butter(height);
    }
}
