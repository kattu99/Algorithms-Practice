/*N dimensional Tic Tac Toe Winner Solution*/ 

class Solution {
    
    public enum Piece{ Empty, Red, Blue};

    Piece hasWon(Piece[][] board) {
        int size = board.length;
        if (board[0].length != size) {
            return Piece.Empty;
        }

        Piece first;

        //Check rows
        for (int i=0; i<size;i++) {
            first = board[i][0];
            if (first == Piece.Empty) continue;
            for (int j=1;j<size;j++) {
                if (board[i][j] != first) {
                    break;
                }
                else if (j == size - 1) {
                    return first;
                }
            }
        }


        //Check columns
        for (int i = 0; i<size;i++) {
            first = board[0][i];
            if (first == Piece.Empty) continue;
            for (int j=1;j<size;j++) {
                if (board[j][i] != first) {
                    break;
                }
                else if (j == size - 1) {
                    return first;
                }
            }
        }


        //Check diagonals
        first = board[0][0];
        if (first != Piece.Empty) {
            for (int i=1;i<size;i++) {
                if (board[i][i] != first) {
                    break;
                }
                else if (i==size-1) {
                    return first;
                }
            }
        }

        first = board[0][size-1];
        if (first != Piece.Empty) {
            for (int i=1;i<size;i++) {
                if (board[i][size - i - 1] != first) {
                    break;
                }
                else if (i==size-1) {
                    return first;
                }
            }
        }

        return Piece.Empty;
        
    }
}



    


    }

