class Solution {
    public int[] decrypt(int[] code, int k) {
        int[] ans = new int[code.length];
        if(k==0){
            for(int i=0; i<code.length; i++){
                code[i] = 0;
               
            }
         return code;
        }
        if(k>0){
            for(int i = 0; i<code.length; i++){
                for(int j = i+1; j<(i+k+1); j++){
                    if(j>=code.length){
                        ans[i] += code[j-code.length];
                    }
                    else{
                        ans[i] += code[j];
                    }
                }
            }
        }
        if(k<0){
            for(int i = 0; i<code.length; i++){
                for(int j=i-1; j>(i+k-1); j--){
                    if(j<0){
                        ans[i] += code[code.length+j];
                    }
                    else{
                        ans[i] += code[j];
                    }
                }
            }
        }
        return ans;
    }
}