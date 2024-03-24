class Solution {
    public int lengthOfLongestSubstring(String s) {
    
    int biggestSubstring = 0;
    for(int i = 0; i<s.length(); i++){
        String substring = "";
        for(int k=i+1; k<=s.length(); k++){
            if(substring.contains(String.valueOf(s.charAt(k-1)))){
                break;
            }
            else{
                substring = s.substring(i,k);
            }
        } 
        biggestSubstring = Math.max(biggestSubstring, substring.length());
    }
    return biggestSubstring;
    }
}