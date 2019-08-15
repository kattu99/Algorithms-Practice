// The shortest common supersequence SCS is the problem of finding the shortest common super sequence such
// that both X and Y are subsequences of Z

// SCS (X[1...m], Y[1...n]) = SCS(X[1..m-1], Y[1...n-1]) + X[m] iff X[m] = Y[n] suppose they don't 
// end in the same element. Ends with A or ends with B so add either and check
// SCS(X[1..m-1], Y[1...n]) + X[m] or SCS(X[1..m], Y[1...n-1]) + Y[n]). Find the minimum of either.

class SCS {

    public static int SCSLength(String X, String Y, int m, int n) {
        if (m == 0 || n == 0) {
            return n+m; 
        }

        if (X.charAt(m-1) == Y.charAt(n-1))
            return SCSLength(X, Y, m-1, n-1) + 1;
        else {
            return min(SCSLength(X, Y, m, n-1) + 1, SCSLength(X, Y, m-1, n) + 1); 
        }
    }

    /* The SCS problem has overlapping subproblems in which subproblem solutions are memoized rather than
     computed again and again. 
     topDown: use a map, and as you get solution plug into a table. break into subproblems recursively, 
     calculate and store values */ 
    public static int SCSLengthTable(String X, String Y) {
        int m = X.length();
        int n = Y.length();

        //stores the length of SCS of computed table X[0...i-1] and Y[0..j-1]
        int[][] T = new int[m+1][n+1];

        for (int i=0; i<=m; i++) {
            T[i][0] = i; 
        }
        
        for (int j=0; j<=n; j++) {
            T[0][j] = j; 
        }

        for (int i=1; i<=m; i++) {
            for (int j=1; j<=n; j++) {
                if (X.charAt(i-1) == Y.charAt(j-1)) {
                    T[i][j] = T[i-1][j-1] + 1;
                }
                else {
                    T[i][j] = Integer.min(T[i-1][j]+1, T[i][j-1] + 1); 
                }
            }
        }

        return T[m][n]; 
    }

}


