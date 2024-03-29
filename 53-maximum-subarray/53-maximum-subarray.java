class Solution {
    public int maxSubArray(int[] nums) {
        int cursum = nums[0];
        int maxsum = nums[0];
        
        if(nums.length==1){
            return nums[0];
        }
        for(int i =1;i<nums.length;i++){
            
            if(cursum < 0){
                cursum = nums[i];
            }   
            else
                cursum += nums[i]; 
            maxsum = Math.max(maxsum,cursum);   
        }
        
        return maxsum;
    }
}