class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int maxlen = 0;
        int freq[] = new int[256];
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            freq[s.charAt(i)]++;
            while(freq[ch] > 1){
                freq[s.charAt(left)]--;
                left++;
            }
            maxlen = Math.max(maxlen , i - left + 1);
        }
        return maxlen;
    }
}