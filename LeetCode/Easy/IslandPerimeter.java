/*You are given a map in form of a two-dimensional integer grid where 1 represents land and 0 represents water. Grid cells are connected horizontally/vertically (not diagonally). The grid is completely surrounded by water, and there is exactly one island (i.e., one or more connected land cells). The island doesn't have "lakes" (water inside that isn't connected to the water around the island). One cell is a square with side length 1. The grid is rectangular, width and height don't exceed 100. Determine the perimeter of the island.

Example:

[[0,1,0,0],
 [1,1,1,0],
 [0,1,0,0],
 [1,1,0,0]]

Answer: 16*/ 

class Solution {
    public int islandPerimeter(int[][] grid) {
        int perimeter = 0;
        for (int row = 0; row<grid.length;row++) {
            for (int col = 0; col<grid[0].length;col++) {
                //Check for a 1 above, below,left and right
                int value = grid[row][col];
                
                if (value == 1) {
                    //Above
                    if (row==0) {
                        perimeter++;
                    }
                    else if (grid[row-1][col] == 0) {
                        perimeter++;
                    }
                    //Below
                    if (row==grid.length-1) {
                        perimeter++;
                    }
                    else if (grid[row+1][col] == 0) {
                        perimeter++;
                    }
                    //Left
                    if (col==0) {
                        perimeter++;
                    } 
                    else if (grid[row][col-1] == 0) {
                        perimeter++;
                    }
                    //Right
                    if (col==grid[0].length-1) {
                        perimeter++;
                    }
                    else if (grid[row][col+1] == 0) {
                        perimeter++;
                    }
                }
            }
        }
        return perimeter;
    }
}