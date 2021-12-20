package leetcode53;

public class DPsolution {

	public static void main(String[] args) {
		int []nums = new int[] {-12,23,1,2,3,4,5,6,-1};
		int res = maxSubArray(nums);
		System.out.println(res);
	}
	
	public static int maxSubArray(int[] nums) {
		int n = nums.length;
		int dp[] = new int[n];
		dp[0] = nums[0];
		int max =0;
		for(int i=1;i<n;i++) {
			dp[i] = Math.max(nums[i]+dp[i-1], nums[i]);
			if(dp[i]>max) {
				max = dp[i];
			}
		}
		return max;
		
	}
}
