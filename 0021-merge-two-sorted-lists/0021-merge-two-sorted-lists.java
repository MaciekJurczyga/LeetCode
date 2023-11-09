
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode ans = new ListNode(0);
        ListNode cur = ans;
        ListNode p1 = list1;
        ListNode q1 = list2;
        while (p1 != null && q1 != null){
            if (p1.val <= q1.val){
                cur.next = p1;
                p1 = p1.next;
            } else{
                cur.next = q1;
                q1 = q1.next;
            }
            cur = cur.next;
        }
        cur.next = p1 == null ? q1:p1;
        return ans.next;
    }
}