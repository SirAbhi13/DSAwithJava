class Solution:
    def hammingWeight(self, n: int) -> int:
        
        count  = 0
        
        while n>0:
            
            count +=1
            # print(n, 'before')    
            n = n & (n-1)
            # print(n, 'after')
    
    
        return count