public class ClearRangeOfBits {
    
    public static int clearBitsInRange(int num, int i, int j) {
        // Create a mask with bits i to j cleared
        int allOnes = ~0; // 111...111 (all bits set to 1)

        // Left part: 1s before position j+1
        int left = allOnes << (j + 1);

        // Right part: 1s after position i-1
        int right = (1 << i) - 1;

        // Combine left and right to create the mask
        int mask = left | right;

        // Clear the bits in the range by applying AND with mask
        return num & mask;
    }

    public static void main(String[] args) {
        int num = 10; 
        int i = 2;
        int j = 4;
        
        int result = clearBitsInRange(num, i, j);
        System.out.println("Original number: " + num);
        System.out.println("Modified number: " + result);
    }
}




///need to revise always.