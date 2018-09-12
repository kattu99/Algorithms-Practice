class Solution {
    
    private static final String[] KEYS = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

    public List<String> letterCombinations(String digits) {
        List<String> res = new LinkedList<String>();
        if(digits.length() == 0) return res;
        letterCombinations("",digits,0,res);
        return res; 
    }
    
    public void letterCombinations(String prefix, String digits, int offset, List<String> res) {
        
        if (offset>=digits.length()) {
            res.add(prefix);
            return; 
        }
        
        String str = KEYS[(digits.charAt(offset) - '0')]; 
        for (int i=0;i<str.length();i++) {
            letterCombinations(prefix + str.charAt(i),digits,offset+1,res);
        }
    }
}