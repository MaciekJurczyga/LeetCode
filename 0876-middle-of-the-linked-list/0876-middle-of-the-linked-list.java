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
    public ListNode middleNode(ListNode head) {
    int length = getLength(head);
    ListNode cur = head;
    for(int i=0; i<(length/2); i++){
        cur = cur.next;
    }
    return cur;
    }
    
    
    public int getLength(ListNode head){
        int length = 0;
        ListNode cur = head;
        while(cur!=null){
            length++;
            cur = cur.next;
        }
    return length; 
    }
}