class Solution {
    public void rotate(int[] nums, int k) {
        for (int i = 0; i < k; i++) {
            shiftArray(nums);
        }
    }
    
    public void shiftArray(int[] nums) {
        int lastElement = nums[nums.length-1];
        int temp1 = nums[0];
        int temp2 = 0;
        for (int i = 1; i < nums.length; i++) {
            temp2 = temp1;
            temp1 = nums[i];
            nums[i] = temp2;
        }
        nums[0] = lastElement; 
    }
}