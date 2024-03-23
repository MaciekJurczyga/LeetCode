class Solution {
    public int arrangeCoins(int n) {
   long right = n;
   long left = 0;
   while(left <= right){
       long mid = left + (right-left)/2;
       long coinsUsed = mid * (mid+1)/2;
       if(coinsUsed == n){
           return (int)mid;
       }
       if(coinsUsed>n){
           right = mid -1;
       }
       else{
           left = mid+1;
       }
      
   }
    return (int)right;
   }
}