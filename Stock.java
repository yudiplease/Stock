public class Stock {
    public static int maxProfit(int[] prices) {
        int maxprofit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                int profit = prices[j] - prices[i];
                if (profit > maxprofit)
                    maxprofit = profit;
            }
        }
        return maxprofit;
    }

    public static void main(String[] args) {
        int[] prices = new int[]{7,6,5,4,3,2,1};
        System.out.println(maxProfit(prices));
    }
}
