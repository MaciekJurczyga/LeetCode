class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        
        while(n != 1 ){
        set.add(n);
        char[] charInt = Integer.toString(n).toCharArray();
        n = 0;
        for(char c:charInt){
            n += Character.getNumericValue(c) * Character.getNumericValue(c) ; 
        }
        if(set.contains(n)){
            break;
        }
        
        }
        return n==1;
    }
}