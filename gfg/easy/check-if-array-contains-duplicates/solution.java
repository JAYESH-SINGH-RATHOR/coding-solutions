class Solution {
    public boolean checkDuplicates(int arr[]) {
        // Code here
    HashMap<Integer , Integer > map = new HashMap<>();
    for(int e : arr){
        if(!map.containsKey(e)){
            map.put(e , 0);
        }
        int freq = map.get(e);
        map.put(e , freq + 1);
    }
    for(int e : map.keySet()){
        if(map.get(e) > 1){
            return true;
        }
    }
    return false;
    }
}