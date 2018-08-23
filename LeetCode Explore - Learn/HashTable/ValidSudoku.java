/* 
Determine if a 9x9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:

Each row must contain the digits 1-9 without repetition.
Each column must contain the digits 1-9 without repetition.
Each of the 9 3x3 sub-boxes of the grid must contain the digits 1-9 without repetition. */




class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> hashSet = new HashSet<String>(); 
        for (int i=0; i<9;++i) {
            for  (int j=0; j<9;++j) {
                char val = board[i][j];
                if (val != '.') {
                    String row = val + "in row" + j;
                    String col = val + "in col" + i;
                    String block = val + " in block " + i/3 + "-" + j/3;
                    if (hashSet.contains(row) || hashSet.contains(col) || hashSet.contains(block)) {
                        return false; 
                    }
                    else {
                        hashSet.add(row); 
                        hashSet.add(col);
                        hashSet.add(block);
                    }
                }
            }
        }
        return true;
    }
}