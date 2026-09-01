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
    public ListNode removeElements(ListNode head, int val) {
        ListNode curr = head;
        while(head != null && head.val == val){
            head = head.next;
        }
        while(curr != null && curr.next != null){
            if(curr.val == val){
                curr.next = curr.next.next;
            }
            curr = curr.next;
        }
        return head;
    }
}