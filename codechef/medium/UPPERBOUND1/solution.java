 static int upperBound(int[] nums, int x) {
     //write code here...
     int left = 0;
     int right = nums.length - 1;
     int idx = nums.length;
     while(left < right){
         int mid = left + (right - left)/2;
         if(nums[mid] > x){
             idx = mid;
             right = mid - 1;
         }else {
             left = mid + 1;
         }
     }
     return idx;
 }