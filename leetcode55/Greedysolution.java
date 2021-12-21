package leetcode55;

public class Greedysolution {

	public static void main(String[] args) {
		int[] nums = {3,2,1,0,4};
		boolean canJump = canJump(nums);
		System.out.println(canJump);

	}
	
	public static boolean canJump(int [] nums) {
		int n = nums.length;
		int last = n-1;
		for(int i = last;i >= 0;i--) {
			if(i+nums[i]>=last) {
				last = i;
			}
		}
		return last ==0;
	}

}
