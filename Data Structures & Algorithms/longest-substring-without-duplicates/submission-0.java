class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 1) return 1;
        if(s.isEmpty()) return 0;
        //ok, so I need to first initialise some variables that I know of atleast
        //ok, so, i know i need "i" and "j", and a I need to convert this into a char... so a 
        // array as well, and a set
        int i = 0, j = 0, n = s.length(), max = 0, cmax = 0;
        char[] chars = s.toCharArray();
        
        //now we convert the string to char...
        
        //now we need to, iterate through the char array.
        for(i = 0; i < n; i++){
            //so i is the start pointer.
            HashSet<Character> set = new HashSet<>(); //so we initialise a new set every time for a 
            //new start. then we have a current max value that we reset to 0 for every new start.
            cmax=0;
            for(j = i; j < n; j++){
                //we are itterating and checking if we already have the element in the set, 
                // eles we just increment the cmax value and proceed.  
                if(set.contains(chars[j])){break;}
                set.add(chars[j]);
                cmax++;
            }
            if(cmax > max){
                max = cmax;
            }
        }
        return max;
    }

}