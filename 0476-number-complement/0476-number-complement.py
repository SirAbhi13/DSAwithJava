class Solution:
    def findComplement(self, n: int) -> int:
        if n ==0 : return 1
        l = self.decToBin(n)        
        for i in range(len(l)):
            if l[i] == 1:
                l[i] = 0
            
            elif l[i] == 0:
                l[i] = 1
        ans =0
        for i in range(len(l)-1,-1,-1):
            ans = ans + l[i]*(2**i)
        return ans
                
    
    
    def decToBin(self,num):
        ans = []
        i = 0
        while num !=0:
            rem = num%2
            num >>= 1
            ans.append(rem)
        return (ans)