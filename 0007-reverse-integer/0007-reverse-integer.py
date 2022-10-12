class Solution:
    def reverse(self, n: int) -> int:
        rev = 0
        
        MIN = -pow(2,31)
        MAX = (-MIN) - 1
        
        
        while n:
            rem = int(math.fmod(n,10))
            # n = int(n/10)
            
            if (rev > MAX//10 or (rev == MAX//10 and rem>= MAX%10)): return 0
            if (rev < MIN//10 or (rev == MIN//10 and rem<= MIN%10)): return 0
            
            
            rev = rev *10 + rem
            n = int(n/10)
            
        return rev