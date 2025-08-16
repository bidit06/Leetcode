class Solution {
    public int maxProfit(int[] prices) {
        int left = 0;
        int right = left + 1;
        int maxProfit = 0;
        int temp = 0;

        while (right < prices.length) {

            if (prices[left] < prices[right]) {
                temp = prices[right] - prices[left];
                maxProfit = Math.max(temp, maxProfit);
            } else {
                left = right;
            }
            right++;

        }
        return maxProfit;
    }
}