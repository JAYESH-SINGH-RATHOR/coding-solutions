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
// class Solution {
//     public ListNode modifiedList(int[] nums, ListNode head) {
//       ListNode dummy = new ListNode(0);
//       dummy.next = head;
//       ListNode curr = dummy;
//       Set<Integer> set = new HashSet<>();
//       for(int e : nums){
//         set.add(e);
//       }
//       while(curr.next != null){
//         if(set.contains(curr.next.val)){
//             curr.next = curr.next.next;
//         }
//        else{
//          curr = curr.next;
//        }
//       }
//       return dummy.next;
//     }
// }

// optimized way // 

class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        // Dummy node to handle head removals
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curr = dummy;

        while (curr.next != null) {
            boolean remove = false;
            // Check if curr.next.val is in nums
            for (int e : nums) {
                if (curr.next.val == e) {
                    remove = true;
                    break;
                }
            }
            if (remove) {
                // Skip the node
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }

        return dummy.next;
    }
}
