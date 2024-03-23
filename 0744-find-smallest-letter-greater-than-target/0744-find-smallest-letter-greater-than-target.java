class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
    int n = letters.length;
    int left = 0;
    int right = n-1;
    if(target>=letters[right] || target<letters[left]){
        return letters[0];
    }
    while(left <= right){
        int mid = left + (right-left)/2;
        if(letters[mid] <= target){
            left = mid+1;
        }
        else{
            right = mid -1;
        }
    }
        return letters[left];
}

}