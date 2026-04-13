class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int i = 0;
        int j = 0;
        for( i = 0; i < nums.length; i++){
          

              int tem = target - nums[i];

            if(map.containsKey(tem)) return new int[] { map.get(tem), i};

              map.put(nums[i],i);
        }

      return new int[] {0,0};
    }
}
