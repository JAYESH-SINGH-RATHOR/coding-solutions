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
    // public ListNode removeNthFromEnd(ListNode head, int n) {
    //     ListNode temp = head;
    //     int size = 0;

    //     while(temp != null){
    //         temp = temp.next;
    //         size++;
    //     }

    //     if(n == size){
    //         head = head.next;
    //         return head;
    //     }

    //     int itofind = size - n;
    //     ListNode prev = head;
    //     for(int i = 1; i < itofind; i++){
    //         prev = prev.next;
    //     }

    //     prev.next = prev.next.next;
    //     return head;
    // }

    // method 2

    public ListNode removeNthFromEnd(ListNode head, int n) {
       ListNode temp = head;
       int size = 0;
       while(temp != null){
        size++;
        temp = temp.next;
       }
       int target = size - n;
       ListNode dummy = new ListNode(0);
       dummy.next = head;
       temp = dummy;
       for(int i = 0; i < target; i++){
        temp = temp.next;
       }
       temp.next = temp.next.next;
        return dummy.next;
    }
}
