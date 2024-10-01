#include <stdio.h>
#include <stdlib.h>

/* Funkcja do znalezienia pierwszego elementu większego od target */
int findHigherValue(int* nums, int numsSize, int target) {
    int left = 0;
    int right = numsSize - 1;
    int res = -1;
    while (left <= right) {
        int mid = left + (right - left) / 2;
        if (nums[mid] > target) {
            res = mid;
            right = mid - 1;
        } else {
            left = mid + 1;
        }
    }
    return res;
}

/* Funkcja do znalezienia pierwszego elementu mniejszego od target */
int findSmallerValue(int* nums, int numsSize, int target) {
    int left = 0;
    int right = numsSize - 1;
    int res = -1;
    while (left <= right) {
        int mid = left + (right - left) / 2;
        if (nums[mid] < target) {
            res = mid;
            left = mid + 1;
        } else {
            right = mid - 1;
        }
    }
    return res;
}

/* Funkcja do sprawdzenia, czy liczba znajduje się w tablicy */
int isNumberInArray(int* array, int numsSize, int target) {
    int low = 0;
    int high = numsSize - 1;

    while (low <= high) {
        int mid = low + (high - low) / 2;

        if (array[mid] == target) {
            return 1; // true
        } else if (array[mid] < target) {
            low = mid + 1;
        } else {
            high = mid - 1;
        }
    }

    return 0; // false
}

/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* searchRange(int* nums, int numsSize, int target, int* returnSize) {
    int firstGreater = findHigherValue(nums, numsSize, target);
    int firstSmaller = findSmallerValue(nums, numsSize, target);
    int leftAns = 0;
    int rightAns = 0;

    // Jeśli tablica jest pusta
    if (numsSize == 0) {
        *returnSize = 2; // Rozmiar zwracanej tablicy
        int* result = (int*)malloc(2 * sizeof(int));
        result[0] = -1;
        result[1] = -1;
        return result;
    }

    // Jeśli liczba nie znajduje się w tablicy
    if (!isNumberInArray(nums, numsSize, target)) {
        *returnSize = 2; // Rozmiar zwracanej tablicy
        int* result = (int*)malloc(2 * sizeof(int));
        result[0] = -1;
        result[1] = -1;
        return result;
    }

    // Ustalamy lewy indeks
    if (firstSmaller == -1) {
        if (nums[0] == target) {
            leftAns = 0;
        } else {
            leftAns = -1;
        }
    } else {
        leftAns = firstSmaller + 1;
    }

    // Ustalamy prawy indeks
    if (firstGreater == -1) {
        if (nums[numsSize - 1] == target) {
            rightAns = numsSize - 1;
        } else {
            rightAns = -1;
        }
    } else {
        rightAns = firstGreater - 1;
    }

    // Tworzymy wynikową tablicę i zwracamy ją
    *returnSize = 2; // Rozmiar zwracanej tablicy
    int* result = (int*)malloc(2 * sizeof(int));
    result[0] = leftAns;
    result[1] = rightAns;
    return result;
}