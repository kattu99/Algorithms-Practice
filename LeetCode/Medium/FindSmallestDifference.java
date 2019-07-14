/*Given two numbers compute the pair of values with the smallest difference. Return the difference. */

public class Solution {

    public int findSmallestDifference(int[] array1, int[] array2) {
        Arrays.sort(array1);
        Arrays.sort(array2);
        int difference = Integer.MAX_VALUE;
        
        while (a<array1.length && b < array2.length) {
            difference = Math.abs(array1[a]-array2[b]);
            if (array1[a]<array2[b]) {
            a++;
            }
            else {
                b++;
            }
        }

        return difference;
        
    }



}