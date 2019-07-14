class Solution {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        HashMap<Integer,Integer> hashMap = new HashMap<Integer, Integer>();
        int count = 0; 
        for (int i=0; i<A.length; i++) {
            for (int j=0; j<B.length; j++) {
                int sum = A[i] + B[j];
                if (hashMap.containsKey(sum)) {
                    hashMap.put(sum, hashMap.get(sum) + 1);
                }
                else {
                    hashMap.put(sum, 1);
                }
            }
        }
        for (int i=0; i<C.length; i++) {
            for (int j=0; j<D.length; j++) {
                int newSum = C[i] + D[j];
                if (hashMap.containsKey(-(newSum))) {
                    count += hashMap.get(-(newSum));
                }
            }
        }
        return count; 
    }
}