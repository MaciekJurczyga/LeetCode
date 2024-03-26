class Solution {
    public int minimumDifference(int[] nums, int k) {
      
     if(nums.length == 1 && k==1){
          return 0;
      }
      int minDiff = Integer.MAX_VALUE;
      Arrays.sort(nums);
      for(int i=0; i<nums.length-k+1; i++){
          int curDiff = nums[i+k-1] - nums[i];
          minDiff = Math.min(curDiff, minDiff);
      }
    return minDiff;
    }
}