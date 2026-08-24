# UPPERBOUND1

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Upper Bound in a Sorted Array

You are given a sorted array of integers $nums$ of size $n$. Your task is to find the  **upper bound**  of an integer $x$.

The  **upper bound**  of $x$ is the  **smallest index**  i such that  **nums[i] > x**. If no such index exists, return $n$ (the size of the array).

### Function Declaration
### Function Name

$upperBound$ – This function finds the upper bound index of a given value in a sorted array.

### Parameters
- $nums$ : A reference to a sorted array of integers.
- $x$ : The integer value whose upper bound is to be found.
### Return Value
- Returns the smallest index $i$ such that $nums[i] > x$
- Returns $n$ if no such index exists
- The answers are taken in 0-based index. So return the value accordingly.
## Constraints
- $1 \leq n \leq 10^5$
- $-10^5 < nums[i], x < 10^5$
- $nums$ is sorted in ascending order
### Input Format
- One line containing an integer $n$
- One line containing $n$ space-separated integers — the sorted array
- One line containing an integer $x$
### Output Format
- Print a single integer — the upper bound index
### Sample 1:
Input
Output

```
6
1 3 5 7 9 11
6
```

```
3
```

### Explanation:

The first element greater than `6` is `7` at index `3`.

### Sample 2:
Input
Output

```
5
2 4 4 4 6
4
```

```
4
```

### Explanation:

The first element greater than `4` is `6` at index `4`.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-24T00:59:08.869Z  

```java
 static int upperBound(int[] nums, int x) {
     //write code here...
     int left = 0;
     int right = nums.length - 1;
     int idx = nums.length;
     while(left < right){
         int mid = left + (right - left)/2;
         if(nums[mid] > x){
             idx = mid;
             right = mid - 1;
         }else {
             left = mid + 1;
         }
     }
     return idx;
 }
```

---

[View on CodeChef](https://www.codechef.com/problems/UPPERBOUND1)