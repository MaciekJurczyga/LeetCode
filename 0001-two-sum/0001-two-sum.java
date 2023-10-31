


import java.util.Arrays;

class Solution {

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length;i++){
            map.put(nums[i],i);
        }
        for(int i=0; i<nums.length;i++){
            int toAdd = target - nums[i];
            if(map.containsKey(toAdd) && map.get(toAdd)!=i){
                return new int[]{i,map.get(toAdd)};
            }
    
    }
        return new int[]{};
    }
}