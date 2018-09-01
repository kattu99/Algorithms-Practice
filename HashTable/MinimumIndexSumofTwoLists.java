/* 

Suppose Andy and Doris want to choose a restaurant for dinner, and they both have a list of favorite restaurants represented by strings.

You need to help them find out their common interest with the least list index sum. If there is a choice tie between answers, output all of them with no order requirement. You could assume there always exists an answer.

Example 1:
Input:
["Shogun", "Tapioca Express", "Burger King", "KFC"]
["Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"]
Output: ["Shogun"]
Explanation: The only restaurant they both like is "Shogun".
Example 2:
Input:
["Shogun", "Tapioca Express", "Burger King", "KFC"]
["KFC", "Shogun", "Burger King"]
Output: ["Shogun"]
Explanation: The restaurant they both like and have the least index sum is "Shogun" with index sum 1 (0+1).
Note:
The length of both lists will be in the range of [1, 1000].
The length of strings in both lists will be in the range of [1, 30].
The index is starting from 0 to the list length minus 1.
No duplicates in both list 

*/ 






class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String,Integer> firstTraceMap = new HashMap<String, Integer>(); 
        HashMap<String, Integer> sumHashMap = new HashMap<>();
        for (int i = 0; i<list1.length; i++) {
            firstTraceMap.put(list1[i],i);
        }
        
        
        int minSum = 3000; 
        int IndexSum = 0; 
        for (int j = 0; j<list2.length; j++) {
            if (firstTraceMap.containsKey(list2[j])) {
                IndexSum = firstTraceMap.get(list2[j]) + j;
                sumHashMap.put(list2[j],IndexSum);
                if (IndexSum < minSum) {
                    minSum = IndexSum;
                } 
            }
        }
        
        ArrayList<String> list = new ArrayList<String>(); 
        int numLeastIndex = 0;
        for(String key : sumHashMap.keySet()) {
            if (sumHashMap.get(key) == minSum) {
                list.add(key);
                numLeastIndex++;
            }
        }
            
    String[] answer = new String[numLeastIndex];
        
       int k = 0;
        for(String key : list) {
            answer[k] = key;
            k++;
        }
        
        return answer;
        
    }
}