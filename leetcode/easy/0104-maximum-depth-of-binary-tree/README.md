# Maximum Depth of Binary Tree

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given the `root` of a binary tree, return  *its maximum depth*.

A binary tree's  **maximum depth**  is the number of nodes along the longest path from the root node down to the farthest leaf node.

 

 **Example 1:** 

```
Input: root = [3,9,20,null,null,15,7]
Output: 3

```

 **Example 2:** 

```
Input: root = [1,null,2]
Output: 2

```

 

 **Constraints:** 

- The number of nodes in the tree is in the range [0, 104].
- -100 <= Node.val <= 100

## Solution

**Language:** Java  
**Runtime:** 0 ms  
**Memory:** 42.7 MB  
**Submitted:** 2026-09-05T18:02:15.750Z  

```java
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null){
            return -1;
        }
        int depth = -1;
        int left = maxDepth(root.left);
        // System.out.println(left);
        int right = maxDepth(root.right);
        // System.out.println(right);

      depth =  Math.max(depth , (left +  right)) + 1;
        return depth;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/maximum-depth-of-binary-tree/)