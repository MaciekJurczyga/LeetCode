class Solution {
    public int climbStairs(int n) {
    if(n==2){
        return 2;
    }
    if(n==1){
        return 1;
    }
        int[] solutions = new int [n+1];
    solutions[n] = 1;
    solutions[n-1] = 1;
    for (int i=n-2; i>=0; i--){
        solutions[i] = solutions[i+1] + solutions[i+2];
    }
    return solutions[0];
    }
}