package cp2215;

import java.util.*;

public class findDifference {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,3};
        int[] nums2 = {1,1,2,2};
        List<List<Integer>> difference = findDifference(nums1, nums2);
        System.out.println(difference);
    }

    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        Set<Integer> set1 = new HashSet();
        Set<Integer> set2 = new HashSet();
        for(int num:nums1){
           set1.add(num);

        }
        for (int num:nums2){
           set2.add(num);
        }
        for(Integer set:set1){
            if(!set2.contains(set)){
                list1.add(set);
            }
        }

        for(Integer set:set2){
            if(!set1.contains(set)){
                list2.add(set);
            }
        }
        ans.add(list1);
        ans.add(list2);
        return ans;
    }
}
