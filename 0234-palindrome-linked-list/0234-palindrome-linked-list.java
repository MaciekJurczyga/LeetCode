/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
    if(head == null){
        return false;
    }
    ArrayList<Integer> list = new ArrayList<>();
    ListNode cur = head;
    while(cur != null){
        list.add(cur.val);
        cur = cur.next;
    }
    int left = 0;
    int right = list.size()-1;
    while(left<right){
        if(list.get(left)!=list.get(right)){
            return false;
        }
        left++;
        right--;
    }
    return true;
    }
}