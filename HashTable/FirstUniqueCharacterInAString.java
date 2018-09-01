/*
Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

Examples:

s = "leetcode"
return 0.

s = "loveleetcode",
return 2.
Note: You may assume the string contain only lowercase letters.*/


class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> hashMap = new HashMap<>(); 
        for (int i=0;i<s.length();i++) {
            char sChar = s.charAt(i);
            if (hashMap.containsKey(sChar)) {
                int occurrence = hashMap.get(sChar);
                occurrence++;
                hashMap.put(sChar,occurrence);
            }
            else {
                hashMap.put(sChar,1);
            }
        }
        for (int i=0;i<s.length();i++) {
            char sChar = s.charAt(i);
            if (hashMap.get(sChar) == 1) {
                return i;
            }
        }
        return -1;
    }
}