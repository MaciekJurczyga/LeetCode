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
    public ListNode rotateRight(ListNode head, int k) {
      int len = getLength(head);
      if(len==0){
          return head;
      }
      return recursive(head, k%len);
    }
   public int getLength(ListNode head){
       int len = 0;
       while(head!=null){
           head = head.next;
           len++;
       }
    return len;
   }
   public ListNode recursive(ListNode head, int k){
       if(head==null || head.next==null){
            return head;
        }
        ListNode cur = head;
        if(k==0){
            return head;
        }
        while(cur.next != null && cur.next.next!=null){
            cur = cur.next;
        }
        ListNode tmp = cur.next;
        tmp.next = head;
        cur.next = null;
        return rotateRight(tmp, k-1); 
   }
    
}