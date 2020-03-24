public class _121_买卖股票的最佳时机 {
    public int maxProfit(int[] prices) {
        int maxprofit = 0;

        for (int i = 0; i < prices.length; i++){
            for (int j = i + 1; j < prices.length; j++){
                if (prices[j] < prices[i]){
                    continue;
                }else {
                    maxprofit = Math.max(maxprofit, prices[j] - prices[i]);
                }
            }
        }
        return maxprofit;
    }
}
