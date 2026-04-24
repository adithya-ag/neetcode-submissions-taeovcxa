class Solution {
    public void sortColors(int[] nums) {
        int l =0;
        int m = 0;
        int h = nums.length - 1;
        while(m <= h){
            if(nums[m] == 0){
                swap(nums,m, l);
                l++;
                m++;
            }else if(nums[m] == 1){
                m++;
            }
            else{
                swap(nums, m, h);
                h--;
            }
        }

    }

    public void swap(int[] nums, int c, int u){
        int tem = nums[u];
        nums[u] = nums[c];
        nums[c] = tem;
    }
}