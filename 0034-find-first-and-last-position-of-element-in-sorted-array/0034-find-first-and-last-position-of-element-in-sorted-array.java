class Solution {
    public int[] searchRange(int[] nums, int target) {
    int firstGreater = findHigherValue(nums, target);
    int firstSmaller = findSmallerValue(nums, target);
    int leftAns = 0;
    int rightAns = 0;
    if(nums.length == 0){
        int[] result = new int[2];
        result[0] = -1;
        result[1] = -1;
        return result;
    }
    if(!isNumberInArray(nums, target)){
        int[] result = new int[2];
        result[0] = -1;
        result[1] = -1;
        System.gc();
        return result;
    }
    if(firstSmaller == -1){
        if(nums[0] == target){
            leftAns = 0;
        }
        else{
            leftAns = -1;
        }
    }
    else{
        leftAns = firstSmaller + 1;
    }
    if(firstGreater == -1 ){
        if(nums[nums.length-1] == target){
            rightAns = nums.length -1;
        }
        else{
            rightAns = -1;
        }
    }
    else{
        rightAns = firstGreater - 1;
    }
    int[] result = new int[2];
    result[0] = leftAns;
    result[1] = rightAns;
    System.gc();
    return result;

    }
    public int findHigherValue(int[] nums, int target){
        int left = 0;
        int right = nums.length -1;
        int res = -1;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(nums[mid] > target){
                res = mid;
                right = mid -1;
            }
            else{
                left = mid + 1;
            }
        }
        return res;
    }
    public int findSmallerValue(int[] nums, int target){
        int left = 0;
        int right = nums.length -1;
        int res = -1;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(nums[mid] < target){
                res = mid;
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return res;
    }
      public static boolean isNumberInArray(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;


        while (low <= high) {
            int mid = low + (high - low) / 2; 

            if (array[mid] == target) {
                return true;
            } else if (array[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1; 
            }
        }

        return false; 
    }
}