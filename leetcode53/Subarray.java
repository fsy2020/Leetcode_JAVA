package leetcode53;

public class Subarray {

	//time limit exceeded in leetcode when I use a violent solution (PS)int sum must be in the first loop.
	public static void main(String[] args) {
		int []nums = new int[] {-12,23,1,2,3,4,5,6,-1};
		int res = maxSubArray(nums);
		System.out.println(res);
	}
	
    public static int maxSubArray(int[] nums) {
        int max =0;
        for(int i =0;i<nums.length;i++){
        	int sum = 0;
            for(int k=i;k<nums.length;k++){
            	sum += nums[k];
            	max = Math.max(max,sum);

            }
        }
        return max;
    }
	

}
