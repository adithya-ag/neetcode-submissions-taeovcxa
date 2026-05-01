class Solution {

    public String encode(List<String> strs) {
        // if(strs.size() == 1 && strs.get(0).isEmpty()) return "";
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < strs.size(); i++){
            String currentString = strs.get(i);
            sb.append(currentString.length()).append("#").append(currentString);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
       // 1. Check for empty string
if (str == null || str.isEmpty()) return new ArrayList<>(); 

List<String> result = new ArrayList<>(); // Use ArrayList, List is just an interface
int i = 0; // Our "pointer" starting at the very beginning

while (i < str.length()) {
    // 2. Find the # starting from our current position i
    int j = str.indexOf("#", i); 
    
    // 3. The number is between i and j
    int len = Integer.parseInt(str.substring(i, j)); 
    
    // 4. The word starts after # (j+1) and is 'len' characters long
    String word = str.substring(j + 1, j + 1 + len);
    result.add(word);
    
    // 5. Jump i to the start of the NEXT number
    i = j + 1 + len; 
}
return result;

        
    }
}
