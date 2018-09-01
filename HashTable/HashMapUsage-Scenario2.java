/*HASH MAP SCENARIO II - Aggregate By Key */ 

/* Another frequent scenario is to aggregate all the information by key. We can also use a hash map to achieve this goal. A simple way to solve this problem is to
count the occurence of each character first. And then go through the results to find out the first unique character. Therefore, we can maintain a hashmap whose key
is the character, which value is a counter. You can increment the value by 1. */


/*
 * Template for using hash map to find duplicates.
 * Replace ReturnType with the actual type of your return value.
 */

public class Aggregate {

ReturnType aggregateByKey_hashmap(List<Type>& keys) {
    // Replace Type and InfoType with actual type of your key and value
    Map<Type, InfoType> hashmap = new HashMap<>();
    for (Type key : keys) {
        if (hashmap.containsKey(key)) {
            hashmap.put(key, updated_information);
        }
        // Value can be any information you needed (e.g. index)
        hashmap.put(key, value);    
    }
    return needed_information;
}

}