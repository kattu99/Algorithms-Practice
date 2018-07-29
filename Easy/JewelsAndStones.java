/*You're given strings J representing the types of stones that are jewels, and S representing the stones you have.  Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.

The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive, so "a" is considered a different type of stone from "A". */

class Solution {
    public int numJewelsInStones(String J, String S) {
        char[] array = J.toCharArray();
        int counter = 0;
        for (char character:array) {
            for( int i=0; i<S.length(); i++ ) {
                if( S.charAt(i) == character ) {
                    counter++;
                } 
            }
        }
        return counter;
    }
}