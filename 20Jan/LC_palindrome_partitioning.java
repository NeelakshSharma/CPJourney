//https://leetcode.com/problems/palindrome-partitioning/
class Solution {
    public List<List<String>> partition(String s) {
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                if(i==j){
                    dp[i][j] = true;
                }
                else if(i > j){
                    dp[i][j] = false;
                }
                else{
                    if(i+1 == j){
                        dp[i][j] = s.charAt(i) == s.charAt(j);
                    }
                }
            }
        }
        for(int i = n-3; i>=0; i--){
            for(int j = i + 2; j<n; j++){
                dp[i][j] = ((s.charAt(i) == s.charAt(j)) && dp[i+1][j-1]);
                // if((i == 1 && j == 3) || (i == 0 && j == 4)){
                //     System.out.println("i " + i + " and: " + "j: " + j);
                //     System.out.println("dp[i][j]: " + "char check: " + (s.charAt(i) == s.charAt(j)) + "substring check: " + dp[i+1][j-1]);
                //     System.out.println("dp[i][j]: " + dp[i][j]);
                // }
            }
        }
        List<List<String>> res = new ArrayList<>();
        List<String> temp = new ArrayList<>();
        helper(res, temp, dp, s, 0, n);
        return res;
    }

    public static void helper(List<List<String>> res, List<String> temp, boolean[][] dp, String s, int start, int n){
        if(start == n){
            // System.out.println("successful partition..");
            res.add(new ArrayList<>(temp));
            return;
        }

        // System.out.println("checking for string: " + s.substring(start));

        for(int i = start; i<n; i++){
            // System.out.println("start: " + start + ", end: " + i + " substring: " + s.substring(start, i+1) + " dp: " + dp[start][i]);
            if(dp[start][i]){
                temp.add(s.substring(start, i+1));
                helper(res, temp, dp, s, i+1, n);
                temp.remove(temp.size()-1);
            }
        }
    }
}
