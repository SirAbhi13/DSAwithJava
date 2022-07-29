class Solution {
    public int mySqrt(int x) {
        if(x==0) return 0;
        return squareRoot(x);
    }
    int squareRoot(int n)
        {
        double x = n;
        double l = 1;
        double root;
     
        int count = 0;
     
        while (true)
        {
            count++;
     
            root = 0.5 * (x + (n / x));
    
            if (Math.abs(root - x) < l)
                break;
            x = root;
        }
     
        return (int)(root);
    }
}
     
