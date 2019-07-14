/* 
Design a HashMap without using any built-in hash table libraries.

To be specific, your design should include these functions:

put(key, value) : Insert a (key, value) pair into the HashMap. If the value already exists in the HashMap, update the value.
get(key): Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key.
remove(key) : Remove the mapping for the value key if this map contains the mapping for the key.

Note:

All keys and values will be in the range of [0, 1000000].
The number of operations will be in the range of [1, 10000].
Please do not use the built-in HashMap library. 
*/

/* COMPLEXITY ANALYSIS
If there are M keys in total, you can acheive a space complexity of O(M) easily when using a hash table. Time complexity has a strong relation with the design. 
Ideally, the bucket size is small enough to be regarded as a constant. Time complexity of insertion and sort is O(1). */


class MyHashMap {
    
    private int[][] buckets;
    private int bucketSize = 1000;
    private ArrayList<Integer> keys; 
    
    /** Initialize your data structure here. */
    public MyHashMap() {
        buckets = new int[bucketSize][1001];
        keys = new ArrayList<Integer>();
    }
    
    /** value will always be non-negative. */
    public void put(int key, int value) {
        int requiredKey = key%bucketSize;
        int requiredIndex = key/bucketSize;
        buckets[requiredKey][requiredIndex] = value;
        keys.add(key);
    }
    
    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        if (keys.contains(key)) {
            int requiredKey = key%bucketSize;
            int requiredIndex = key/bucketSize;
            int value = buckets[requiredKey][requiredIndex];
            return value;
        }
        return -1;
    }
    
    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        Integer keyValue = new Integer(key);
        keys.remove(Arrays.asList(key));
        int requiredKey = key%bucketSize;
        int requiredIndex = key/bucketSize;
        buckets[requiredKey][requiredIndex] = -1;
    }
}