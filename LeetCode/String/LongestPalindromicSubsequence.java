public class LongestPalindromicSubsequence {

    public static int max(int x, int y) {
        return (x>y) ? x : y;
    }

    public static int lps(char seq[], int i, int j) {
        //one character left and it matches
        if (i == j) {
            return 1;
        }
        
        //two characters are the same and they match
        if (seq[i] == seq[j] && i+1 == j) {
            return 2;
        }
    
        //characters match
        if (seq[i] == seq[j]) {
            return lps(seq,i+1,j-1) + 2; 
        }

        return Math.max(lps(seq,i, j-1), lps(seq,i+1,j));
    }

    public static int lps(String seq) {
        int n = seq.length();
        int i, j, cl;

        int L[][] = new int[n][n];

        for (i=0; i<n;i++){
            L[i][i] = 1;

        for (cl=2;cl<=n;cl++) {

            for (i=0; i<n-cl+1;i++) {
                    j = i+cl-1;
                    if (seq.charAt(i) == seq.charAt(j) && cl == 2) {
                        L[i][j] = 2;
                    }
                    else if (seq.charAt(i) == seq.charAt(j)) {
                        L[i][j] = L[i+1][j-1] + 2; 
                    }
                    else {
                        L[i][j] = max(L[i][j-1], L[i+1][j]);
                    }
                }
            }
        }

        return L[0][n-1];
    }
}