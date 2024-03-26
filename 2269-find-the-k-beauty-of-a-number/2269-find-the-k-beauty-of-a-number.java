class Solution {
    public int divisorSubstrings(int num, int k) {
    int ans = 0;
    char[] charInt = String.valueOf(num).toCharArray();
    for(int i=0; i< charInt.length-k+1; i++){
        if(charInt[i] == 0 && i%k == 0){
            continue;
        }
        char[] subInt = new char[k]; 
        int index = 0;
        for(int j=i; j<i+k; j++){
            subInt[index++] = charInt[j];
        }
        String sub = new String(subInt);
        int divider = Integer.parseInt(sub);
        if(divider == 0){
            continue;
        }
        if(num%divider == 0){
            ans++;
        }
    }
    return ans;
    }
}