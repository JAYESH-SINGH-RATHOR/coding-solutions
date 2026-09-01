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

 // bruteforce solution 
// class Solution {
//     public ListNode reverseList(ListNode head) {
//         Stack<Integer> st = new Stack<>();
//         ListNode temp = head;
//         while(temp != null){
//             st.push(temp.val);
//             temp = temp.next;
//         }
//         temp = head;
//         while(temp != null &&!st.isEmpty()){
//             temp.val = st.pop();
//             temp = temp.next;
//         }
//         return head;
//     }
// }


// optimzed solutions // 
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null){
            return head;
        }
        ListNode curr = head;
        ListNode prev = null;
        ListNode next;
        while(curr != null ){
           next = curr.next;
           curr.next = prev;
           prev = curr;
           curr = next;
        }
        return prev;
    }
}