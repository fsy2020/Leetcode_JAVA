package cp6041;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class intersection {
    //一道都没做出来，寄！
    public static void main(String[] args) {
        int [][] nums = {{3,1,2,4,5},{1,2,3,4},{3,4,5,6}};
        List<Integer> intersection = intersection(nums);
        System.out.println(intersection);
    }

    public static List<Integer> intersection(int[][] nums) {
        List<Integer> res = new ArrayList<>();
        if(nums.length==1){
            for(int i=0;i<nums[0].length;i++){
                res.add(nums[0][i]);
            }
            return res;
        }

        for(int i = 0;i<nums.length-1;i++){
            res = intersection(nums[i], nums[i + 1]);
        }
        Collections.sort(res);
        return res;
    }

    public static List<Integer> intersection(int[] nums1,int []nums2) {
        List<Integer> res = new ArrayList<>();
        HashSet<Integer> hashSet1 = new HashSet<>();
        for(int i = 0;i<nums1.length;i++){
            hashSet1.add(nums1[i]);
        }
        for(int i = 0;i<nums2.length;i++){
            if(hashSet1.contains(nums2[i])){
                res.add(nums2[i]);
            }
        }
        return res;
    }
}
