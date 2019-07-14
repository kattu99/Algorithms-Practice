class Solution {
    public int peakIndexInMountainArray(int[] A) {
        int i=1;
        while (i<A.length-1 && A[i]<=A[i+1]) {
            i++;
        }
        return i; 
    }
}