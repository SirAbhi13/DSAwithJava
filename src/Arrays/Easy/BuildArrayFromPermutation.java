package Arrays.Easy;

public class BuildArrayFromPermutation {
    public int[] buildArray(int[] nums) {
        int quotient = nums.length;

        for (int i =0; i<nums.length; i++){
            int remainder = nums[i];
            int divisor = nums[nums[i]] % quotient;
            nums[i] = quotient * divisor + remainder;
        }
        for (int i = 0; i<nums.length; i++){
            nums[i] = nums[i] / quotient;
        }

        return nums;
    }
}
