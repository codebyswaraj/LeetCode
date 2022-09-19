class Solution {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length == 0) return 0;
        int maxProfit = 0, currMin = prices[0];
        for(int i=1; i<prices.length; i++){
            if(currMin > prices[i])
                currMin = prices[i];
            else {
                int profit = prices[i] - currMin;
                maxProfit = Math.max(maxProfit, profit);
            }
        }
        return maxProfit;
    }
}