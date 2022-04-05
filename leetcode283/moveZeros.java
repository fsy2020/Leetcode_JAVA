package leetcode283;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class moveZeros {
    public static void main(String[] args) {
        int[] nums={5,1,2,5,7};
         moveZeros(nums);
        for(int i :nums){
            System.out.println(i);
        }

    }

    //不用转换成数组，直接赋值就行啦。
    public static void moveZeros(int[] nums){
        List<Integer> list = new ArrayList<>();
        for(int i :nums){
            if(i!=0){
                list.add(i);
            }
        }
        int n  =nums.length;
        int[] ans = new int[n];
        int[] res = list.stream().mapToInt(Integer::valueOf).toArray();
        for(int i = 0;i<res.length;i++){
            ans[i] = res[i];
        }
        for(int i = res.length;i<n;i++){
            ans[i]  =0;
        }
        System.arraycopy(ans,0,nums,0,n);
    }
}
