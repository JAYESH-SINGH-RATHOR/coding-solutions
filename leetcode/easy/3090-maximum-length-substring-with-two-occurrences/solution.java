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