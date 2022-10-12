class Solution:
    def bitwiseComplement(self, n: int) -> int:
        if n == 0: return 1
        copy = n
        mask = 0
        
        while copy:
            mask = (mask << 1) | 1
            copy >>=1
            
        ans = ~n & mask
        
        return ans