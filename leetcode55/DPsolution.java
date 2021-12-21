package leetcode55;

public class DPsolution {

	public static void main(String[] args) {
		int[] nums = {3,2,1,0,4};
		boolean canJump = canJump(nums);
		System.out.println(canJump);
	}
	
	public static boolean canJump(int [] nums) {
		/*
		 * 自底向上DP，进一步优化动态规划
		 * 
		 * 
		 * 
		 */


		
		int n = nums.length;
		boolean dp[] = new boolean[n];
		for(int i=0;i<n;i++) {
			dp[i] = false;
		}
		dp[n-1]=true;
		for(int i =n-2;i>=0;i--) {
			int fur = Math.min(i+nums[i], n-1);
			for(int j = i+1;j<=fur;j++) {
				if(dp[j]==true) {
					dp[i] = true;
					break;
				}
			}
		}
		return dp[0];
		
		
		//自顶向下DP,就是建立一个动态规划表，对角线都是false，
		//i代表的是横向，从1开始到n-1，j代表纵向，从0到i-1
		//递归关系就是i-j<=nums[j]
		//最后返回表格的最后一项dp[n-1]
		
//		int n = nums.length;
//		boolean [] dp = new boolean[n];
//		for(int i=1;i<n;i++) {
//			dp[i] = false;
//		}
//		
//		dp[0] = true;
//		for(int i = 1;i<n;i++) {
//			for(int j = 0;j<i;j++) {
//				if(dp[j] &&(i-j)<=nums[j]) {
//					dp[i] = true;
//					break;
//				}
//			}
//		}
//		return dp[n-1];
		
		
		
		
	}
}
