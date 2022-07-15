package Arrays.Medium;

import java.util.Arrays;

public class SetMatrixZeroes {
    // Better than brute force method but uses space
    public void setZeroesUsesSpace(int[][] matrix) {
        int[] Rtracker = new int[matrix.length];
        int[] Ctracker = new int[matrix[0].length];
        int row = matrix.length;
        int col = matrix[0].length;

        /*could use set instead of 1d array here too
        Set<Integer> rows = new HashSet<Integer>();
        Set<Integer> cols = new HashSet<Integer>();

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (matrix[i][j] == 0) {
                    rows.add(i);
                    cols.add(j);
                }
            }
        }*/
        for (int i = 0; i<row;i++){
            for (int j = 0; j<col; j++){
                if (matrix[i][j] == 0){
                    Rtracker[i] = Ctracker[j] = 1;
                }
            }
        }

        for (int i =0;i<row;i++){
            for(int j =0; j<col;j++){
//                if (rows.contains(i) || cols.contains(j)) { if set was used
                if (Rtracker[i] == 1 || Ctracker[j] ==1){
                    matrix[i][j] = 0;
                }
            }
        }

    }
    

    //Best Optimised Method in O(1) space complexity and (M x N) time complexity. Uses in-place storage
    public void setZeroesBestMethod(int[][] matrix) {
        int col0 = 1, rows = matrix.length, cols = matrix[0].length;

        for (int i = 0; i<rows; i++){
            if(matrix[i][0] == 0)
                col0 = 0;
            for(int j = 1; j<cols; j++)
                if(matrix[i][j] == 0)
                    matrix[i][0] = matrix[0][j] = 0;

        }
        for (int i = rows - 1; i>=0; i--){
            for(int j = cols-1; j>=1; j--)
                if( matrix [i][0] == 0 ||  matrix[0][j] == 0)
                    matrix[i][j] = 0;

            if (col0 == 0)
                matrix[i][0] = 0;

        }
    }
}
