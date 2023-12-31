class Solution {
    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int  reverse = 0;
        int  num = x;
        while(num!=0){
            int remainder =(num%10);
            reverse = reverse * 10 + remainder;
            num = num/10;
        }
        return (reverse == x);
    }
}