package leetcode976;

import java.util.Arrays;

public class largestPerimeter {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5,6};
        int i = largestPerimeter(nums);
        System.out.println(i);
    }


    public static int largestPerimeter(int[] nums){
        Arrays.sort(nums);
        for(int i = nums.length-1;i>=2;i--){
            if(isTriangle(nums[i],nums[i-1],nums[i-2]))return nums[i]+nums[i-1]+nums[i-2];

        }
        return 0;
    }

    public static boolean isTriangle(int l1,int l2,int l3){
        if(l1+l2>l3  && l1+l3>l2 && l2+l3>l1)return true;
        return false;
    }
}
