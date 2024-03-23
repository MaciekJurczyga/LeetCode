class Solution{
public int countNegatives(int[][] grid) {
    int left = 0;
    int right = grid[0].length - 1;
    int ans = 0;

    for (int currentRow = 0; currentRow < grid.length; currentRow++) {
        int firstNegIndex = findNegIndex(grid, left, right, currentRow);
        if (firstNegIndex != -1) {
            ans += (right - firstNegIndex + 1) * (grid.length - currentRow);
            right = firstNegIndex - 1;
        }
    }

    return ans;
}

public int findNegIndex(int[][] grid, int left, int right, int currentRow) {
    int firstNegIndex = -1;
    while (left <= right) {
        int mid = left + (right - left) / 2;
        if (grid[currentRow][mid] < 0) {
            firstNegIndex = mid;
            right = mid - 1;
        } else {
            left = mid + 1;
        }
    }
    return firstNegIndex;
}
}