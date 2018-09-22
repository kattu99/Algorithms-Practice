class TrieNode {
    public char val;
    public boolean isWord; 
    public TrieNode[] children = new TrieNode[26];
    public TrieNode() {}
    TrieNode(char c){
        TrieNode node = new TrieNode();
        node.val = c;
    }
}

class Trie {
    private TrieNode root;
    
    public Trie() {
        root = new TrieNode();
        root.val = ' ';
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        TrieNode cur = root; 
        for (char c: word.toCharArray()) {
            if (cur.children[c-'a'] == null) {
                cur.children[c-'a'] = new TrieNode(c);
            }
            cur = cur.children[c-'a'];
        }
        cur.isWord = true;
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        /*
        Initialize: cur = root
             for each char c in target string S:
          if cur does not have a child c:
              search fails
          cur = cur.children[c]
     search successes */
        
        TrieNode cur = root;
        for (char c: word.toCharArray()) {
            if (cur.children[c-'a'] == null) {
                return false;
            }
            cur = cur.children[c-'a'];
        }
        return cur.isWord; 
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        TrieNode cur = root;
        for (char c: prefix.toCharArray()) {
            if (cur.children[c-'a'] == null) {
                return false;
            }
            cur = cur.children[c-'a'];
        }
        return true; 
    }
}



/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */