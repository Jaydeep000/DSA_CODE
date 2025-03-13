package Practice;
import java.util.*;
public class buyandSell {
    public static void main(String[] args) {
        int[] arr= {10,12,17,2,19,10,12};
        System.out.println("tHE ,aX Profit is:"+ maxprofit(arr));
    }

    public static int maxprofit(int[] price){
        int profit=0;
        int buy_price =price[0];
        for (int i=1;i<price.length;i++){
            if( buy_price< price[i]) {
                int curr= price[i] -buy_price;
                profit=(int)Math.max(profit, curr);
            }
            else buy_price= price[i];
        }
        return profit;
    }
}

