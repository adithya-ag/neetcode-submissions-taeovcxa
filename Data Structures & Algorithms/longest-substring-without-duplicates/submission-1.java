class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int i = 0;       // left edge of the window
        int max = 0;

        for (int j = 0; j < s.length(); j++) {
            char c = s.charAt(j);

            // If we've seen c before AND that occurrence is inside the window,
            // shrink the window so it starts just after that old occurrence.
            if (map.containsKey(c) && map.get(c) >= i) {
                i = map.get(c) + 1;
            }

            map.put(c, j);                  // record the latest position of c
            max = Math.max(max, j - i + 1); // window length is j - i + 1
        }

        return max;
    }
}