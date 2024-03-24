class Solution {
    public int countGoodSubstrings(String s) {
    int k = 3;
    int counter=0;
    for(int i=0; i<s.length()-k+1; i++){
        if(s.charAt(i) != s.charAt(i+1) && s.charAt(i) != s.charAt(i+2) && s.charAt(i+1) != s.charAt(i+2)){
            counter++;
        }
    }
    return counter;
    }
}