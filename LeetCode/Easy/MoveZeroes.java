class Solution {
    public void moveZeroes(int[] nums) {
        int j = 0; 
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==0) {
                j = i;
                while (j<nums.length && nums[j] == 0) {
                    j++;
                }
                if (j < nums.length) {
                    nums[i] = nums[j];
                    nums[j] = 0; 
                }
            }
        }
    }
}