
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