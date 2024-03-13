class Solution {
    public String reverseStr(String s, int k) {
        char[] charS = s.toCharArray();
        int left = 0;
        int right = 0;
        for(int i = 0; i< charS.length; i+= 2*k){
            if(charS.length-i < k){
                left = i;
                right = charS.length-1;
                while(left < right){
                    char c = charS[left];
                    charS[left] = charS[right];
                    charS[right] = c;
                    left++;
                    right--;
                }
                break;
                
            }
            else {
                    left = i;
                    right = i+k-1;
                    while(left < right){
                        char tmp = charS[left];
                        charS[left] = charS[right];
                        charS[right] = tmp;
                        left++;
                        right--;
                    }
                    
                    
                }

                
        }
        return String.valueOf(charS);
    }
}