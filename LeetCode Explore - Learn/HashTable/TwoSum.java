/* 
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice. */


class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int i=0; i<nums.length; i++) {
            int complement = target - nums[i];
            if (hashMap.containsKey(complement)) {
                return new int[] {i,hashMap.get(complement)};
            }
            else {
                hashMap.put(nums[i],i);
            }
        }
        return new int[0];
    }
}