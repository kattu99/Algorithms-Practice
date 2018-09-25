class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        HashSet<String> dict = new HashSet<String>(wordList);
        Queue<String> queue = new LinkedList<>();
        queue.add(beginWord);
        int level = 1; 
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int q=0; q<size; q++) {
                char[] charArray = queue.poll().toCharArray();
                for (int i=0; i<charArray.length; i++) {
                    char tmp = charArray[i];
                    for (char chr='a'; chr<'z';chr++) {
                        charArray[i] = chr;
                        String dest = new String(charArray);
                        if (dict.contains(dest)) {
                            if (dest.equals(endWord)) return level+1;
                            queue.add(dest);
                            dict.remove(dest);
                        }
                    }
                    charArray[i] = tmp;
                }
            }
            level++;
        }
        return 0; 
    }
    
    
}