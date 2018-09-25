class Solution {
    public boolean canJump(int[] nums) {
        int[] dp = new int[nums.length];
        for (int i=0; i< dp.length; i++) {
            dp[i] = 2; 
        }
        dp[dp.length-1] = 1;
        
        for (int i=nums.length-2;i>=0;i--) {
            int furthestJump = Math.min(i+nums[i], nums.length-1);
            for (int j = i+1; j<=furthestJump; j++) {
                if (dp[j] == 1) {
                    dp[i] = 1;
                    break;
                }
            } 
        }
        
        return dp[0] == 1;
        
    }
}