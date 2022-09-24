class Solution {
    public int uniquePaths(int m, int n) {
        if(m == 1 || n==1) return 1;
        int[][] dp = new int[m][n];
        for(int i = m-1; i>=0; i--){
            for(int j = n-1; j>=0; j--){
                if(i == m-1 && j == n-1)continue;
                if(i == m-1 || j == n-1) dp[i][j] = 1;
                else
                    dp[i][j] = dp[i][j+1] + dp[i+1][j];
            }
        }
        return dp[0][0];
    }
    
    public int uniquePaths(int i, int j, int m, int n, int[][] dp){
        if(i >= m || j >= n) return 0;
        if(dp[i][j] > 0) return dp[i][j];
        return dp[i][j] = uniquePaths(i+1, j, m, n, dp) + uniquePaths(i, j+1, m, n, dp);
    }
}