package Practice;

public class MaxProfitMultiple {
    public static void main(String[] args) {
        int[] arr = {10,5, 7, 15, 2, 19, 7, 20};
        System.out.println("The Max Profit is: " + maxProfit(arr));
    }

    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) {
            return 0;
        }

        int profit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                profit += prices[i] - prices[i - 1];
            }
        }

        return profit;
    }
}
