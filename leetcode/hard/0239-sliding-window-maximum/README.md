# Sliding Window Maximum

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

You are given an array of integers `nums`, there is a sliding window of size `k` which is moving from the very left of the array to the very right. You can only see the `k` numbers in the window. Each time the sliding window moves right by one position.

Return  *the max sliding window*.

 

 **Example 1:** 

```
Input: nums = [1,3,-1,-3,5,3,6,7], k = 3
Output: [3,3,5,5,6,7]
Explanation: 
Window position                Max
---------------               -----
[1  3  -1] -3  5  3  6  7       3
 1 [3  -1  -3] 5  3  6  7       3
 1  3 [-1  -3  5] 3  6  7       5
 1  3  -1 [-3  5  3] 6  7       5
 1  3  -1  -3 [5  3  6] 7       6
 1  3  -1  -3  5 [3  6  7]      7

```

 **Example 2:** 

```
Input: nums = [1], k = 1
Output: [1]

```

 

 **Constraints:** 

- 1 <= nums.length <= 105
- -104 <= nums[i] <= 104
- 1 <= k <= nums.length

## Solution

**Language:** Java  
**Runtime:** 78 ms (beats 10.10%)  
**Memory:** 158.8 MB (beats 5.03%)  
**Submitted:** 2026-08-31T19:07:42.418Z  

```java
// class Solution {
//     public int[] maxSlidingWindow(int[] nums, int k) {
//         int res[] = new int [nums.length - k  + 1 ];
//         PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
//         int left = 0;
//         int max = Integer.MIN_VALUE;
//         int idx = 0;
//         for(int i = 0; i < nums.length; i++){
//             pq.add(nums[i]);
//             if(i >= k - 1){
//                 res[idx++] = pq.peek();
//                 pq.remove(nums[left]);
//                 left++;
//             }
//         }
//         return res;
//     }
// }

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        int[] res = new int[nums.length - k + 1];

        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> Integer.compare(b[0], a[0])
        );

        int idx = 0;

        for (int i = 0; i < nums.length; i++) {

            pq.offer(new int[]{nums[i], i});

            while (pq.peek()[1] <= i - k) {
                pq.poll();
            }

            if (i >= k - 1) {
                res[idx++] = pq.peek()[0];
            }
        }

        return res;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/sliding-window-maximum/)