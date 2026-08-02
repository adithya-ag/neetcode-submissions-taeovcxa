class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.isEmpty() || s == null) return true;
        if(t.isEmpty() || t == null) return false;
        int j = 0;
        int i = 0;
        while(i < t.length() && j< s.length()){
            if(t.charAt(i) == s.charAt(j)){
                j++;
            }
            i++;
        }
        if(j == s.length() ) return true;
        return false;
    }
}