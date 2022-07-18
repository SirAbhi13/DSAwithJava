package Arrays.Easy;

import java.util.ArrayList;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {
    class Solution {
        public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
            int maxval = -1;
            ArrayList<Boolean> result = new ArrayList<Boolean>(candies.length);
            for(int value :candies){
                maxval = Math.max(maxval,value);
            }
            //checking for candies[i] + extraCandies >= maxval
//      instead can do candies[i] >= maxval - extracandies

            maxval -= extraCandies;

            for (int i =0; i<candies.length; i++){
                result.add(candies[i] >= maxval);
            }

            return result;
        }
    }
}
