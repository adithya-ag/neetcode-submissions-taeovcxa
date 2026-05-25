class Solution {
    public boolean checkInclusion(String s1, String s2) {
                if(s2.length() < s1.length()) return false;
        Map<Character, Integer> s1map = new HashMap<>();
        int n = s1.length();
        for(char c : s1.toCharArray()){
            s1map.put(c,s1map.getOrDefault(c,0) + 1);
        }
        Map<Character, Integer> window = new HashMap<>();
        for(int j = 0; j < n; j++){
                char tem = s2.charAt(j);
                window.put(tem,window.getOrDefault(tem,0) + 1);
        }
        if(window.equals(s1map)) return true;
        for(int i = 1; i + n <= s2.length(); i++){
            char leaving = s2.charAt(i-1);
            char entering = s2.charAt(i+n-1);

            window.put(leaving, window.get(leaving) - 1);
            if(window.get(leaving) == 0){
            window.remove(leaving);
            }
            window.put(entering, window.getOrDefault(entering, 0) + 1);
            
            if(window.equals(s1map)) return true;
        }
        return false;
    }
}
