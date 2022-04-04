package competition6034_triangularSum;

import java.util.Arrays;

public class triangularSum {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int i = triangularSum(nums);
        System.out.println(i);
    }
    public static int triangularSum(int[] nums){
        int len = nums.length;
        if(len==0)return 0;
        if(len==1)return nums[0];
        while(len>1){
            for(int i=0;i<len-1;i++){
                nums[i] = (nums[i] +nums[i+1])%10;
            }
            len--;
        }
        return nums[0];
    }
}
