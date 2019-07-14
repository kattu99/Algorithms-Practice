/* You're now a baseball game point recorder.

Given a list of strings, each string can be one of the 4 following types:

Integer (one round's score): Directly represents the number of points you get in this round.
"+" (one round's score): Represents that the points you get in this round are the sum of the last two valid round's points.
"D" (one round's score): Represents that the points you get in this round are the doubled data of the last valid round's points.
"C" (an operation, which isn't a round's score): Represents the last valid round's points you get were invalid and should be removed.
Each round's operation is permanent and could have an impact on the round before and the round after.

You need to return the sum of the points you could get in all the rounds.

Example 1:
Input: ["5","2","C","D","+"]
Output: 30
Explanation: 
Round 1: You could get 5 points. The sum is: 5.
Round 2: You could get 2 points. The sum is: 7.
Operation 1: The round 2's data was invalid. The sum is: 5.  
Round 3: You could get 10 points (the round 2's data has been removed). The sum is: 15.
Round 4: You could get 5 + 10 = 15 points. The sum is: 30. */

class Solution {
    public int calPoints(String[] ops) {
        int score = 0;
        for (int i=0;i<ops.length;i++) {
            if(ops[i].equals("C")) {
                int h = i;
                while(ops[h].equals("C") || ops[h].equals("I")) {
                    h--;
                }
                score -= Integer.parseInt(ops[h]);
                ops[h] = "I";
            }
            else if(ops[i].equals("D")) {
                int j = i-1;
                while(ops[j].equals("C") || ops[j].equals("I")) {
                    j--;
                }
                score += Integer.parseInt(ops[j])*2;
                ops[i] = Integer.toString(Integer.parseInt(ops[j])*2);
            }
            else if(ops[i].equals("+")) {
                int k = i-1;
                while(ops[k].equals("C") || ops[k].equals("I")) {
                    k--;
                }
                int l = k-1;
                while(ops[l].equals("C") || ops[l].equals("I")) {
                    l--;
                }
                int value = Integer.parseInt(ops[k])+Integer.parseInt(ops[l]);
                score += value; 
                ops[i] = Integer.toString(value);
            }
            else {
                score += Integer.parseInt(ops[i]);
            }
        }
        return score;
    }
}