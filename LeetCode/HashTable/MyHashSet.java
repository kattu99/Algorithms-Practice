/*THE PRINCIPLE OF HASH TABLE */

/* As we mentioned in the introduction, Hash Table is a data structure which organizes data using hash functions in order to support quick insertion and search. In
this article we look at the principle of hash table. The key idea of a Hash Table is to use a hash function to map keys to buckets. 

1. When we insert a new key, the hash function will decide which bucket the key should be assigned and key will be stored in the corresponding bucket. 
2. When we want to search for a key, the hash table will use the same hash function to find the corresponding bucket and only search in that specific bucket. 

Keys To Design a Hash Table: 

1. Hash Function
The hash function is the most important component of a hash table which is used to map the key to a specific bucket. The range of key values and the number of 
buckets determine the hash function.  

The idea is to assign a key to the bucket as uniformly as you can. Tradeoff between the amount of buckets and the capacity of the bucket. 

2.Collision Reduction
If the hash function is a one-one mapping, we will not need to handle collisions. However, in most cases, collisions are inevitable. 
 a) How to organize the values in the same bucket
 b) What if too many values are assigned to the same bucket
 c) How to search a target value in a specific bucket

These questions are related to the capacity of the bucket and the number of keys which might be mapped into the same bucket according to the hash function. 

There are two different kinds of hash tables: hash set and hash map. 

1) The Hash Set is one of the implementations of a set data structure to store no repeated values. 
2) The hash Map is one of the implementations of a map data structure to store (key,value) pairs. */

/*
Design a HashSet without using any built-in hash table libraries.

To be specific, your design should include these functions:

add(value): Insert a value into the HashSet. 
contains(value) : Return whether the value exists in the HashSet or not.
remove(value): Remove a value in the HashSet. If the value does not exist in the HashSet, do nothing.
*/ 

class MyHashSet {
    
    
    private boolean[][] buckets;
    private int bucketSize = 1000;
    
    
    /** Initialize your data structure here. */
    public MyHashSet() {
        buckets = new boolean[bucketSize][1001];
    }
    
    public void add(int key) {
        int requiredKey = key%bucketSize;
        int requiredValue =  key/bucketSize;
        buckets[requiredKey][requiredValue] = true; 
    }
    
    public void remove(int key) {
        int requiredKey = key%bucketSize;
        int requiredValue =  key/bucketSize;
        buckets[requiredKey][requiredValue] = false;
    }
    
    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        int requiredKey = key%bucketSize;
        int requiredValue =  key/bucketSize;
        if (buckets[requiredKey][requiredValue] == false) {
            return false;
        }
        return true;
    }
}