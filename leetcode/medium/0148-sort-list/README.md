# Sort List

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given the `head` of a linked list, return  *the list after sorting it in  **ascending order***.

 

 **Example 1:** 

```
Input: head = [4,2,1,3]
Output: [1,2,3,4]

```

 **Example 2:** 

```
Input: head = [-1,5,3,4,0]
Output: [-1,0,3,4,5]

```

 **Example 3:** 

```
Input: head = []
Output: []

```

 

 **Constraints:** 

- The number of nodes in the list is in the range [0, 5 * 104].
- -105 <= Node.val <= 105

 

 **Follow up:**  Can you sort the linked list in `O(n logn)` time and `O(1)` memory (i.e. constant space)?

## Solution

**Language:** Java  
**Runtime:** 14 ms (beats 23.20%)  
**Memory:** 62.8 MB (beats 16.14%)  
**Submitted:** 2026-07-09T17:43:17.526Z  

```java
// /**
//  * Definition for singly-linked list.
//  * public class ListNode {
//  *     int val;
//  *     ListNode next;
//  *     ListNode() {}
//  *     ListNode(int val) { this.val = val; }
//  *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  * }
//  */
// class Solution {
//     public ListNode sortList(ListNode head) {
//         if (head == null || head.next == null) {
//             return head;
//         }
//         ListNode mid = getMid(head);
//         ListNode left = head;
//         ListNode right = mid.next;
//         mid.next = null;

//         left = sortList(left);
//         right = sortList(right);

//         return merge(left, right);
//     }

//     private ListNode getMid(ListNode head) {
//         ListNode slow = head, fast = head.next;

//         while (fast != null && fast.next != null) {
//             slow = slow.next;
//             fast = fast.next.next;
//         }

//         return slow;
//     }

//     private ListNode merge(ListNode l1, ListNode l2) {
//         ListNode dummy = new ListNode(0), tail = dummy;

//         while (l1 != null && l2 != null) {
//             if (l1.val < l2.val) {
//                 tail.next = l1;
//                 l1 = l1.next;
//             } else {
//                 tail.next = l2;
//                 l2 = l2.next;
//             }
//             tail = tail.next;
//         }

//         tail.next = (l1 != null) ? l1 : l2;
//         return dummy.next;
//     }
// }

public class Solution{
    public ListNode sortList(ListNode head) {
    if (head == null || head.next == null) return head;
    List<Integer> vals = new ArrayList<>();
    ListNode curr = head;
    while (curr != null) {
        vals.add(curr.val);
        curr = curr.next;
    }
    Collections.sort(vals);
    curr = head;
    for (int val : vals) {
        curr.val = val;
        curr = curr.next;
    }

    return head;
}
}
```

---

[View on LeetCode](https://leetcode.com/problems/sort-list/)