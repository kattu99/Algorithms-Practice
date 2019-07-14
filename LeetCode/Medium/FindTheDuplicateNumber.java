class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<Integer>();
        for (int i=0; i<nums.length; i++) {
            if (seen.contains(nums[i])) {
                return nums[i];
            }
            seen.add(nums[i]);
        }
        return -1; 
    }
}