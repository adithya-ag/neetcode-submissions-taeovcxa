class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int num : nums){
            
            int newcount = map.getOrDefault(num, 0) + 1;
            map.put(num, newcount);

            if(newcount > nums.length / 2) return num;
        }

        return -1;

        
    }
}