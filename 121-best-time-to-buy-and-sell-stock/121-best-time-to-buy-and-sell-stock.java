class Solution {
    public int maxProfit(int[] prices) {
        int maxPro = 0;
        int buyPrice = Integer.MAX_VALUE;
        
        for (int i =0;i<prices.length;i++){
            buyPrice = Math.min(buyPrice, prices[i]);
            maxPro = Math.max(maxPro, prices[i] - buyPrice);
        }
        return maxPro;
    }
}