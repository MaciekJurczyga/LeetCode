class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> num1 = new ArrayList<>();
        ArrayList<Integer> num2 = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int number:nums1){
            num1.add(number);
        }
        for(int number:nums2){
            num2.add(number);
        }
        for(int num:nums2){
            if(num1.contains(num)){
                ans.add(num);
                num1.remove(num1.indexOf(num));
            }
        }
        int[] answer = new int[ans.size()];
        for( int i=0; i<answer.length; i++){
            answer[i] = ans.get(i);
        }
        
        
        return answer;
    }
}