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
    public ListNode deleteDuplicates(ListNode head) {
       Set<Integer> set = new HashSet<>();
       ListNode curr = head;
       while(curr != null){
        set.add(curr.val);
        curr = curr.next;
       }
       System.out.print(set);

       curr = head;
       for(int e : set){
        curr.val = e;
        curr = curr.next;
       }
       return curr;
    }
}