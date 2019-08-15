/* To find the SCS you must find the length of given sequence in a bottom up manner and recursively find SCS in a top
down manner follow from bottom right to top left when reading it out.

1. If current character of X and Y are equal part of SCS so move diagonally up. 

2. If current characters of X and Y are different you go up or left depending on which has lower number 
    a) If top cell has less value than left cell, include sequence X in SCS and recur to find sequence
    b) If left has less value than top cell include current character of sequence Y in the SCS and recur to 
    find the SCS of X[0..m-1], Y[0...n-2]
    
If you reach end then other sequence is part of SCS */

class SCS {

    public static String findSCS(String X, String Y, int m, int n, int[][] T) {

        if (m == 0)
            return Y.substring(0,n);

        if (n == 0) 
            return X.substring(0,m);

            //if the characters match
        if (X.charAt(m-1) == Y.charAt(n-1)) {
            return SCS(X, Y, m-1, n-1, T) + X.charAt(m-1);
        }
        else {
            //if the last character of X and Y don't match 
            //if top cell has less value than left cell, include character of X in SCS and find remaining SCS
            if (T[m-1][n] < T[m][n-1]) {
                return SCS(X, Y, m-1, n, T) + X.charAt(m-1);
            }
            else {
                return SCS(X, Y, m, n-1, T) + Y.charAt(n-1); 
            }
        }
    }
}
