class Solution {
    public int count = 0; 
    
    public int findTargetSumWays(int[] nums, int S) {
        sumWays(nums, S, 0, 0);
        return count; 
    }
    
    public void sumWays(int[] nums, int S, int curSum, int curIndex) {
        
        if (curIndex == nums.length - 1) {
            if (curSum + nums[curIndex] == S) {
                count++;
            }
            if (curSum - nums[curIndex] == S) {
                count++;
            }
            return;
        }
        
        sumWays(nums, S, curSum+nums[curIndex], curIndex+1);
        sumWays(nums, S, curSum-nums[curIndex], curIndex+1);
        
    }
}