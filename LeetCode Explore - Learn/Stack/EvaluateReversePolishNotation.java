/*Evaluate the value of an arithmetic expression in Reverse Polish Notation.

Valid operators are +, -, *, /. Each operand may be an integer or another expression.

Note:

Division between two integers should truncate toward zero.
The given RPN expression is always valid. That means the expression would always evaluate to a result and there won't be any divide by zero operation.*/



class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<Integer>();
        for (String token: tokens) {
            if (checkOperator(token)) {
                int operand_2 = stack.pop();
                int operand_1 = stack.pop();
                int result = evaluate(operand_1,operand_2,token);
                stack.push(result);
            }
            else {
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }
    
    public int evaluate(int operand_1,int operand_2, String token) {
        if (token.equals("+")) {
            return operand_1+operand_2;
        }
        else if (token.equals("-")) {
            return operand_1-operand_2;
        }
        else if (token.equals("/")) {
            return operand_1/operand_2;
        }
        else if (token.equals("*")) {
            return operand_1*operand_2;
        }
        return -1;
    }
    
    public boolean checkOperator(String token) {
        if (token.equals("+")) {
            return true;
        }
        else if (token.equals("-")) {
            return true;
        }
        else if (token.equals("/")) {
            return true;
        }
        else if (token.equals("*")) {
            return true;
        }
        return false;
    }
}