/*Flipping an Image 

Given a binary matrix A, we want to flip the image horizontally, then invert it, and return the resulting image.

To flip an image horizontally means that each row of the image is reversed.  For example, flipping [1, 1, 0] horizontally results in [0, 1, 1].

To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0. For example, inverting [0, 1, 1] results in [1, 0, 0].

Example 1:

Input: [[1,1,0],[1,0,1],[0,0,0]]
Output: [[1,0,0],[0,1,0],[1,1,1]]
Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]] */

class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        int[][] grid = A;
        for (int row = 0; row<grid.length;row++) {
            int j = grid[0].length - 1;     
	        int i = 0;
            int temp = 0; 
	        while(i<j)
            {
               temp = grid[row][i];
               grid[row][i] = grid[row][j];
               grid[row][j] = temp;
               i++;
               j--;
            }
            for (int col = 0; col<grid[0].length;col++) {
                if (grid[row][col] == 0) {
                    grid[row][col] = 1;
                }
                else {
                    grid[row][col] = 0;
                }
            }
        }
        return grid;
    }
}
