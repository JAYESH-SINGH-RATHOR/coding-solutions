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
        PriorityQueue<String> pq = new PriorityQueue<>(Collections.reverseOrder());
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