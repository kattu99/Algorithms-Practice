/*
Given an integer, write a function to determine if it is a power of three.*/


class Solution {
    public boolean isPowerOfThree(int n) {
        
        if (n==1) {
            return true;
        }
        
        if (n==0 || n%3 != 0) {
            return false;
        }
        
        return isPowerOfThree(n/3);
    }
}