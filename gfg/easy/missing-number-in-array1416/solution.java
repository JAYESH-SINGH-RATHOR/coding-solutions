class Solution {
    int missingNum(int arr[]) {
        // code here
        long n = arr.length + 1L;
        long exp = n * (n + 1) /2;
        long sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return (int)(exp - sum);
    }
}