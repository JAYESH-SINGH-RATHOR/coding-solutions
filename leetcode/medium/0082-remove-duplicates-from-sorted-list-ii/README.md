# Remove Duplicates from Sorted List II

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given the `head` of a sorted linked list,  *delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list*. Return  *the linked list  **sorted**  as well*.

 

 **Example 1:** 

```
Input: head = [1,2,3,3,4,4,5]
Output: [1,2,5]

```

 **Example 2:** 

```
Input: head = [1,1,1,2,3]
Output: [2,3]

```

 

 **Constraints:** 

- The number of nodes in the list is in the range [0, 300].
- -100 <= Node.val <= 100
- The list is guaranteed to be sorted in ascending order.

## Solution

**Language:** Java  
**Runtime:** 0 ms  
**Memory:** 42.6 MB  
**Submitted:** 2026-09-03T06:16:51.654Z  

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
```

---

[View on LeetCode](https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/)