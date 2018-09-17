class Solution {
    public int maxProfit(int[] prices) {
        int smallIndex = 0;
        int buyIndex = 0;
        int profit = 0;
        int i = 0;
        while (i<prices.length) {
            while (i<prices.length-1 && prices[i]<prices[i+1]) {
                i++;
                continue;
            }
            if (i != 0) {
                profit += prices[i] - prices[smallIndex];
            }
            smallIndex = i+1;
            i++; 
        }
        return profit; 
    }
}