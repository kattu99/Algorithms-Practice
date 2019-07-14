class Solution {
    public String longestCommonPrefix(String[] strs) {
        String min = "";
        int minLength = Integer.MAX_VALUE;
        
        for (String str: strs) {
            if (str.length()<minLength) {
                minLength = str.length();
                min = str;
            }
        }
        
        String minSubstring = "";
        for (int i = 0; i<=min.length();i++) {
                String substr = min.substring(0,i);
                if (checkStr(substr, strs, i) && substr.length()>minSubstring.length()) {
                    minSubstring = substr;
                }
            }
        return minSubstring;
    }
    
    public boolean checkStr(String str, String[] strs, int finishInt) {
        
        for (String string: strs) {
            if (!string.substring(0,finishInt).equals(str)) {
                return false;
            }
        }
        return true;
    }
    
    
    
}