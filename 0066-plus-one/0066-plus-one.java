import java.util.Arrays;

class Solution {
    public static int[] plusOne(int[] digits) {
    int n = digits.length;
    digits[n-1] ++;
    while(n>1 && digits[n-1] == 10){
        digits[n-1] =0;
        digits[n-2] += 1;
        n--;
    }
    if (digits[0]== 10){
        int[] newDigits = new int[digits.length+1];
        newDigits[0] = 1;
        newDigits[1] = 0;
        System.arraycopy(digits, 1, newDigits, 2, digits.length-1);
        return newDigits;
    }
    return digits;
    }
    
}