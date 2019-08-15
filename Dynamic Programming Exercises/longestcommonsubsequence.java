/* The longest common subsequence problem is the problem of finding the longest
subsequence that is present given two sequences in the same order i.e. find the longest sequence
which can be obtained from first sequence by deleting some items, and from the second one
by deleting some items */

/* Optimal subsequence as you can break it down into smaller and smaller subproblems. 
X, Y are of length m and n that both end in the same element. To find LCS shorten and 
remove the last element, find the LCS of shortened sequence and append removed element. 
    LCS(X[1..m], Y[1...n]) = LCS(X[1..m-1], Y[1..n-1]) + X[m] iff X[m] = Y[n]

If they don't end with same element you can choose which one to keep
LCS(X[1...m-1], Y[1...n]) or LCS(X[1...m], Y[1...n-1])
*/

class LCS {

    public static int LCSRecursive(String X, String Y, int m, int n) {
        // return if we have reached end of sequence
        if (m == 0 || n == 0)
            return 0; 
        
        // if last character of X and Y matches
        if (X.charAt(m-1) == Y.charAt(n-1)) {
            return LCSRecursive(X, Y, m-1, n-1);
        }

        // if last characters don't match 
        return Integer.max(LCSRecursive(X, Y, m, n-1), LCSRecursive(X, Y, m-1, n));
    }

    /* The LCS problem exhibits overlapping subproblems. A problem has overlapping subproblems if 
    the recursive algorithm for problem solves same subproblem again and again rather than generating
    new subproblems 
    
    The time complexity requires memoization. You can have top down where you break into subproblems, and calculate 
    and store values, as you calculate. Bottom up you calculate from the smaller subproblems up. Compute the 
    smaller values of LCS(i, j) first then build up larger values from them. 

    A good way of doing it is having tables, and lets you avoid recomputing. Calculate smaller values of 
    LCS(i, j) first.
    */ 

    public static int LCSArray(String X, String Y) {

        int m = X.length(); 
        int n = Y.length();

        /* The lookup table stores solution to already computed subproblems. T[i][j]
        has length of X[0...i-1], Y[0..j-1] */ 
        int[][] dp = new int[m+1][n+1];
        
        for (int i=1; i<=m; i++) {
            for (int j=1; j<=n; j++) {
                if (X.charAt(i-1) == Y.charAt(j-1)) {
                    T[i][j] = T[i-1][j-1] + 1; 
                }
                else {
                    T[i][j] = Integer.max(T[i-1][j], T[i][j-1]);
                }
            }
        }

        return T[m][n];
    }






}