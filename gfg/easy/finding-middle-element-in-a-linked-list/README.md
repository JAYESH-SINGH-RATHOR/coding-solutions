# Middle of a Linked List

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given the  **head** of a linked list, You have to return the value of the  **middle node** of the linked list.

- If the number of nodes is odd, return the middle node value.
- If the number of nodes is even, there are two middle nodes, so return the second middle node value.

 **Examples:** 

```
Input: 
   
Output: 3
Explanation: The given linked list is 1->2->3->4->5 and its middle is 3.
   
```

```
Input:
   
Output: 7 
Explanation: The given linked list is 2->4->6->7->5->1 so, there are two middle node 6 and 7, return the second middle node as 7.
   
```

 **Constraints:** 
1 ≤ no. of nodes ≤ 105
1 ≤ node->data ≤ 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-04T14:37:19.402Z  

```java
/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    int getMiddle(Node head) {
        // code here
        Node fast = head;
        Node slow = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/finding-middle-element-in-a-linked-list/1)