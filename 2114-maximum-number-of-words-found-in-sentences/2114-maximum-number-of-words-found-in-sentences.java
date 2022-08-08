class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        
        for(String x: sentences){
            int count = 0;
            for(char i = 0;i<x.length();i++){
                
                if(x.charAt(i) == ' ')
                    count++;
            }
            max = Math.max(max,count);
        }
        return max+1;
    }
}