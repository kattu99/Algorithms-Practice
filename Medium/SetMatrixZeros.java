class Solution {
    public void setZeroes(int[][] matrix) {
        //Use a boolean array
        boolean fr = false, fc = false;
        
        
        for (int row=0; row<matrix.length; row++) {
            for (int col=0; col<matrix[0].length; col++) {
                if (matrix[row][col] == 0) {
                    if (row == 0) fr = true;
                    if (col == 0) fc = true;
                    matrix[row][0] = 0;
                    matrix[0][col] = 0; 
                }
            }
        }
        
        for (int row=1; row<matrix.length; row++) {
            for (int col=1;col<matrix[0].length;col++) {
                if (matrix[row][0] == 0 || matrix[0][col] == 0) {
                    matrix[row][col] = 0;
                }
            }
        }
        
        if (fr) {
            for (int col=0; col<matrix[0].length;col++) {
                matrix[0][col] = 0;
            }
        }
        
        if (fc) {
            for (int row=0; row<matrix.length;row++) 
                matrix[row][0] = 0;
         }
    }
}