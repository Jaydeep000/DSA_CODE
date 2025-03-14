public class count_set_bits_in_a_number {
    //example =10, (1010) ,no of bit 2,so,first check lsb, then right shift the number then again check and increase the count
    public static int countSetBits(int n) {
        int count = 0;
        
        while (n > 0) {
            count += (n & 1); // Check if LSB is 1 and add to count
            n >>= 1; // Right shift the number
        }
        
        return count;
    }

    public static void main(String[] args) {
        int n = 10; // Example: 10 (1010 in binary)
        System.out.println("Number of set bits in " + n + ": " + countSetBits(n));
    }
}
