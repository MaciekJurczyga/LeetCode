class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2]; // Wynikowa tablica
        result[0] = findFirstOccurrence(nums, target);
        result[1] = findLastOccurrence(nums, target);
        return result;
    }

    // Funkcja do znalezienia indeksu pierwszego wystąpienia target
    private int findFirstOccurrence(int[] nums, int target) {
        int left = 0, right = nums.length - 1, res = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] >= target) { // Używamy >=, aby znaleźć pierwsze wystąpienie
                if (nums[mid] == target) {
                    res = mid; // Znaleziono target
                }
                right = mid - 1; // Szukamy w lewej części
            } else {
                left = mid + 1; // Szukamy w prawej części
            }
        }
        return res;
    }

    // Funkcja do znalezienia indeksu ostatniego wystąpienia target
    private int findLastOccurrence(int[] nums, int target) {
        int left = 0, right = nums.length - 1, res = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] <= target) { // Używamy <=, aby znaleźć ostatnie wystąpienie
                if (nums[mid] == target) {
                    res = mid; // Znaleziono target
                }
                left = mid + 1; // Szukamy w prawej części
            } else {
                right = mid - 1; // Szukamy w lewej części
            }
        }
        return res;
    }
}