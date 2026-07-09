# Delete Middle of Linked List

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a singly linked list, delete the  **middle** of the linked list.

Note:

- If there are even nodes, then there would be two middle nodes, we need to delete the second middle element.
- If the input linked list has a single node, then it should return NULL.

 **Examples:** 

```
Input: LinkedList: 1->2->3->4->5
Output: 1->2->4->5
Explanation:

```

```
Input: LinkedList: 2->4->6->7->5->1
Output: 2->4->6->5->1
Explaination:

```

```
Input: LinkedList: 7 
Output: <empty linked list>
Explanation: There was only one node and it was deleted.
```

 **Constraints:** 
1 <= number of nodes <= 105
1 <= node->data <= 109

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-07-09T16:55:51.856Z  

```java
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    public Node deleteMid(Node head) {
        // code here
        if(head == null || head.next == null){
            return null;
        }
        int size = 0;
        Node temp = head;
        while(temp != null){
            size++;
            temp = temp.next;
        }
        // System.out.print(size);
        temp = head;
        int mid = size / 2;
        Node prev = null;
        int idx = 0;
        while(idx < mid){
            prev = temp;
            temp = temp.next;
            idx++;
        }
        prev.next = temp.next;
        return head;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/delete-middle-of-linked-list/1)