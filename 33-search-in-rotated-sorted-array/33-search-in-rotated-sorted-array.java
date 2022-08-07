class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        
        // using binary search to figure out the smallest element in the array
        while(start<end){
            int mid = (end-start)/2 + start;
            if (nums[mid]>nums[end]){ 
                start = mid + 1;
            }
            else 
                end = mid;
        }
        
        int first_el = start;
        start=0;
        end = nums.length-1;
        // figuring out if the target is in the first half (before the smallest element) of the array or the second half of the array
        if(target>= nums[first_el] && target<= nums[end])
            start = first_el;
        else
            end = first_el;
        //simple binary search
        while(start<=end){
            int mid = (end-start)/2 + start;
            if(target == nums[mid]){
                return mid;
            }
            else if(target> nums[mid])
                start = mid+1;
            
            else
                end = mid -1;
        }
        return -1;
        
    }
}