# Maximum Length Substring With Two Occurrences

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string `s`, return the  **maximum**  length of a substring such that it contains  *at most two occurrences*  of each character.

 

 **Example 1:** 

 **Input:**  s = "bcbbbcba"

 **Output:**  4

 **Explanation:** 

The following substring has a length of 4 and contains at most two occurrences of each character: `"bcbbbcba"`.

 **Example 2:** 

 **Input:**  s = "aaaa"

 **Output:**  2

 **Explanation:** 

The following substring has a length of 2 and contains at most two occurrences of each character: `"aaaa"`.

 

 **Constraints:** 

- 2 <= s.length <= 100
- s consists only of lowercase English letters.

## Solution

**Language:** Java  
**Runtime:** 4 ms (beats 18.26%)  
**Memory:** 44 MB (beats 37.62%)  
**Submitted:** 2026-08-14T18:29:27.748Z  

```java
class Solution {
    public int maximumLengthSubstring(String s) {
        HashMap<Character ,Integer> map = new HashMap<>();
            int max = 0;
            int left = 0;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(!map.containsKey(ch)){
                map.put(ch , 0);
            }
            int freq = map.get(ch);
            map.put(ch , freq + 1);
            while(map.get(ch) > 2){
               char leftch = s.charAt(left);
               map.put(leftch , map.get(leftch) - 1);
               if(map.get(leftch) ==0){
                map.remove(leftch);
               }
               left++;
            }
            max = Math.max(max , i - left + 1);
        }
        return max;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/maximum-length-substring-with-two-occurrences/)