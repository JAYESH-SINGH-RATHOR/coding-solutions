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
        System.out.print(map);
        return res;
    }
}