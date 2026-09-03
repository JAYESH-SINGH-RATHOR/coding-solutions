# Delete Nodes From Linked List Present in Array

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given an array of integers `nums` and the `head` of a linked list. Return the `head` of the modified linked list after  **removing**  all nodes from the linked list that have a value that exists in `nums`.

 

 **Example 1:** 

 **Input:**  nums = [1,2,3], head = [1,2,3,4,5]

 **Output:**  [4,5]

 **Explanation:** 

Remove the nodes with values 1, 2, and 3.

 **Example 2:** 

 **Input:**  nums = [1], head = [1,2,1,2,1,2]

 **Output:**  [2,2,2]

 **Explanation:** 

Remove the nodes with value 1.

 **Example 3:** 

 **Input:**  nums = [5], head = [1,2,3,4]

 **Output:**  [1,2,3,4]

 **Explanation:** 

No node has value 5.

 

 **Constraints:** 

- 1 <= nums.length <= 105
- 1 <= nums[i] <= 105
- All elements in nums are unique.
- The number of nodes in the given list is in the range [1, 105].
- 1 <= Node.val <= 105
- The input is generated such that there is at least one node in the linked list that has a value not present in nums.

## Solution

**Language:** Java  
**Runtime:** 0 ms  
**Memory:** 42.1 MB  
**Submitted:** 2026-09-03T05:48:44.901Z  

```java
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

```

---

[View on LeetCode](https://leetcode.com/problems/delete-nodes-from-linked-list-present-in-array/)