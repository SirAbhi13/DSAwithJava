package Arrays.Easy;

public class RunningSum {
    public int[] runningSum(int[] nums) {
        int cursum = 0;
        for (int i = 0; i< nums.length; i++){
            cursum += nums[i];
            nums[i] = cursum;
        }
        return nums;
    }

        public int[] runningSumNotUsingVariable(int[] nums) {
            for (int i = 1; i < nums.length; i++) {
                // Result at index `i` is sum of result at `i-1` and element at `i`.
                nums[i] += nums[i - 1];
            }
            return nums;
        }

}
