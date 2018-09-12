class Solution {
    public boolean[][] visited;
    
    public boolean exist(char[][] board, String word) {
        visited = new boolean[board.length][board[0].length];

        char firstLetter = word.charAt(0);
        for (int row=0; row<board.length; row++) {
            for (int col=0; col<board[0].length; col++) {
                if (firstLetter == board[row][col] && exist(board, word, row, col, 0)) {
                    return true;
                }
            }
        }
        return false; 
    }
    
    
   /*private boolean search(char[][]board, String word, int i, int j, int index){
        if(index == word.length()){
            return true;
        }
        
        if(i >= board.length || i < 0 || j >= board[i].length || j < 0 || board[i][j] != word.charAt(index) || visited[i][j]){
            return false;
        }
        
        visited[i][j] = true;
        if(search(board, word, i-1, j, index+1) || 
           search(board, word, i+1, j, index+1) ||
           search(board, word, i, j-1, index+1) || 
           search(board, word, i, j+1, index+1)){
            return true;
        }
        
        visited[i][j] = false;
        return false;
    } */
    
    
    public boolean exist(char[][] board, String word, int charRow, int charCol, int currentIndex) {
        if (currentIndex == word.length()) {
            return true; 
        }
        
        if(charRow >= board.length || charRow < 0 || charCol >= board[0].length || charCol < 0 || board[charRow][charCol] != word.charAt(currentIndex) || visited[charRow][charCol]){
            return false;
        }
        
        visited[charRow][charCol] = true; 
        if (exist(board,word,charRow,charCol+1,currentIndex+1) || 
            exist(board,word,charRow,charCol-1,currentIndex+1) || 
            exist(board,word,charRow+1,charCol,currentIndex+1) || 
            exist(board,word,charRow-1,charCol,currentIndex+1))
        {
            return true; 
        }   
        
        visited[charRow][charCol] = false; 
        return false; 
    } 
        
}