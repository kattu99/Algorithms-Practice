/* Diff Utility allows you to see differences between two texts. It tries to determine the smallest set of
deletions and insertions to create one text from another */ 

/* Use LCS to solve the problem. Find longest sequence of characters that is present in both original sequences
in the same order. If character is absent in one but present in first must have been delete. If absent but present in second must have been inserted */

class DiffUtility {
    static List<String> result = new LinkedList<String>(); 

    public static void diff (String X, String Y, int m, int n, int[][] lookup) {
        
        if (m > 0 && n > 0 && X.charAt(m-1) == Y.charAt(n - 1)) {
            diff(X, Y, m-1, n-1, lookup);
            result.add(X.charAt(m-1));
        }
        else if (n > 0 && (m == 0 || lookup[m][n-1] >= lookup[m-1][n])) {
            diff(X, Y, m, n-1, lookup);
            result.add("+");
            result.add(Y.charAt(n-1));
        }
        else if (m > 0 && (n==0 || lookup[m][n-1] < lookup[m-1][n])) {
            diff(X, Y, m-1, n, lookup);
            result.add("-");
            result.add(X.charAt(m-1));
        }
    }

    public static void LCSLength(String X, String Y, int m, int n, int[][] lookup) {

        for (int i=0; i<=m; i++) {
            lookup[i][0] = 0;
        }

        for (int j=0; j<=n; j++) {
            lookup[0][j] = 0; 
        }

        for (int i=1; i<=m; i++) {
            for (int j=1; j<=n; j++)  {
                if (X.charAt(i-1) == Y.charAt(j-1)) {
                    lookup[i][j] = lookup[i-1][j-1] + 1; 
                }
                else {
                    lookup[i][j] = Integer.max(lookup[i-1][j], lookup[i][j-1]);
                }
            }
        }
    }
}