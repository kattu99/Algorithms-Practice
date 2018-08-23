/* 
Given two strings s and t, determine if they are isomorphic.

Two strings are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. 
No two characters may map to the same character but a character may map to itself.

Note:
You may assume both s and t have the same length. */

class Solution {
    public boolean isIsomorphic(String s, String t) {
        int count = 0;
        HashMap<Character,Character> hashMap = new HashMap<>();
        HashMap<Character,Character> reverseHashMap = new HashMap<>();
        for (int i=0;i<s.length();i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if (hashMap.containsKey(sChar)) {
                if (hashMap.get(sChar) != tChar) {
                    return false;
                }
            }
            else if (reverseHashMap.containsKey(tChar)) {
                if (reverseHashMap.get(tChar) != sChar) {
                    return false;
                }
            }
            else {
                hashMap.put(sChar,tChar);
                reverseHashMap.put(tChar,sChar);
            }
        }
        return true; 
    }
}