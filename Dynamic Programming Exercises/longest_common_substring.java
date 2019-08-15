import javax.swing.LookAndFeel;

class LCS {

    public static String LCSLength(String X, String Y, int m, int n) {
        int maxlen = 0; // stores max length of LCS
        int endingIndex = m; // stores ending index of LCS in X 

        int[][] loopup = new int[m+1][n+1];

        for (int i=1; i<=m; i++) {
            for (int j=1; j<=m; j++) {

                if (X.charAt(i-1) == Y.charAt(j-1)) {
                    lookup[i][j] = lookup[i-1][j-1] + 1; 
                // 0 if it doesn't match so no need to check before and after 
                    if (lookup[i][j] > maxlen) {
                        //use this length to figure out how much to get from substring, get ending index
                        maxlen = lookup[i];
                        endingIndex = i; 
                    }
                }
            }
        }

        return X.substring(endingIndex - maxlen, endingIndex); 
    }
}