import com.sun.org.apache.regexp.internal.recompile;

/* Longest Increasing Subsequence using Dynamic Programming to find a subsequence in which the elements 
are all incresing, lowest to highest */ 

/* The idea to use recursion is to determine as there are two possibilities, you 
1. include item in LIS if it is greater than the previous element in LIS and recur for the remaining items. 
2. exclude item in LIS and recur for remaining 
The subsequence is not necessarily contiguous or unique. 
*/

class LIS {

    public static int LIT(int[] A, int i, int n, int prev) {

        if (i == n)
            return 0; 
        
        int excl = LIS(A, i+1, n, prev);
        
        int incl = 0;
        if (A[i] > prev) {
            incl = 1 + LIS(A, i+1, n, A[i]); // using this one as the one of prev check in this path, like recursion
            //you're checking all paths and the prev lets you evaluate and add, spawn of a new tree for each creating many paths 2^something because
            // of branches, think of recursion whenever you can make choices at different points and evaluate. 
        }

        return Integer.max(incl, excl); 
    }

    // you can have overlapping subproblems and keep dividing. In bottom up approach, compute L[i] which stores length of 
    // longest subsequence of subarray arr[0..i] ending with arr[i]. To calculate L[i] consider LIS of all smaller values
    // and pick the maximum L[j] where arr[j] is less than arr[i]. 
    public static int LISDynamic(int[] A, int i) {
        int[] L = new int[A.length];

        L[0] = 1; 

        for (int i=1; i< A.length; i++) {
            // for each element in the subarray from A[0...i-1]
            for (int j=0; j<i; j++) {
                /* find the longest increasing sub-sequence that ends with A[j] where A[j] is less than
                the current element A[i] */
                if (A[j] < A[i] && L[j] > L[i]) {
                    L[i] = L[j];
                }
                L[i]++; //have to include A[i] in the LIS
            }
        }

        return Arrays.stream(L).max().getAsInt(); 
    }
}



