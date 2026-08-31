// class Solution {
//     public int[] maxSlidingWindow(int[] nums, int k) {
//         int res[] = new int [nums.length - k  + 1 ];
//         PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
//         int left = 0;
//         int max = Integer.MIN_VALUE;
//         int idx = 0;
//         for(int i = 0; i < nums.length; i++){
//             pq.add(nums[i]);
//             if(i >= k - 1){
//                 res[idx++] = pq.peek();
//                 pq.remove(nums[left]);
//                 left++;
//             }
//         }
//         return res;
//     }
// }

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        int[] res = new int[nums.length - k + 1];

        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> Integer.compare(b[0], a[0])
        );

        int idx = 0;

        for (int i = 0; i < nums.length; i++) {

            pq.offer(new int[]{nums[i], i});

            while (pq.peek()[1] <= i - k) {
                pq.poll();
            }

            if (i >= k - 1) {
                res[idx++] = pq.peek()[0];
            }
        }

        return res;
    }
}