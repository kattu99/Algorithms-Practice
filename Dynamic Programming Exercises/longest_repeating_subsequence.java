class LRS {
    //Find longest repeated subsequence of substring X[0...n-1]

    public static int LRSLength(String X) {
        int n = X.length(); 

        int[][] T = new int[n+1][m+1];

        for (int i=1; i<=n; i++) {
            for (int j=1; j<=m;j++) {
                if (X.charAt(i-1) == Y.charAt(j-1) && i != j) {
                    T[i][j] = T[i-1][j-1] + 1;
                }
                else {
                    T[i][j] = Integer.max(T[i-1][j], T[i][j-1]);
                }
            }
        }
        
        // LRS is empty lookup table
        return T[n][n];
    }
}