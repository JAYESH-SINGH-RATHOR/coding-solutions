public class Solution {
    public boolean isSubsequence(String s, String t) {
        // dp approach

    //    int n = s.length();
    //    int m = t.length();
    //    int dp[][] = new int[n + 1][m + 1];
    //    if(n == 0 ){
    //     return true;
    //    }
    //    if(m == 0){
    //     return false;
    //    }
    //    for(int i = 1; i <= n; i++){
    //     for(int j = 1; j <= m; j++){
    //         if(s.charAt(i - 1) == t.charAt(j - 1)){
    //             dp[i][j] = 1 + dp[i - 1][j - 1];
    //         }else{
    //             dp[i][j] = Math.max(dp[i - 1][j] , dp[i][j - 1]);
    //         }
    //     }
    //    }
    //    return dp[n][m] == n;

    // using two pointer approach

    int j = 0 , i = 0;
    while(i < s.length() && j < t.length()){
        if(s.charAt(i ) == t.charAt(j )){
            i++;
        }
        j++;
    }
    return i == s.length();
    }
}
