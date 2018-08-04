/*Given a string S and a character C, return an array of integers representing the shortest distance from the character C in the string.

Example 1:

Input: S = "loveleetcode", C = 'e'
Output: [3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0]
 

Note:

S string length is in [1, 10000].
C is a single character, and guaranteed to be in string S.
All letters in S and C are lowercase.*/


class Solution {
    public int[] shortestToChar(String S, char C) {
        char[] charArray = S.toCharArray();
        int[] numArray = new int[charArray.length];
        for (int i=0;i<charArray.length;i++) {
            int Dist = 0; 
            
            if (charArray[i] == C) {
                Dist = 0;
            }
            else {
                int j=i+1;
                int ForwardDist = 1;
                int BackwardDist = 1;
                while(j<charArray.length && charArray[j]!=C) {
                    ForwardDist++;
                    j++;
                }
                if (j == charArray.length) {
                    ForwardDist = -1;
                }
                int k=i-1;
                while(k>=0 && charArray[k]!=C) {
                    BackwardDist++;
                    k--;
                }
                if (k==-1) {
                    BackwardDist = -1; 
                }
                if (ForwardDist == -1) {
                    Dist = BackwardDist;
                }
                else if (BackwardDist == -1) {
                    Dist = ForwardDist;
                }
                else {
                    Dist = java.lang.Math.min(ForwardDist,BackwardDist);
                }
            }  
            numArray[i] = Dist;
        }
        return numArray;
    }
}