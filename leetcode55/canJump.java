package leetcode55;

/*
    好久之前做过但是忘记了，说明还是不熟悉动态规划和贪心，
 */
public class canJump {
    public static void main(String[] args) {

    }
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int max = 0;
        for(int i = 0;i<n;i++){
            if(i<=max){
                max = Math.max(max,nums[i]+i);
            }
        }
        if(max>=n-1)return true;
        return false;
    }
}
