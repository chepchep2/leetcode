package problems;

public class Problem121_re {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int maxProfit = 0;
        for (int price : prices) {
            if (min > price) {
                min = price;
            }
            if (price - min > maxProfit) {
                maxProfit = price - min;
            }
        }
        return maxProfit;
    }
}