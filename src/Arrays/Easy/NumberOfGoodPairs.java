package Arrays.Easy;

import java.util.*;

public class NumberOfGoodPairs {
    //Brute Force O(n2)
    class SolutionBrute {
        public int numIdenticalPairs(int[] nums) {
            int i=0,j=0;
            int count = 0;
            while(i<nums.length){
                for(j=0;j<nums.length; j++){
                    if(nums[i] == nums[j] && i<j)
                        count++;
                }
                i++;
            }
            return count;
        }
    }
    //USES ArrayList
    class SolutionBest1{
        public int numIdenticalPairs(int[] nums) {
            int j=0;
            int count = 0;
            ArrayList<Integer> hmm = new ArrayList<Integer>(Collections.nCopies(101,0));
            for(int num :nums){
                count += hmm.get(num);
                hmm.set(num,hmm.get(num)+1);

            }

            return count;
        }
        // Uses normal arrays (easier to implement)
        class Solutionbest2 {
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

    }

}
