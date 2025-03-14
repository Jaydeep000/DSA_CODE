public class GetIthBit {
    public static void getbit(int n, int i) {
        int bitmask = 1 << i;
        if ((n & bitmask) == 0)
            System.out.println("The digit is 0");
        else
            System.out.println("The digit is 1");
    }

    public static void main(String[] args) {
        getbit(10, 2);  // Example: Checking the 2nd bit of 10
    }
}
