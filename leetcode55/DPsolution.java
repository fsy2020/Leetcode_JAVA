package leetcode55;

public class DPsolution {

	public static void main(String[] args) {
		int[] nums = {3,2,1,0,4};
		boolean canJump = canJump(nums);
		System.out.println(canJump);
	}
	
	public static boolean canJump(int [] nums) {
		/*
		 * �Ե�����DP����һ���Ż���̬�滮
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
		
		
		//�Զ�����DP,���ǽ���һ����̬�滮���Խ��߶���false��
		//i������Ǻ��򣬴�1��ʼ��n-1��j�������򣬴�0��i-1
		//�ݹ��ϵ����i-j<=nums[j]
		//��󷵻ر������һ��dp[n-1]
		
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
