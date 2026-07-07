# Remove Nth Node From End of List

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given the `head` of a linked list, remove the `nth` node from the end of the list and return its head.

 

 **Example 1:** 

```
Input: head = [1,2,3,4,5], n = 2
Output: [1,2,3,5]

```

 **Example 2:** 

```
Input: head = [1], n = 1
Output: []

```

 **Example 3:** 

```
Input: head = [1,2], n = 1
Output: [1]

```

 

 **Constraints:** 

- The number of nodes in the list is sz.
- 1 <= sz <= 30
- 0 <= Node.val <= 100
- 1 <= n <= sz

 

 **Follow up:**  Could you do this in one pass?

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 43.6 MB (beats 39.67%)  
**Submitted:** 2026-07-07T05:10:53.994Z  

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

```

---

[View on LeetCode](https://leetcode.com/problems/remove-nth-node-from-end-of-list/)