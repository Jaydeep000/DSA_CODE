package array;
public class buyAndSellStock {
    public static void main(String[] args) {
        int[] arr={10,5,7,15,2,19,7,20};
        System.out.println("MAximum Prfit is :"+ maxProfit(arr));
    }

    public static int maxProfit(int [] price){
        int profit=0;
        int total=0;
        int buy_price =price[0];
             for (int i=1;i<price.length;i++){
            if( buy_price< price[i]) {
                int curr= price[i] -buy_price;
                total+= curr;
                profit=Math.max(profit, curr);
            }
            else buy_price= price[i];
        }
        System.out.println("Total Profit=" + total);
        return profit;
    }
}
