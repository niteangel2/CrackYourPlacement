class Solution1 { // Recursive
    public int integerBreak(int n) {
        int res = 1;
        for(int i = 1; i < n;i++) {
            int prod = i * Math.max(n-i, integerBreak(n-i));
            res = Math.max(res,prod);
        }
        return res;
    }
}
class Solution2 {// Memoization
    int[] dp = new int[59];
    public int solve(int n) {
        if(n == 1) return 1;
        if(dp[n] != -1) return dp[n];
        int res = Integer.MIN_VALUE;
        for(int i = 1; i < n;i++) {
            int prod = i * Math.max(n-i, integerBreak(n-i));
            res = Math.max(res,prod);
        }
        return dp[n] = res;
    }
    public int integerBreak(int n) {
        Arrays.fill(dp,-1);
        return solve(n);

    }
}
class Solution {
    public int integerBreak(int n) {
        if(n == 2) return 1;
        if(n == 3) return 2;
        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 3;
        for(int i = 4; i <= n;i++) {
            int max = 0;
            for(int j = 1; j <= i/2;j++) {
                max = Math.max(max,dp[j] * dp[i-j]);
            }
            dp[i] = max;
        }
        return dp[n];
    }
}