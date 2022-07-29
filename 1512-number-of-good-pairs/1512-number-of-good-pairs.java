class Solution {
    public int numIdenticalPairs(int[] nums) {
        int j=0;
        int count = 0;
        int[] hmm = new int[101];
            for(j=0;j<nums.length; j++){
                count += hmm[nums[j]];
                hmm[nums[j]] +=1;
                
            }

        return count;
    }
}