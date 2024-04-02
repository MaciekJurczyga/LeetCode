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
    public int getDecimalValue(ListNode head) {
     ListNode revHead = reverse(head);
     int exp = 0;
     int ans = 0;
     while(revHead!=null){
         if(revHead.val == 1){
             ans += Math.pow(2, exp);
         }
         exp++;
         revHead = revHead.next;
     }
        return ans;
    }
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode cur = head;
        while(cur!=null){
            ListNode tmp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = tmp;
        }
    return prev;
    }
}