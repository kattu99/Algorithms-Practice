class LCS {

    public static String LCS(String X, String Y, int m, int n, int[][] T) {
        if (m == 0 || n == 0) {
            return new String(); 
        }
    
        //if character matches
        if (X.charAt(m - 1) == Y.charAt(n - 1)) {
            //append the last character to LCS of substring
            return LCS(X, Y, m-1, n-1, T) + X.charAt(m-1);

        }   

        //choose optimal direction based on which lookup is greater, follow the path and take the 
        //optimal decision at every point to figure out which direction to go 
        if (T[m-1][n] < T[m][n-1]) {
            return LCS(X, Y, m-1, n, T);
        }
        else {
            return LCS(X, Y, m, n-1, T);
        }
    }

    public static void LCSLength(String X, String Y, int m, int n, int[][] T) {

        for (int i=1; i<X.length(); i++) {
            for (int j=1; j<Y.length(); j++) {
                if (X.charAt(i-1) == Y.charAt(j-1)) {
                    T[i][j] = T[i-1][j-1] + 1; 
                }
                else {
                    T[i][j] = Integer.max(T[i-1][j], T[i][j-1]);
                }
            }
        }
    }

}