package leetcode05;

public class DP1221 {

	public static void main(String[] args) {
		String s = "adfsasf";
		String longestPalindrome = longestPalindrome(s);
		System.out.println(longestPalindrome);

	}
	
	public static String longestPalindrome(String s) {
		//初始化
		int n = s.length();
		boolean[][] dp = new boolean[n][n];
		for(int i = 0;i<n;i++) {
			dp[i][i]=true;
		}
		//填表
		int start=0;
		int max =1;
		for(int j=1;j<n;j++) {
			for(int i=0;i<n;i++) {
				if(s.charAt(i)!=s.charAt(j)) {
					dp[i][j] = false;
				}else {
					if(j-i<3) {
						dp[i][j] = true;
					}else {
						dp[i][j] = dp[i+1][j-1];
					}
				}
				//判断，dp[i][j]是否为真
				if(dp[i][j]&&j-i+1>max) {
					start = i;
					max = j-i+1;
				}
			}
		}
		return s.substring(start,start+max);
		
	}
}
