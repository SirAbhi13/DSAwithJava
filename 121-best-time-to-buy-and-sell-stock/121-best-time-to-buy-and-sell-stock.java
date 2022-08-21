class Solution {
    public int maxProfit(int[] prices) {
        int buy = 0;
        int sell = 1;
        int maxPro = 0;
        //we use two pointers for checking the value of a stock
        while(sell<prices.length){
            if(prices[buy]<prices[sell]){
                int currentProfit = prices[sell] - prices[buy];
                maxPro = Math.max(maxPro, currentProfit);
            }
            else 
                buy = sell;
            
            sell +=1;
        }
        return maxPro;
    }
}