package Arrays.Easy;

public class RichestCustomerWealth {
    public int maximumWealth(int[][] accounts) {
        int cursum;
        int maxsum = 0;
        for (int i = 0; i<accounts.length; i++){
            cursum = 0;
            for(int j = 0; j<accounts[i].length; j++){
                cursum += accounts[i][j];

            }
            maxsum = Math.max(maxsum,cursum);
        }
        return maxsum;
    }
}
