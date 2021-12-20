package leetcode05;

public class DPsolution {

	public static void main(String[] args) {

		
	}
	public static String isPalindromic(String s) {
		int n = s.length();
		boolean [][] dp = new boolean[n][n];
		for(int i = 0;i<n;i++) {
			dp[i][i] = true;
		}
		int max = 0;
		int start = 0;
		for(int j=1;j<n;j++) {
			for(int i=0;i<n && i<j;i++) {
				if(s.charAt(i)!=s.charAt(j)) {
					dp[i][j]=false;
				}
				else {
					if(j-i<3) {
						dp[i][j]=true;
					}else {
						dp[i][j] = dp[i+1][j-1];
					}
				}

				if(dp[i][j] && j-i+1>max) {
					start = i;
					max = j-i+1;
				}
			}
		}
		return s.substring(start,start+max);
	}
	
	
}
