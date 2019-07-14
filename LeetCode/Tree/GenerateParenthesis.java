class Solution {
    
    
    public List<String> generateParenthesis(int n) {
        List<String> ret = new ArrayList<String>();
        generateParenthesis("",0,0,n,ret);
        return ret;
    }
    
    public void generateParenthesis(String prefix, int open,int closed,int max,List<String> ret) {
        if (prefix.length() == max*2) {
            ret.add(prefix);
            return; 
        }
        
        if (open<max) {
            generateParenthesis(prefix + "(",open+1,closed,max,ret);
        } 
        if (closed<open) {
            generateParenthesis(prefix + ")",open,closed+1,max,ret);
        } 
    }

}