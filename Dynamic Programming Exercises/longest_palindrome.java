class LongestPalindrome {

    public static int longestPalindrome(String X, int i, int j) {
        if (i > j)
            return 0; 

        if (i == j) 
            return 1; 
    
        if (X.charAt(i) == X.charAt(j)) {
            return longestPalindrome(X, i+1, j-1) + 2; 
        }

        return Integer.max(longestPalindrome(X, i, j-1), longestPalindrome(X, i+1, j));
    }

    public static int longestPalindromeSubseq(String s) {
        int[][] dp = new int[s.length()][s.length()];
        
        //expand aroudn the center
        for (int i =s.length() - 1; i>=0; i--) {
            dp[i][i] = 1; 
            for (int j = i+1; j<s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = dp[i+1][j-1] + 2; 
                }
                else {
                    dp[i][j] = Math.max(dp[i+1][j], dp[i][j-1]); 
                }
            }
        }
    }

}