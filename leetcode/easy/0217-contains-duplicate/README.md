# Contains Duplicate

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an integer array `nums`, return `true` if any value appears  **at least twice**  in the array, and return `false` if every element is distinct.

 

 **Example 1:** 

 **Input:**  nums = [1,2,3,1]

 **Output:**  true

 **Explanation:** 

The element 1 occurs at the indices 0 and 3.

 **Example 2:** 

 **Input:**  nums = [1,2,3,4]

 **Output:**  false

 **Explanation:** 

All elements are distinct.

 **Example 3:** 

 **Input:**  nums = [1,1,1,3,3,4,3,2,4,2]

 **Output:**  true

 

 **Constraints:** 

- 1 <= nums.length <= 105
- -109 <= nums[i] <= 109

## Solution

**Language:** Java  
**Runtime:** 23 ms (beats 31.80%)  
**Memory:** 81.4 MB (beats 89.57%)  
**Submitted:** 2026-08-28T14:15:12.567Z  

```java
// class Solution {
//     public boolean containsDuplicate(int[] nums) {
//        HashMap<Integer , Integer > map = new HashMap<>();
//        for(int e : nums){
//         if(!map.containsKey(e)){
//             map.put(e , 0);
//         }
//         int freq = map.get(e);
//         map.put(e , freq + 1);
//        }
//        for(int e : map.keySet()){
//         if(map.get(e) > 1){
//             return true;
//         }
//        }
//        return false;
//     }
// }


class Solution {
    public boolean containsDuplicate(int[] nums) {
      Arrays.sort(nums);
      for(int i = 1; i < nums.length; i++){
        if(nums[i] == nums[i - 1]){
            return true;
        }
      }
      return false;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/contains-duplicate/)