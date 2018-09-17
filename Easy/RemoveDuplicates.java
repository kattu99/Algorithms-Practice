class Solution {
    public int removeDuplicates(int[] nums) {
        
        if (nums.length == 0) {
            return 0;
        }
        
        int indexToReplace = 1;
        int nextNum = nums[0];
        for (int i=0; i<nums.length;i++) {
            if (nums[i] == nextNum) {
                continue;
            }
            else {
                nums[indexToReplace] = nums[i];
                nextNum = nums[i];
                indexToReplace++;
            }
        }
        return indexToReplace;
    }
}