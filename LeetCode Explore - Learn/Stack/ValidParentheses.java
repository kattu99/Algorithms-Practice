/* Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Note that an empty string is also considered valid. */

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);        
            if (checkIfOpen(c)) {
                stack.push(c);
            } 
            else if (checkIfClosed(c)) {
                if (!stack.isEmpty()) {
                    char character = stack.pop();
                    if (character != getOpen(c)) {
                        return false;
                    }
                }
                else {
                    return false;
                }
            }
        }
        if (!stack.isEmpty()) {
                return false;
        }
        return true;
    }
    
    public boolean checkIfOpen(char c) {
        if (c == '(' || c == '{' || c == '[') {
            return true;
        }
        return false;
    }
    
    public boolean checkIfClosed(char c) {
        if (c == ')' || c == '}' || c == ']') {
            return true;
        }
        return false;
    }
    
    public char getOpen(char c) {
        if (c==')') {
            return '(';
        }
        if (c==']') {
            return '[';
        }
        return '{';
    }
}
