# Check if array contains duplicates

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an integer array  **arr[]**, check if the array contains any  **duplicate**  value.

 **Examples:** 

```
Input: arr = [4, 5, 6, 4]
Output: true
Explaination: 4 is the duplicate value.
```

```
Input: arr = [1, 2, 3, 4]
Output: false
Explaination: All values are distinct.
```

 **Constraint:** 
1<=arr.size()<=105
0<=arr[i]<=104

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-28T14:39:00.434Z  

```java
class Solution {
    public boolean checkDuplicates(int arr[]) {
        // Code here
    HashMap<Integer , Integer > map = new HashMap<>();
    for(int e : arr){
        if(!map.containsKey(e)){
            map.put(e , 0);
        }
        int freq = map.get(e);
        map.put(e , freq + 1);
    }
    for(int e : map.keySet()){
        if(map.get(e) > 1){
            return true;
        }
    }
    return false;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/check-if-array-contains-duplicates/1)