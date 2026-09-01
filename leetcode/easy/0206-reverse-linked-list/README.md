# Reverse Linked List

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given the `head` of a singly linked list, reverse the list, and return  *the reversed list*.

 

 **Example 1:** 

```
Input: head = [1,2,3,4,5]
Output: [5,4,3,2,1]

```

 **Example 2:** 

```
Input: head = [1,2]
Output: [2,1]

```

 **Example 3:** 

```
Input: head = []
Output: []

```

 

 **Constraints:** 

- The number of nodes in the list is the range [0, 5000].
- -5000 <= Node.val <= 5000

 

 **Follow up:**  A linked list can be reversed either iteratively or recursively. Could you implement both?

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 44.2 MB (beats 68.41%)  
**Submitted:** 2026-09-01T17:11:59.911Z  

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
```

---

[View on LeetCode](https://leetcode.com/problems/reverse-linked-list/)