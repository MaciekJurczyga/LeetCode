/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    ListNode l1 = headA;
    ListNode l2 = headB;
    int list1Length = 0;
    int list2Length = 0;
    while(l1 != null){
        l1 = l1.next;
        list1Length++;
    }
    while(l2 != null){
        l2 = l2.next;
        list2Length++;
    }
    l1 = headA;
    l2 = headB;
    if(list1Length > list2Length){
        for(int i=0; i<list1Length-list2Length; i++){
            l1 = l1.next;
        }
    }
    if(list2Length>list1Length){
        for(int i=0; i<list2Length - list1Length; i++){
            l2 = l2.next;
        }
    }
    while(l1 != null && l2 != null){
        if(l1 == l2){
            return l1;
        }
        else{
            l1 = l1.next;
            l2 = l2.next;
        }
    }  
    
        
    return null;
    }
}