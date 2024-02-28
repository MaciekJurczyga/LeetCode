class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String copyOfS = s;
        char[] sChar = s.toCharArray();       
        int end = sChar.length-1;
        int beg = 0;
        char temp;
        while(end > beg){
            temp = sChar[end];
            sChar[end] = sChar[beg];
            sChar[beg] = temp;
            beg ++;
            end--;
    }
        String revertedString = new String(sChar);
        return revertedString.equals(copyOfS);
        
}
}