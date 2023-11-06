class Solution {
    public static int maxArea(int[] height) {
        int capacity = 0;
        int capacityMax = 0;
        int right = height.length -1;
        int left = 0;
        while (left < right){
           capacity = (right-left) * Math.min(height[left], height[right]);
           capacityMax = Math.max(capacity, capacityMax);
           if (height[left] > height[right]){
               right--;
           }
           else {
               left++;
           }
        }


        return capacityMax;
    }

}