import java.util.Arrays;
class Solution {
    public static int removeDuplicates(int[] nums) {
        int k = 0;
        int n = nums.length;
        int[] expectedNums = new int[n];
        Arrays.fill(expectedNums, 0);
        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                expectedNums[j] = nums[i];
                j++;
                k++;
            }
        }
        expectedNums[j] = nums[n-1];
        k++;
        for (int i = 0; i < expectedNums.length; i++){
            nums[i] = expectedNums[i];
        }

        return k;
    }

}