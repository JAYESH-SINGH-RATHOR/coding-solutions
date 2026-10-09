# Longest Substring Without Repeating Characters

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a string `s`, find the length of the  **longest**   **substring**  without duplicate characters.

 

 **Example 1:** 

```
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3. Note that "bca" and "cab" are also correct answers.

```

 **Example 2:** 

```
Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.

```

 **Example 3:** 

```
Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

```

 

 **Constraints:** 

- 0 <= s.length <= 105
- s consists of English letters, digits, symbols and spaces.

## Solution

**Language:** Java  
**Runtime:** 65 ms (beats 51.70%)  
**Memory:** 47.7 MB (beats 87.93%)  
**Submitted:** 2026-10-09T21:58:35.827Z  

```java
// method -> 1 using frequency array with sliding window

// class Solution {
//     public int lengthOfLongestSubstring(String s) {
//         int left = 0;
//         int maxlen = 0;
//         int freq[] = new int[256];
//         for(int i = 0; i < s.length(); i++){
//             char ch = s.charAt(i);
//             freq[s.charAt(i)]++;
//             while(freq[ch] > 1){
//                 freq[s.charAt(left)]--;
//                 left++;
//             }
//             maxlen = Math.max(maxlen , i - left + 1);
//         }
//         return maxlen;
//     }
// }

// method 2 -> using sliding window with using set

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int left = 0;
        int len = 0;
        for(int i = 0; i < n; i++){
            while(set.contains(s.charAt(i))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(i));
            len = Math.max(len , i - left + 1);
        }
        return len;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/longest-substring-without-repeating-characters/)