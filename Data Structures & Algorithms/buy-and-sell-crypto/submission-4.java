class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int maxp = 0;
        int r = 0;
        while(r < prices.length){
            if(prices[r] < min){
                min = prices[r];
            }
            if(prices[r] - min > maxp){
                maxp = prices[r] - min;
            }
            r++;
        }
        return maxp;
    }
}
