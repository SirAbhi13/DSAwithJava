class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        maxP = 0
        
        l = 0
        r = 1
        
        while r < len(prices):
            if prices[l] > prices [r]:
                l = r
            
            else:
                current = prices[r] - prices[l]
                
                maxP = max(maxP, current)
            
            r +=1
        
        return maxP
                
            