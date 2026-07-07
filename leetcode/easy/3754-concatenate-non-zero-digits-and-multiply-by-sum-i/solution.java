class Solution {
    public long sumAndMultiply(int n) {
        int sum = 0;
        StringBuilder sb = new StringBuilder();
        if(sb.length() == 0){
            return 0;
        }
        while(n > 0){
            int val = n % 10;
            if(val != 0){
                sb.append(val);
                sum += val;
            }
            n /= 10;
        }
        sb.reverse();
      int x = Integer.parseInt(sb.toString());
        return x * sum;
    }
}