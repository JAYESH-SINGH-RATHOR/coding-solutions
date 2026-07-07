# Top K Frequent Words

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array of strings `words` and an integer `k`, return  *the* `k` *most frequent strings*.

Return the answer  **sorted**  by  **the frequency**  from highest to lowest. Sort the words with the same frequency by their  **lexicographical order**.

 

 **Example 1:** 

```
Input: words = ["i","love","leetcode","i","love","coding"], k = 2
Output: ["i","love"]
Explanation: "i" and "love" are the two most frequent words.
Note that "i" comes before "love" due to a lower alphabetical order.

```

 **Example 2:** 

```
Input: words = ["the","day","is","sunny","the","the","the","sunny","is","is"], k = 4
Output: ["the","is","sunny","day"]
Explanation: "the", "is", "sunny" and "day" are the four most frequent words, with the number of occurrence being 4, 3, 2 and 1 respectively.

```

 

 **Constraints:** 

- 1 <= words.length <= 500
- 1 <= words[i].length <= 10
- words[i] consists of lowercase English letters.
- k is in the range [1, The number of unique words[i]]

 

 **Follow-up:**  Could you solve it in `O(n log(k))` time and `O(n)` extra space?

## Solution

**Language:** Java  
**Runtime:** 0 ms  
**Memory:** 42.8 MB  
**Submitted:** 2026-07-07T18:10:01.803Z  

```java
class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        List<String>res = new ArrayList<>();
        HashMap<String , Integer> map = new HashMap<>();
        for(String ch : words){
            if(!map.containsKey(ch)){
                map.put(ch , 0);
            }
            int freq = map.get(ch);
            map.put(ch , freq + 1);
        }
        // System.out.print(map);
        PriorityQueue<String> pq = new PriorityQueue<>();
        for(String ch : map.keySet()){
           pq.add(ch);
           if(pq.size() > k){
            pq.remove(ch);
           }
        }
        while(!pq.isEmpty()){
            res.add(pq.remove());
        }
        // Collections.reverse(res);
        return res;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/top-k-frequent-words/)