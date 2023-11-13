class Solution {
    public static int lengthOfLastWord(String s) {
    char[] sArray = s.toCharArray();
    int n = sArray.length;
    while (sArray[n-1] == ' '){
        n --;
    }

    int length = 0;
    for (int i = n-1; i>=0; i--){
        if (sArray[i] == ' '){
            break;
        }
        length +=1;
    }
    return length;
    }
    
}