class Solution {
    public int missingNumber(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<Integer>();
        for (int i=0; i<nums.length; i++) {
            hashSet.add(nums[i]);
        }
        int missing = 0; 
        for (int i=0; i<nums.length+1; i++) {
            if (!hashSet.contains(i)) {
                missing = i;
                break; 
            }
        }
        return missing; 
        
        /* METHOD 2: Constant Space, Worse Efficiency
        
        Arrays.sort(nums);

        // Ensure that n is at the last index
        if (nums[nums.length-1] != nums.length) {
            return nums.length;
        }
        // Ensure that 0 is at the first index
        else if (nums[0] != 0) {
            return 0;
        }

        // If we get here, then the missing number is on the range (0, n)
        for (int i = 1; i < nums.length; i++) {
            int expectedNum = nums[i-1] + 1;
            if (nums[i] != expectedNum) {
                return expectedNum;
            }
        }

        // Array was not missing any numbers
        return -1;
        
        */
        
    }
    
}