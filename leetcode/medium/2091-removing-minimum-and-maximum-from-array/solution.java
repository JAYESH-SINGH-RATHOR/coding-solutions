// class Solution {
//     public int minimumDeletions(int[] nums) {
//         int min = Integer.MAX_VALUE;
//         int max = Integer.MIN_VALUE;
//         int idxMin = 0;
//         int idxMax = 0;
//         int n = nums.length;
//         if(nums.length == 1){
//             return 1;
//         }
//         for(int i = 0; i < nums.length; i++){
//             max = Math.max(max , nums[i]);
//             min = Math.min(min , nums[i]);
//         }
//         for (int i = 0; i < nums.length; i++) {
//             if (nums[i] == min) {
//                 idxMin = i;
//             }

//             if (nums[i] == max) {
//                 idxMax = i;
//             }
//         }
//         int left = Math.max(idxMin, idxMax) + 1;
//         int right = n - Math.min(idxMin, idxMax);
//         int bothSides = Math.min(idxMin, idxMax) + 1
//                       + n - Math.max(idxMin, idxMax);
//         return Math.min(left, Math.min(right, bothSides));
//     }
// }

class Solution {
    public int minimumDeletions(int[] nums) {
        int minIdx = 0;
        int maxIdx = 0;
        int n = nums.length;
        if(nums.length == 1){
            return 1;
        }
        for(int i = 1; i < nums.length; i++){
            if(nums[i] < nums[minIdx]){
                minIdx = i;
            }
            if(nums[i] > nums[maxIdx]){
                maxIdx = i;
            }
        }
         int left = Math.max(minIdx, maxIdx) + 1;

        int right = n - Math.min(minIdx, maxIdx);

        int bothSides = Math.min(minIdx, maxIdx) + 1
                      + n - Math.max(minIdx, maxIdx);

        return Math.min(left, Math.min(right, bothSides));
    }
}