class Solution {
    public int findLHS(int[] nums) {
    HashMap<Integer, Integer> map = new HashMap<>();
    ArrayList<Integer> seen = new ArrayList<>();
    int ans = 0;
    for(int num:nums){
        if(map.containsKey(num)){
            map.put(num, map.get(num)+1);
        }
        else{
            map.put(num, 1);
        }
    }
    for(int num:nums){
        int curr = 0;
        if(map.containsKey(num+1) && !seen.contains(num)){
            curr = map.get(num) + map.get(num+1);
            ans = Math.max(curr, ans);
            seen.add(num);
        }
    }
    return ans;
    }
}