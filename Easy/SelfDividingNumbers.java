class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> listOfNumbers = new LinkedList<Integer>();
        for (int i=left; i<=right;i++) {
            int digit = i; 
            while (digit>0) {
                if (digit%10 != 0 && i % (digit%10) == 0) {
                    digit /= 10;
                }
                else {
                    break;
                }
            }
            if (digit == 0) {
                listOfNumbers.add(i);
            }
        }
        return listOfNumbers;
    }
}