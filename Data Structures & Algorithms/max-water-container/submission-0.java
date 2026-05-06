class Solution {
    public int maxArea(int[] heights) {
      int max = 0;
      int cmax = 0;
      int j = heights.length - 1;
      int i = 0;
      while(i < j){
        cmax = (j - i) * (Math.min(heights[i], heights[j]));
        if(heights[i] < heights[j]) i++;
        else j--;
        if(cmax > max) max = cmax;
      }
        return max;
    }
}
