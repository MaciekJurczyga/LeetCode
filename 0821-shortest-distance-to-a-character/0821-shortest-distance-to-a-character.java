class Solution {
    public int[] shortestToChar(String s, char c) {
    ArrayList<Integer> indexesOfChar = new ArrayList<>();
    char[] charS = s.toCharArray();
    for(int i=0; i<charS.length; i++){
        if(c == charS[i]){
            indexesOfChar.add(i);
        }
    }
    int[] ans = new int[charS.length];
    for(int i = 0; i<charS.length; i++){
        int min = Integer.MAX_VALUE;
        for(int index:indexesOfChar){
            if(Math.abs(index-i) < min){
                min = Math.abs(index-i);
            }
        }
        ans[i] = min;
    }
        return ans;
}
}