public class clear_ithZ_bit {
    public static int clearBit(int n,int i){
        int bitmask= ~(1<<i);
        return n & bitmask;
    }
    public static void main(String[] args) {
        System.out.println(clearBit(10,1));
    }
}
