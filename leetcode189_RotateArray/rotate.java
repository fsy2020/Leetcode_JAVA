package leetcode189_RotateArray;

//数组拷贝的方法：
//System.arraycopy(num1,0,num2,0,n)
/*
示例 1:

输入: nums = [1,2,3,4,5,6,7], k = 3
输出: [5,6,7,1,2,3,4]
解释:
向右轮转 1 步: [7,1,2,3,4,5,6]
向右轮转 2 步: [6,7,1,2,3,4,5]
向右轮转 3 步: [5,6,7,1,2,3,4]
示例 2:

输入：nums = [-1,-100,3,99], k = 2
输出：[3,99,-1,-100]
解释:
向右轮转 1 步: [99,-1,-100,3]
向右轮转 2 步: [3,99,-1,-100]

 */


import java.util.Arrays;

public class rotate {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        rotate(nums,3);


    }

    public static void rotate(int[] nums,int k){
        int n = nums.length;
        int[] res = new int[n];
        for(int i =0;i<n;i++){
            res[(i+k)%n] = nums[i];
        }
        System.arraycopy(res,0,nums,0,n);
    }
}
