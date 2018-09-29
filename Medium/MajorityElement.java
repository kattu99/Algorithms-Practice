class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        for (int i=0; i<nums.length; i++) {
            if (hashMap.containsKey(nums[i])) {
                hashMap.put(nums[i], hashMap.get(nums[i]) + 1);
            }
            else {
                hashMap.put(nums[i], 1);
            }
        }
        for (Integer key: hashMap.keySet()) {
            if (hashMap.get(key) > (nums.length/2)) {
                return key;
            }
        }
        return -1; 
    }
}