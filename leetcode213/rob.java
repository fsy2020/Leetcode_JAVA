package leetcode213;

public class rob {
    public static void main(String[] args) {
        int[] nums = {2,3,2};
        int rob = rob(nums);
        System.out.println(rob);
    }

    public static int rob(int[] nums){
        int n = nums.length;
        if(n==0)return 0;
        if(n==1)return nums[0];
        if(n==2)return Math.max(nums[0], nums[1]);
        int n1 = helper(0, nums.length - 2, nums);
        int n2 = helper(1, nums.length-1, nums);

        return Math.max(n1,n2);
    }

    public static int helper(int start,int end,int[] nums){
        int first = nums[start],second = Math.max(nums[start],nums[start+1]);

        for(int i = start+2;i<=end;i++){
            int temp = second;
            second = Math.max(first+nums[i],second);
            first =temp;
        }
        return second;
    }

}
