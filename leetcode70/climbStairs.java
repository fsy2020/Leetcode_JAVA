package leetcode70;

public class climbStairs {
    public static void main(String[] args) {

    }

    public int climbStairs(int n){
        int[] nums = new int[50];
        nums[0] = 0;
        nums[1] = 1;
        nums[2] = 2;
        for(int i = 3;i<=45;i++){
            nums[i] = nums[i-2]+nums[i-1];
        }
        return nums[n];
    }
}
