class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int ans = 0;
        
        
        Arrays.sort(g);
        Arrays.sort(s);
        
        for(int i = 0; i < g.length; i++) {
            int smallestDiff = Integer.MAX_VALUE;
            int index = -1; 
            
            for(int j = 0; j < s.length; j++) {
                if (g[i] > s[j]) {
                    continue;
                } else {
                    int dif = s[j] - g[i];
                    if (dif < smallestDiff) {
                        smallestDiff = dif;
                        index = j;
                    }
                }
            }
            
            
            if (index != -1) {
                s[index] = 0; 
                ans++;
            }
        }
        return ans;
    }
}
