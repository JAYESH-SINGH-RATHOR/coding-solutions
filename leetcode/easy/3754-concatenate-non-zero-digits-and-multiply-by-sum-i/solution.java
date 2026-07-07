class Solution {
    public long sumAndMultiply(int n) {
        if(n <= 0){
            return 0;
        }
        int sum = 0;
        int arr[] = new int [n];
        long mul = 1;
       for(int i = 0; i < n; i++){
            arr[i] = i;
       }
    //    for(int i = 0; i < arr.length; i++){
    //         System.out.print(arr[i] + " ");
    //    }
       for(int i = 1; i < arr.length; i++){
        sum += arr[i];
       }
       System.out.print(sum);
       return sum * mul;
    }
}