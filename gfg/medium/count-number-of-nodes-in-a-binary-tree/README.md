# Size of a Complete  Binary Tree

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given the root of a  **complete**  binary tree. Your task is to find the  **count** of nodes. A complete binary tree is a binary tree whose, all levels except the last one are completely filled, the last level may or may not be completely filled and Nodes in the last level are as left as possible.

 **Note**  : Design an algorithm that runs better than O(n).

 **Example:** 

```
Input: Root of the below tree  

Output: 7
```

```
Input: Root of the below tree  

Output: 5
```

**Constraints:
**0 ≤ N (number of nodes) ≤ 5 * 104
0 ≤ value of nodes ≤ 5 * 104
The tree is guaranteed to be complete.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-05T19:16:38.818Z  

```java
class Solution {

    public int countNodes(Node root) {
        // code here
        if(root == null){
            return 0;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int count = 0;
        while(!q.isEmpty()){
            Node curr = q.remove();
            count++;
            if(curr.left != null){
                q.add(curr.left);
            }
            if(curr.right != null){
                q.add(curr.right);
            }
        }
        return count;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/count-number-of-nodes-in-a-binary-tree/1)