package Arrays.Easy;

public class ShuffleTheArray {
    class Solution {
        public int[] shuffle(int[] nums, int n) {
            int j = 2*n-1;

            for (int i =n-1; i>-1;i--){
                nums[j] = nums[j]<<10;
                nums[j] = nums[j] | nums[i];
                j--;
            }
            j = n;
            for (int i =0; i<nums.length ;i +=2 ){
                int n1 = nums[j] & 1023;
                int n2 = nums[j]>>10;
                nums[i] = n1;
                nums[i+1] = n2;
                j++;
            }
            return nums;
        }
    }
}
