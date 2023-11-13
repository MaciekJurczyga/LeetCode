class Solution {
    public static int strStr(String haystack, String needle) {
    int n = needle.length();
    if (haystack.length() == 1 && needle.length() == 1){
        if (haystack.equals(needle)){
            return 0;
        }
    }
    for (int i = 0; i<haystack.length()-n+1; i++){
        String substring = haystack.substring(i, i+n);
        if (needle.equals(substring)){
            return i;
        }
    }
    return -1;
    }
 
}