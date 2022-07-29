class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int l =0;
        int r = letters.length;
        if(target >= letters[letters.length-1]){
            return letters[0];
        }
        while(l<=r){
            int mid = (r-l)/2 + l;
            if(letters[mid] == target){
                l = mid+1;
                
            }
            else if (target<letters[mid]){
                r = mid-1;
            }
            else{
                l = mid+1;
            }      
        }
        if(l<0){
            return letters[0];
        }
        return letters[l];
    }
}