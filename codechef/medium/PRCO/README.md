# PRCO

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Palindrome Counter

Given a string $S$, determine the total number of  **non-empty palindromic subsequences**  present in it.

A  **subsequence**  is obtained by deleting zero or more characters from the string such that at least one character remains, without changing the relative order of the remaining characters. For example, `"ace"` is a subsequence of `"abcde"`, whereas `"aec"` is not.

A  **palindrome**  is a string that reads the same forwards and backwards. For example, `"aba"`, `"racecar"`, and `"aa"` are palindromes, while `"ab"` is not.

 **Note:**  Two palindromic subsequences are considered different if they are formed using different indices in the original string, even if they produce the same string.

Print the total number of  **non-empty palindromic subsequences**  modulo $10^9 + 7$.

### Input Format
- A single line containing the string $S$.
### Output Format
- Print a single integer — the total number of non-empty palindromic subsequences in $S$, modulo $10^9 + 7$.
### Constraints
- $1 \le |S| \le 1000$
- $S$ consists only of lowercase English letters.
### Sample 1:
Input
Output

```
abcd
```

```
4
```

### Explanation:

The palindromic subsequences are:

- a, b, c, d
### Sample 2:
Input
Output

```
anna
```

```
9
```

### Explanation:

The palindromic subsequences are:

- a, n, n, a, nn, aa, ana, ana, anna

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-07-27T15:01:18.839Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static int count(String s){
        int left = 0; 
        int len = s.length();
        int count = 0;
        int right = s.length() - 1;
        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                return makepalindrome(s , left + 1 , right) || return 
                makepalindrome(s , left , right - 1);
            }else{
                count = Math.max(len , count);
            }
            System.out.print(count);
            return count;
        }
        public static boolean makepalindrome(String s , int left , int right){
            while(left < right){
                if(s.charAt(left) == s.charAt(right)){
                    return true;
                }
            }
            return false;
        }
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
            count(s);
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/PRCO)