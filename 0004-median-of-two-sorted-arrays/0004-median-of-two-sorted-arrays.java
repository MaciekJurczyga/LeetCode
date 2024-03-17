class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    if(nums1.length == 0 && nums2.length == 0){
        return 0;
    }
    int[] newArr = new int[nums1.length + nums2.length];
    int i = 0;
    int j = 0;
    int k = 0;
    while(i < nums1.length && j < nums2.length){
        if(nums1[i] > nums2[j]){
            newArr[k] = nums2[j];
            k++;
            j++;
        }
        else{
            newArr[k] = nums1[i];
            k++;
            i++;
        }
    }
    while(i < nums1.length){
        newArr[k++] = nums1[i++];
    }
    while(j < nums2.length){
        newArr[k++] = nums2[j++];
    }
    
    if(newArr.length%2 != 0){
        return (double) newArr[((newArr.length-1)/2)];
    }
        
    return (double) ((double)newArr[(newArr.length/2)-1] + (double)newArr[newArr.length/2])/2;
    }
}