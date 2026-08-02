class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int min = Integer.MAX_VALUE;

        for(int c : prices){
            if(c < min) min = c;
            else profit = Math.max(profit, c - min);
        }
        return profit;
    }
}
