/* Write an algorithm to determine if a number is "happy".

A happy number is a number defined by the following process: Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. 
Those numbers for which this process ends in 1 are happy numbers. */ 


class Solution {
    public boolean isHappy(int n) {
        Set<Integer> hashSet = new HashSet<Integer>();
        int answer = n; 
        if (n == 1) {
            return true;
        }
        
        while (answer != 1) {
            int count = 0;
            int number = answer;
            LinkedList<Integer> stack = new LinkedList<Integer>();
            while (number > 0) {
                stack.add( number % 10 );
                number = number / 10;
            }
            
            int sum = 0;
            for (int i=0; i<stack.size();i++) {
                sum += Math.pow(stack.get(i),2);
            }
            System.out.print(sum);
            answer = sum;
            if (answer == 1) {
                return true;
            }
            else if (hashSet.contains(answer)) {
                return false;
            }
            hashSet.add(answer);
        }
        return false;
    }
}