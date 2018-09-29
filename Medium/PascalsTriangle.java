class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> lists = new LinkedList<List<Integer>>();
        int listSize = 0; 
        for (int i=0; i<numRows; i++) {
            listSize = i+1;
            List<Integer> list = new LinkedList<Integer>();
            lists.add(list);
            for (int j=0; j<listSize;j++) {
                if (j == 0) {
                    list.add(1);
                }
                else if (j==listSize-1) {
                    list.add(1);
                }
                else {
                    int value = lists.get(i-1).get(j) + lists.get(i-1).get(j-1);
                    list.add(value);
                }
            }
        }
        return lists; 
    }
}