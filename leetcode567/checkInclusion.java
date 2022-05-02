package leetcode567;

import java.util.HashMap;

public class checkInclusion {
    public static void main(String[] args) {
        String s1 = "eidbaooo";
        String s2 = "ab";
        String s3 = new StringBuilder(s1).reverse().toString();
        boolean contains = s3.contains(s2);
        System.out.println(contains );
    }

    public static boolean checkInclusion2(String s1, String s2){
        return false;
    }

    public static boolean checkInclusion1(String s1, String s2) {
        HashMap<Character,Integer> map = strToMap(s1);
        int index = 0;
        int len1 = s1.length(), len2 = s2.length();
        while(index<=len2-len1){
            if(map.containsKey(s2.charAt(index))){
                String s3 = s2.substring(index,index+len1);
                HashMap<Character,Integer> map2 = strToMap(s3);
                if(map.equals(map2)){
                    return true;
                }
            }
            index++;
        }
        return false;
    }

    public static HashMap<Character,Integer> strToMap(String s1){
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0;i<s1.length();i++){
            map.put(s1.charAt(i),map.getOrDefault(s1.charAt(i),0)+1);
        }
        return map;
    }


}
