package leetcode55;

public class Recursive {

	public static void main(String[] args) {
		int[] nums = {2,3,1,1,4,2,3};
		boolean canJump = canJump(nums);
		System.out.println(canJump);
	}
	
	public static boolean canJump(int [] nums) {
		return canJumpto(0,nums);
	}
	
	public static boolean canJumpto(int p,int [] nums) {
		if(p == nums.length-1)return true;
		int fur = Math.min(p+nums[p], nums.length-1);
		
		for(int i=p+1;i<=fur;i++) {
			if(canJumpto(i,nums)) return true;
		}
		return false;	
	}

}
