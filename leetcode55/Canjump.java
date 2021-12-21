package leetcode55;

public class Canjump {

	public static void main(String[] args) {
		int[] nums = {2,3,1,1,4};
		boolean canJump = canJump(nums);
		System.out.println(canJump);
		
	}
	
	public static boolean canJump(int[] nums) {
		int n = nums.length;
		boolean[] dp = new boolean[n];
		dp[n-1] = true;
		int lasttrue = n-1;
		for(int i=n-2;i>=0;i--) {
			//关键问题就在于这个递归表达式怎么写
			if(i+nums[i]>=lasttrue) {
				lasttrue = i;
				dp[i] = true;
			}
		
		}
		return dp[0];
		
	}
}
