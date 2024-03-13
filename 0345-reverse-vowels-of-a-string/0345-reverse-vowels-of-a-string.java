class Solution {
    public String reverseVowels(String s) {
       char[] charS = s.toCharArray(); 
        int left = 0;
        int right = charS.length-1;
        while(left < right){
            if(charS[left] == 'a' || charS[left] == 'u' || charS[left] == 'e'|| charS[left] == 'i'|| charS[left] == 'o' ||
              charS[left] == 'A' || charS[left] == 'U' || charS[left] == 'E'|| charS[left] == 'I'|| charS[left] == 'O'){
                if(charS[right] == 'a' || charS[right] == 'u' || charS[right] == 'e'|| charS[right] == 'i'|| charS[right] == 'o' || charS[right] == 'A' || charS[right] == 'U' || charS[right] == 'E'|| charS[right] == 'I'|| charS[right] == 'O'){
                    char temp = charS[right];
                    charS[right] = charS[left];
                    charS[left] = temp;
                    left++;
                    right--;
                }
                else{
                    right--;
                }
                
            }
            else{
                left++;
            }
        }
        return String.valueOf(charS);
    }
}