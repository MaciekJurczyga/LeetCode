class Solution {
    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        long  reverse = 0;
        long  num = x;
        while(num!=0){
            int remainder =(int)(num%10);
            reverse = reverse * 10 + remainder;
            num = num/10;
        }
        return (reverse == x);
    }
}