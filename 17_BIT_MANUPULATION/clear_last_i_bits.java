public class clear_last_i_bits {
    // 15 = 1111, i==2 then new number =1100(12)
    public static int clearLast(int n,int i){
        int bitmask= ~((int)Math.pow(2,i)-1);
        // or , int bitmask= ((~1)<<i);
        // or, int bitmask = ~((1 << i) - 1);

        return n& bitmask;
    }

    public static void main(String[] args) {
        System.out.println(clearLast(15,2));
    }
}
