class Solution {
    public int[] plusOne(int[] digits) {
        int value = digits[digits.length - 1] + 1;
        boolean hasCarry = false; 
        if (value%10 == 0) {
            digits[digits.length - 1] = 0; 
            hasCarry = true;
        }
        else {
            digits[digits.length - 1] = value; 
        }
        int index = digits.length - 2; 
        while (hasCarry == true && index>=0) {
            value = digits[index] + 1;
            if (value%10 == 0) {
                digits[index] = 0; 
                hasCarry = true;
            }
            else {
                digits[index] = value; 
                hasCarry = false; 
            }
            index--;
        }
        if (hasCarry == true) {
            int[] newdigits = new int[digits.length+1];
            newdigits[0] = 1;
            for (int i=0;i<digits.length;i++) {
                newdigits[i+1] = digits[i];
            }
            return newdigits;
        }
        return digits; 
    }
}