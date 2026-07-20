# Rotate a Linked List

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given the  **head**  of a singly linked list, you have to  **left rotate**  the linked list  **k**  times. Return the head of the modified linked list.

 **Examples:** 

```
Input: k = 4,
   
Output: 50 -> 10 -> 20 -> 30 -> 40
Explanation:
Rotate 1: 20 -> 30 -> 40 -> 50 -> 10
Rotate 2: 30 -> 40 -> 50 -> 10 -> 20
Rotate 3: 40 -> 50 -> 10 -> 20 -> 30
Rotate 4: 50 -> 10 -> 20 -> 30 -> 40
   
```

```
Input: k = 6,
   
Output: 30 -> 40 -> 10 -> 20 
   

```

**Constraints:
**1 ≤ number of nodes ≤ 105
0 ≤ k ≤ 109
0 ≤ node.data ≤ 109

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-07-20T08:44:07.664Z  

```java
/*
class Node {
    int data;
    Node next;

    Node(int d){
        data=d;
        next=null;
   }
}
*/

class Solution {
    public Node rotate(Node head, int k) {
        // code here
        Queue<Integer> q = new LinkedList<>();
        Node temp  = head;
        while(temp != null){
            q.add(temp.data);
            temp = temp.next;
        }
        // System.out.print("Q" + q);
        int n = q.size();
        k = k % n;
        int i = 0;
        while(i < k){
            q.add(q.remove());
            i++;
        }
        // System.out.print(q);
        temp = head;
        while(!q.isEmpty()){
            temp.data = q.remove();
            temp = temp.next;
        }
        return head;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/rotate-a-linked-list/1)