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