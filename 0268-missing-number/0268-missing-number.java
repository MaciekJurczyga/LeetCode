class Solution {
    public int missingNumber(int[] nums) {
    Arrays.sort(nums);
    for(int i=0; i<nums.length -1; i++){
        if(nums[i+1] - nums[i] == 2){
            return nums[i]+1;
        }
    }
    if(nums[0] == 0){
        return nums[nums.length-1] + 1;
    }
    else{
        return 0;
    }
    }
}