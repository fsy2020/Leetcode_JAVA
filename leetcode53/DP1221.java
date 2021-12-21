package leetcode53;

public class DP1221 {

	public static void main(String[] args) {
		int [] a = {1,2,3,4,-1};
		int listmax = listmax(a);
		System.out.println(listmax);

	}
	
	public static int listmax(int[] s) {
		int max = 0;
		int [] dp = new int[s.length];
		dp[0] = s[0];//≥ı ºªØ
		for(int i = 1;i<s.length;i++) {
			dp[i] = Math.max(dp[i-1]+s[i],dp[i]);
			if(dp[i]>max) {
				max = dp[i];
			}
		}
		return max;
	}
}
