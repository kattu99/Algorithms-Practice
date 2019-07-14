/*You are given two arrays (without duplicates) nums1 and nums2 where nums1’s elements are subset of nums2. Find all the next greater numbers for nums1's elements in the corresponding places of nums2.

The Next Greater Number of a number x in nums1 is the first greater number to its right in nums2. If it does not exist, output -1 for this number.

Note:
All elements in nums1 and nums2 are unique.
The length of both nums1 and nums2 would not exceed 1000

*/

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] array = new int[nums1.length];
        for (int i =0; i<nums1.length;i++) {
             int value = nums1[i];
             int index = findIndexOfNumber(value,nums2);
             while(index<nums2.length && nums2[index] <= value) {
                 index++;
             }
             if (index != nums2.length) {
                if (nums2[index]>value) {
                    array[i] = nums2[index];
                }
                else {
                    array[i] = -1; 
                }
             }
            else {
                array[i] = -1;
            }
            
        }
        return array;
    }
    
    public int findIndexOfNumber(int num, int[] list) {
        int index = -1;

        for (int i = 0; (i < list.length) && (index == -1); i++) {
            if (list[i] == num) {
                index = i;
            }
        }
        
        return index;
    }
}

