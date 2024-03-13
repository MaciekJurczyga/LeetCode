class Solution {
    public boolean isSubsequence(String s, String t) {
       char[] charS = s.toCharArray();
       char[] charT = t.toCharArray();
       int pointer = 0; 
       if(charS.length == 0 ){
           return true;
       }
        if(charT.length == 0 ){
           return false;
       }
        
       for(int i = 0; i< charT.length; i++){
           if(charS[pointer] == charT[i])
           {
               pointer++;
           }
           if(pointer == charS.length) return true;
        
       }
        return false;
    }
}