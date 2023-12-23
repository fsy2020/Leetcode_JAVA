package leetcode1;

import java.util.HashMap;
import java.util.Map;

public class Twosum {
    public static int[] twoSum(int[] nums, int target){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                return new int[]{map.get(target-nums[i]),i};
            }
            map.put(nums[i],i);
        }
        return new int[0];
    }
    public static void main(String[] args) {
        int[] re = new int[]{3,6,7,9};
        int target = 13;
        int[] result = twoSum(re, target);
        System.out.printf("%d,%d",result[0],result[1]);
    }

}

