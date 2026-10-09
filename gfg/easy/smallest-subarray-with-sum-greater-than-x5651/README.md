# Smallest Subarray Sum Greater Than x

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a number  **x** and an array of integers  **arr**, find the smallest subarray with sum strictly greater than the given value. If such a subarray do not exist return 0 in that case.

 **Examples:** 

```
Input: x = 51, arr[] = [1, 4, 45, 6, 0, 19]
Output: 3
Explanation: Minimum length subarray is [4, 45, 6]
```

```
Input: x = 100, arr[] = [1, 10, 5, 2, 7]
Output: 0
Explanation: No subarray exist
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-09T22:19:08.010Z  

```java
class Solution {
    public static int smallestSubWithSum(int x, int[] arr) {
        // code here
        int sum = 0;
        int left = 0;
        int len = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
            while(sum > x){
                len = Math.min(len , i - left + 1);
                sum -= arr[left];
                left++;
            }
        }
        return len == Integer.MAX_VALUE ? 0 : len;
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/smallest-subarray-with-sum-greater-than-x5651/1)