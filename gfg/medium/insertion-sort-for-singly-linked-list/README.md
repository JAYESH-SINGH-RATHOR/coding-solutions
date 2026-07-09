# Sort Singly Linked List

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a singly linked list, sort the list in ascending order.

 **Examples:** 

```
Input: head: 30->23->28->30->11->14->19->16->21->25 
Output: 11->14->16->19->21->23->25->28->30->30 
Explanation: The resultant linked list is sorted.

```

```
Input: head: 19->20->16->24->12->29->30 
Output: 12->16->19->20->24->29->30
Explanation: The resultant linked list is sorted.

```

 **Constraints:** 
0 ≤ number of nodes ≤ 103
0 ≤ node->data ≤ 104

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-07-09T17:37:34.203Z  

```java
/* Structure of a Linked List Node
class Node
{
    int data;
    Node next;
    Node(int d) {
       data = d;
       next = null;
    }
}*/
class Solution {
    public Node sortLL(Node head) {
        // code here
        if(head == null || head.next == null){
            return null;
        }
        ArrayList<Integer> list = new ArrayList<>();
        Node temp = head;
        while(temp != null){
            list.add(temp.data);
            temp = temp.next;
        }
        Collections.sort(list);
        temp = head;
        for(int val : list){
            temp.data = val;
            temp = temp.next;
        }
        return head;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/insertion-sort-for-singly-linked-list/1)