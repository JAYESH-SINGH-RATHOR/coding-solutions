// class Solution {
//     public boolean containsDuplicate(int[] nums) {
//        HashMap<Integer , Integer > map = new HashMap<>();
//        for(int e : nums){
//         if(!map.containsKey(e)){
//             map.put(e , 0);
//         }
//         int freq = map.get(e);
//         map.put(e , freq + 1);
//        }
//        for(int e : map.keySet()){
//         if(map.get(e) > 1){
//             return true;
//         }
//        }
//        return false;
//     }
// }


class Solution {
    public boolean containsDuplicate(int[] nums) {
      Arrays.sort(nums);
      for(int i = 1; i < nums.length; i++){
        if(nums[i] == nums[i - 1]){
            return true;
        }
      }
      return false;
    }
}