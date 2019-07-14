class Solution {
        public int rob(int[] num) {
            if (num.length == 0) {
                return 0; 
            }
            int[][] dp = new int[num.length][2];
            dp[0][0] = 0;
            dp[0][1] = num[0];
            for (int i=1; i<num.length; i++) {
                dp[i][0] = Math.max(dp[i-1][0], dp[i-1][1]);
                dp[i][1] = dp[i-1][0] + num[i];    
            }
            return Math.max(dp[num.length-1][0], dp[num.length-1][1]);
         }
}