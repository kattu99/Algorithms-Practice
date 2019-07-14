/* Design the Key. As in the previous problems, the choice of the key is comparatively straight-forward. Unfortunately, sometimes you have to design a suitable
key when using the hash table. */

/* 
Given an array of strings, group anagrams together.

Example:

Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
Output:
[
  ["ate","eat","tea"],
  ["nat","tan"],
  ["bat"]
]
Note:

All inputs will be in lowercase.
The order of your output does not matter. */ 

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, ArrayList<String>> hashMap = new HashMap<String, ArrayList<String>>();
        for (String str: strs) {
            char[] sortedArray = str.toCharArray();
            Arrays.sort(sortedArray); 
            String sorted = String.valueOf(sortedArray);
            if (hashMap.containsKey(sorted)) {
                hashMap.get(sorted).add(str);
            }
            else {
                hashMap.put(sorted, new ArrayList<String>());
                hashMap.get(sorted).add(str);
            }
         }
        
        return new ArrayList<List<String>>(hashMap.values());
    }
    
}