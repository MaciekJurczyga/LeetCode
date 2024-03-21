class Solution {
    public boolean isPerfectSquare(int num) {
     int left = 0;
     int right = num;
     int mid;
     if(num == 1){
         return true;
     }
     while(left <= right){
         mid = left + (right-left)/2;
         if(mid == num/mid && num%mid == 0){
             return true;
         }
       else if(mid > num/mid){
            right = mid-1;
        } 
       else if(mid < num/mid){
            left = mid+1;
        }
        else{
            return false;
        }
    }
    return false;
    }
}