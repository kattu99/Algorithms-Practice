/* Hash Map - Usage 

The Hash Map is one of the implementations of a map, which is used to store (key,value) pairs. The first scenario where you need to use a hash map is when you need
more information than only the key. Then you can build a mapping relationship between the key and the information by hash map.

If target - current_value is in the hash set or not. We are asked to return more information which means we not only care about the value, but also the index. We
need information to help with our decisions. In the case of duplicated key, return the corresponding information immediately. 
*/

public ReturnType aggregateByKey_hashmap(List<Type>& keys) {
    // Replace Type and InfoType with actual type of your key and value
    Map<Type, InfoType> hashmap = new HashMap<>();
    for (Type key : keys) {
        if (hashmap.containsKey(key)) {
            if (hashmap.get(key) satisfies the requirement) {
                return needed_information;
            }
        }
        // Value can be any information you needed (e.g. index)
        hashmap.put(key, value);    
    }
    return needed_information;
}