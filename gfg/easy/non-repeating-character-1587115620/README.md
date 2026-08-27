# Non Repeating Character

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string  **s**  consisting of  **lowercase** English Letters. return the first non-repeating character in  **s**. If there is no non-repeating character, return  **'$'**.

 **Examples:** 

```
Input: s = "geeksforgeeks"
Output: 'f'
Explanation: In the given string, 'f' is the first character in the string which does not repeat.
```

```
Input: s = "racecar"
Output: 'e'
Explanation: In the given string, 'e' is the only character in the string which does not repeat.
```

```
Input: s = "aabbccc"
Output: '$'
Explanation: All the characters in the given string are repeating.
```

 **Constraints:** 
1 ≤ s.size() ≤ 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-27T16:23:26.095Z  

```java

    // optimal appraoch 1 // tc -> O(n) || sc => O(1)
// class Solution {
//     public char nonRepeatingChar(String s) {
//       int arr[] =  new int[26];
//       for(int i = 0; i < s.length(); i++){
//           char ch = s.charAt(i);
//           arr[ch - 'a']++;
//       }
//       for(int i = 0; i < s.length(); i++){
//           char ch = s.charAt(i);
//           if(arr[ch - 'a'] == 1){
//               return ch;
//           }
//       }
//       return '$';
//     }
// }

 // optimal solution 2 using hashmap//tc -> O(n) || sc => O(n)
 
 class Solution {
    public char nonRepeatingChar(String s) {
        HashMap<Character , Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(!map.containsKey(ch)){
                map.put(ch , 0);
            }
            int freq = map.get(ch);
            map.put(ch , freq + 1);
        }
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(map.get(ch) == 1){
                return ch;
            }
        }
        return '$';
    }
     
 }
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/non-repeating-character-1587115620/1)