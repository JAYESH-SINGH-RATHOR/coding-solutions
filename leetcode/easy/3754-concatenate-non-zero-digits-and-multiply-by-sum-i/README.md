# Concatenate Non-Zero Digits and Multiply by Sum I

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given an integer `n`.

Form a new integer `x` by concatenating all the  **non-zero digits**  of `n` in their original order. If there are no  **non-zero**  digits, `x = 0`.

Let `sum` be the  **sum of digits**  in `x`.

Return an integer representing the value of `x * sum`.

 

 **Example 1:** 

 **Input:**  n = 10203004

 **Output:**  12340

 **Explanation:** 

- The non-zero digits are 1, 2, 3, and 4. Thus, x = 1234.
- The sum of digits is sum = 1 + 2 + 3 + 4 = 10.
- Therefore, the answer is x  *sum = 1234*  10 = 12340.

 **Example 2:** 

 **Input:**  n = 1000

 **Output:**  1

 **Explanation:** 

- The non-zero digit is 1, so x = 1 and sum = 1.
- Therefore, the answer is x  *sum = 1*  1 = 1.

 

 **Constraints:** 

- 0 <= n <= 109

## Solution

**Language:** Java  
**Runtime:** 26 ms  
**Memory:** 82.8 MB  
**Submitted:** 2026-07-07T05:49:01.259Z  

```java
class Solution {
    public long sumAndMultiply(int n) {
        if(n <= 0){
            return 0;
        }
        int sum = 0;
        int arr[] = new int [n];
        long mul = 1;
       for(int i = 0; i < n; i++){
            arr[i] = i;
       }
    //    for(int i = 0; i < arr.length; i++){
    //         System.out.print(arr[i] + " ");
    //    }
       for(int i = 1; i < arr.length; i++){
        sum += arr[i];
       }
       System.out.print(sum);
       return sum * mul;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/concatenate-non-zero-digits-and-multiply-by-sum-i/)