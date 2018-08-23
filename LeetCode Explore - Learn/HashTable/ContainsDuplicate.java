/* 
Given an array of integers, find if the array contains any duplicates.

Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct. */


class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> hashSet = new HashSet<>(); 
        for (int num: nums) {
            if (hashSet.contains(num)) {
                return true; 
            }
            else {
                hashSet.add(num);
            }   
        }
        return false;
    }
}